package com.huawei.hms.framework.common;

import java.util.concurrent.Delayed;
import java.util.concurrent.RunnableScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class RunnableScheduledFutureEnhance<T> implements RunnableScheduledFuture<T> {

    /* renamed from: a */
    public RunnableScheduledFuture<T> f7044a;

    /* renamed from: b */
    public String f7045b = Thread.currentThread().getName();

    public RunnableScheduledFutureEnhance(RunnableScheduledFuture<T> runnableScheduledFuture) {
        this.f7044a = runnableScheduledFuture;
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z10) {
        return this.f7044a.cancel(z10);
    }

    @Override // java.lang.Comparable
    public int compareTo(Delayed delayed) {
        return this.f7044a.compareTo(delayed);
    }

    public boolean equals(Object obj) {
        return this.f7044a.equals(obj);
    }

    @Override // java.util.concurrent.Future
    public T get() {
        return this.f7044a.get();
    }

    @Override // java.util.concurrent.Future
    public T get(long j10, TimeUnit timeUnit) {
        return this.f7044a.get(j10, timeUnit);
    }

    @Override // java.util.concurrent.Delayed
    public long getDelay(TimeUnit timeUnit) {
        return this.f7044a.getDelay(timeUnit);
    }

    public String getParentName() {
        return this.f7045b;
    }

    public int hashCode() {
        return this.f7044a.hashCode();
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f7044a.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.f7044a.isDone();
    }

    @Override // java.util.concurrent.RunnableScheduledFuture
    public boolean isPeriodic() {
        return this.f7044a.isPeriodic();
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public void run() {
        this.f7044a.run();
    }
}
