package no.nordicsemi.android.dfu;

import android.os.SystemClock;

/* loaded from: classes2.dex */
class DfuProgressInfo {
    private int bytesReceived;
    private int bytesSent;
    private int currentPart;
    private int imageSizeInBytes;
    private int initialBytesSent;
    private int lastBytesSent;
    private long lastProgressTime;
    private final ProgressListener mListener;
    private int maxObjectSizeInBytes;
    private int progress;
    private long timeStart;
    private int totalParts;

    /* loaded from: classes2.dex */
    public interface ProgressListener {
        void updateProgressNotification();
    }

    public DfuProgressInfo(ProgressListener progressListener) {
        this.mListener = progressListener;
    }

    public void addBytesSent(int i10) {
        setBytesSent(this.bytesSent + i10);
    }

    public int getAvailableObjectSizeIsBytes() {
        int i10 = this.imageSizeInBytes;
        int i11 = this.bytesSent;
        int i12 = this.maxObjectSizeInBytes;
        return Math.min(i10 - i11, i12 - (i11 % i12));
    }

    public float getAverageSpeed() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = this.timeStart;
        if (elapsedRealtime - j10 != 0) {
            return (this.bytesSent - this.initialBytesSent) / ((float) (elapsedRealtime - j10));
        }
        return 0.0f;
    }

    public int getBytesReceived() {
        return this.bytesReceived;
    }

    public int getBytesSent() {
        return this.bytesSent;
    }

    public int getCurrentPart() {
        return this.currentPart;
    }

    public int getImageSizeInBytes() {
        return this.imageSizeInBytes;
    }

    public int getProgress() {
        return this.progress;
    }

    public float getSpeed() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        float f10 = elapsedRealtime - this.timeStart != 0 ? (this.bytesSent - this.lastBytesSent) / ((float) (elapsedRealtime - this.lastProgressTime)) : 0.0f;
        this.lastProgressTime = elapsedRealtime;
        this.lastBytesSent = this.bytesSent;
        return f10;
    }

    public int getTotalParts() {
        return this.totalParts;
    }

    public void init(int i10, int i11, int i12) {
        this.imageSizeInBytes = i10;
        this.maxObjectSizeInBytes = Integer.MAX_VALUE;
        this.currentPart = i11;
        this.totalParts = i12;
    }

    public boolean isComplete() {
        return this.bytesSent == this.imageSizeInBytes;
    }

    public boolean isLastPart() {
        return this.currentPart == this.totalParts;
    }

    public boolean isObjectComplete() {
        return this.bytesSent % this.maxObjectSizeInBytes == 0;
    }

    public void setBytesReceived(int i10) {
        this.bytesReceived = i10;
    }

    public void setBytesSent(int i10) {
        if (this.timeStart == 0) {
            this.timeStart = SystemClock.elapsedRealtime();
            this.initialBytesSent = i10;
        }
        this.bytesSent = i10;
        this.progress = (int) ((i10 * 100.0f) / this.imageSizeInBytes);
        this.mListener.updateProgressNotification();
    }

    public void setMaxObjectSizeInBytes(int i10) {
        this.maxObjectSizeInBytes = i10;
    }

    public void setProgress(int i10) {
        this.progress = i10;
        this.mListener.updateProgressNotification();
    }

    public DfuProgressInfo setTotalPart(int i10) {
        this.totalParts = i10;
        return this;
    }
}
