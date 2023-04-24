package com.mob.tools.utils;

import com.mob.tools.MobLog;
import com.mob.tools.proguard.PublicMemberKeeper;

/* loaded from: classes.dex */
public final class MobPools implements PublicMemberKeeper {

    /* loaded from: classes.dex */
    public interface Pool<T> extends PublicMemberKeeper {
        T acquire();

        boolean release(T t10);
    }

    /* loaded from: classes.dex */
    public static class SimplePool<T> implements Pool<T> {

        /* renamed from: a */
        private final Object[] f9327a;

        /* renamed from: b */
        private int f9328b;

        public SimplePool(int i10) {
            if (i10 <= 0) {
                throw new IllegalArgumentException("The max pool size must be > 0");
            }
            this.f9327a = new Object[i10];
        }

        private boolean a(T t10) {
            for (int i10 = 0; i10 < this.f9328b; i10++) {
                if (this.f9327a[i10] == t10) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.mob.tools.utils.MobPools.Pool
        public T acquire() {
            int i10 = this.f9328b;
            if (i10 > 0) {
                int i11 = i10 - 1;
                try {
                    Object[] objArr = this.f9327a;
                    T t10 = (T) objArr[i11];
                    objArr[i11] = null;
                    this.f9328b = i10 - 1;
                    return t10;
                } catch (Throwable th2) {
                    MobLog.getInstance().d(th2);
                }
            }
            return null;
        }

        @Override // com.mob.tools.utils.MobPools.Pool
        public boolean release(T t10) {
            if (a(t10)) {
                throw new IllegalStateException("Already in the pool!");
            }
            int i10 = this.f9328b;
            Object[] objArr = this.f9327a;
            if (i10 < objArr.length) {
                objArr[i10] = t10;
                this.f9328b = i10 + 1;
                return true;
            }
            return false;
        }
    }

    /* loaded from: classes.dex */
    public static class SynchronizedPool<T> extends SimplePool<T> {

        /* renamed from: a */
        private final Object f9329a;

        public SynchronizedPool(int i10) {
            this(i10, new Object());
        }

        public SynchronizedPool(int i10, Object obj) {
            super(i10);
            this.f9329a = obj;
        }

        @Override // com.mob.tools.utils.MobPools.SimplePool, com.mob.tools.utils.MobPools.Pool
        public T acquire() {
            T t10;
            synchronized (this.f9329a) {
                t10 = (T) super.acquire();
            }
            return t10;
        }

        @Override // com.mob.tools.utils.MobPools.SimplePool, com.mob.tools.utils.MobPools.Pool
        public boolean release(T t10) {
            boolean release;
            synchronized (this.f9329a) {
                release = super.release(t10);
            }
            return release;
        }
    }

    private MobPools() {
    }
}
