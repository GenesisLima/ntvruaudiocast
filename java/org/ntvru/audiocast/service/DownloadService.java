package org.ntvru.audiocast.service;

import org.ntvru.audiocast.model.FileDocument;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.util.UriComponentsBuilder;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

import java.net.URISyntaxException;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.StreamSupport;

@Service
@Transactional
public class DownloadService {

//    protected final Logger logger = LoggerFactory.getLogger(this.getClass());
//    private static final String WS_TOPIC_WAITINGLIST = "/topic/waiting";
//
//    @Resource SimpMessagingTemplate template;
//    @Resource ItemBusiness itemBusiness;
//    @Resource PodcastServerParameters podcastServerParameters;
//    @Resource WorkerService workerService;
//
//    private Queue<FileDocument> waitingQueue = new ConcurrentLinkedQueue<>();
//    private Map<FileDocument, Downloader> downloadingQueue = new ConcurrentHashMap<>();
//    private AtomicInteger numberOfCurrentDownload = new AtomicInteger(0);
//    private AtomicBoolean isRunning = new AtomicBoolean(false);
//    private Integer limitParallelDownload;
//
//    /* GETTER & SETTER */
//    public int getLimitParallelDownload() {
//        return podcastServerParameters.concurrentDownload();
//    }
//
//    public void changeLimitParallelsDownload(Integer limitParallelDownload) {
//
//        boolean addToDownloadList = limitParallelDownload < getLimitParallelDownload();
//
//        this.limitParallelDownload = limitParallelDownload;
//
//        if (addToDownloadList && !isRunning.get())
//            manageDownload();
//    }
//
//    public DownloadService() {
//    }
//
//    public Queue<Item> getWaitingQueue() {
//        return waitingQueue;
//    }
//
//    public Map<Item, Downloader> getDownloadingQueue() {
//        return downloadingQueue;
//    }
//
//    public DownloadService(Queue<Item> waitingQueue) {
//        this.waitingQueue = waitingQueue;
//    }
//
//    public int getNumberOfCurrentDownload() {
//        return numberOfCurrentDownload.get();
//    }
//
///*
//    public void setNumberOfCurrentDownload(int numberOfCurrentDownload) {
//        this.numberOfCurrentDownload.set(numberOfCurrentDownload);
//    }
//*/
//
//    public String getRootfolder() {
//        return podcastServerParameters.getRootfolder();
//    }
//    
//    /* METHODS */
//    private void manageDownload() {
//
//        if (!isRunning.get()) {
//            isRunning.set(true);
//            Item currentItem = null;
//
//            while (downloadingQueue.size() < this.limitParallelDownload && !waitingQueue.isEmpty()) {
//                currentItem = this.getWaitingQueue().poll();
//                if ( !"Started".equals(currentItem.getStatus()) && !"Finish".equals(currentItem.getStatus()) ) {
//                     getDownloaderByTypeAndRun(currentItem);
//                }
//            }
//            isRunning.set(false);
//        }
//        this.convertAndSendWaitingQueue();
//    }
//
//    private void initDownload() {
//        StreamSupport.stream(itemBusiness.findAllToDownload().spliterator(), false)
//                .filter(item -> !waitingQueue.contains(item))
//                .forEach(waitingQueue::add);
//    }
//
//    public void launchDownload() {
//        this.initDownload();
//        this.manageDownload();
//    }
//
//
//    // Change status of all downloads :
//    public void stopAllDownload() {
//        downloadingQueue.values().forEach(Downloader::stopDownload);
//    }
//
//    public void pauseAllDownload() {
//        downloadingQueue.values().forEach(Downloader::pauseDownload);
//    }
//
//    public void restartAllDownload() {
//        downloadingQueue.values()
//                .stream()
//                .filter(downloader -> downloader.getItem().getStatus().equals("Paused"))
//                .forEach(downloader -> getDownloaderByTypeAndRun(downloader.getItem()));
//    }
//
//    // Change State of id identified download
//    public void stopDownload(int id) {
//        downloadingQueue.get(getItemInDownloadingQueue(id)).stopDownload();
//    }
//
//    public void pauseDownload(int id) {
//        Item item = getItemInDownloadingQueue(id);
//        downloadingQueue.get(item).pauseDownload();
//    }
//
//    public void restartDownload(int id) {
//        getDownloaderByTypeAndRun(downloadingQueue.get(getItemInDownloadingQueue(id)).getItem());
//    }
//
//    public void toogleDownload(int id) {
//        Item item = getItemInDownloadingQueue(id);
//        if (item.getStatus().equals("Paused")) {
//            logger.debug("restart du download");
//            restartDownload(id);
//        } else if (item.getStatus().equals("Started")) {
//            logger.debug("pause du download");
//            pauseDownload(id);
//        }
//    }
//
//    public void addItemToQueue(int id) {
//        this.addItemToQueue(itemBusiness.findOne(id));
//        //this.convertAndSendWaitingQueue();
//    }
//
//    public void addItemToQueue(Item item) {
//
//        if (waitingQueue.contains(item) || downloadingQueue.containsKey(item))
//            return;
//
//        waitingQueue.add(item);
//        manageDownload();
//    }
//
//    public void removeItemFromQueue(int id, Boolean stopItem) {
//        Item item = itemBusiness.findOne(id);
//        this.removeItemFromQueue(item);
//
//        if (stopItem)
//            itemBusiness.save(item.setStatus("Stopped"));
//
//        this.convertAndSendWaitingQueue();
//    }
//
//    public void removeItemFromQueue(Item item) {
//        waitingQueue.remove(item);
//    }
//
//
//    /* Helpers */
//    public void addACurrentDownload() {
//        this.numberOfCurrentDownload.incrementAndGet();
//    }
//
//    public void removeACurrentDownload(Item item) {
//        this.numberOfCurrentDownload.decrementAndGet();
//        this.downloadingQueue.remove(item);
//        if (!isRunning.get())
//            manageDownload();
//    }
//
//    public Item getItemInDownloadingQueue(int id) {
//        return downloadingQueue.keySet()
//                .stream()
//                .filter(item -> Objects.equals(item.getId(), id))
//                .findFirst()
//                .get();
//    }
//
//    private void getDownloaderByTypeAndRun(Item item) {
//        if (downloadingQueue.containsKey(item)) { // Cas ou le Worker se met en pause et reste en m�moire // dans la DownloadingQueue
//            Downloader downloader = downloadingQueue.get(item);
//            downloader.startDownload();
//        } else { // Cas ou le Worker se coupe pour la pause et n�cessite un relancement
//            Downloader worker = workerService.getDownloaderByType(item);
//
//            if (worker != null) {
//                this.getDownloadingQueue().put(item, worker);
//                new Thread((Runnable) worker).start();
//            }
//        }
//    }
//
//    public void resetDownload(Item item) {
//        if (downloadingQueue.containsKey(item) && canBeReseted(item)) {
//            item.addATry();
//            Downloader worker = workerService.getDownloaderByType(item);
//            if (worker != null) {
//                this.getDownloadingQueue().put(item, worker);
//                new Thread((Runnable) worker).start();
//            }
//        }
//    }
//
//    public void removeItemFromQueueAndDownload(Item itemToDelete) {
//        //* Si le t�l�chargement est en cours ou en attente : *//
//        if (this.getDownloadingQueue().containsKey(itemToDelete)) {
//            this.stopDownload(itemToDelete.getId());
//        } else if (this.getWaitingQueue().contains(itemToDelete)) {
//            this.removeItemFromQueue(itemToDelete);
//        }
//        this.convertAndSendWaitingQueue();
//    }
//
//    protected void convertAndSendWaitingQueue() {
//        this.template.convertAndSend(WS_TOPIC_WAITINGLIST, this.waitingQueue);
//    }
//
//
//    public boolean canBeReseted(Item item) {
//        return item.getNumberOfTry()+1 <= podcastServerParameters.numberOfTry();
//    }
//
//    public Boolean isInDownloadingQueue(Item item) {
//        return downloadingQueue.containsKey(item);
//    }
//
//    public Set<Item> getItemInDownloadingQueue() {
//        return downloadingQueue.keySet();
//    }
//
//    public void moveItemInQueue(Integer itemId, Integer position) {
//        List<Item> copyOfWaitingList = Arrays.asList(waitingQueue.toArray(new Item[waitingQueue.size()]));
//        List<Item> aItemList = new ArrayList<>();
//
//        copyOfWaitingList.stream().forEach(aItemList::add);
//        
//        Optional<Item> movingItem = aItemList.stream()
//                .filter(item -> item.getId().equals(itemId)).findFirst();
//
//        if (!movingItem.isPresent()) {
//            logger.error("Moving element in waiting list not authorized : Element wasn't in the list");
//            return;
//        }
//
//        aItemList.removeIf(item -> item.getId().equals(itemId));
//        aItemList.add(position, movingItem.get());
//        
//        waitingQueue.clear();
//        waitingQueue.addAll(aItemList);
//
//        convertAndSendWaitingQueue();
//    }
//    
//    @PostConstruct
//    public void postConstruct() throws URISyntaxException {
//        Item.fileContainer = UriComponentsBuilder.fromUri(podcastServerParameters.fileContainer()).build().toUriString();
//        Item.rootFolder = podcastServerParameters.rootFolder();
//        limitParallelDownload = podcastServerParameters.concurrentDownload();
//    }
}
