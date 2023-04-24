package com.mob;

import com.mob.tools.network.NetCommunicator;
import com.mob.tools.proguard.PublicMemberKeeper;
import java.util.HashMap;
import java.util.concurrent.ThreadPoolExecutor;

@Deprecated
/* loaded from: classes.dex */
public final class MobCommunicator implements PublicMemberKeeper {

    /* renamed from: a */
    private NetCommunicator f8187a;

    /* loaded from: classes.dex */
    public static class Callback<T> implements PublicMemberKeeper {
        public void onResultError(Throwable th2) {
        }

        public void onResultOk(T t10) {
        }
    }

    /* loaded from: classes.dex */
    public static class NetworkError extends Exception implements PublicMemberKeeper {
        private static final long serialVersionUID = -8447657431687664787L;

        public NetworkError(String str) {
            super(str);
        }
    }

    public MobCommunicator(int i10, String str, String str2) {
        this.f8187a = new NetCommunicator(i10, str, str2);
    }

    public static HashMap<String, String> getCommonDefaultHeaders() {
        return NetCommunicator.getCommonDefaultHeaders();
    }

    public <T> void request(HashMap<String, Object> hashMap, String str, boolean z10, Callback<T> callback) {
        request(true, null, hashMap, str, z10, callback);
    }

    public <T> void request(HashMap<String, String> hashMap, HashMap<String, Object> hashMap2, String str, boolean z10, Callback<T> callback) {
        request(true, hashMap, hashMap2, str, z10, callback);
    }

    public <T> void request(boolean z10, HashMap<String, String> hashMap, HashMap<String, Object> hashMap2, String str, boolean z11, final Callback<T> callback) {
        if (callback == null) {
            this.f8187a.request(z10, hashMap, hashMap2, str, z11, null);
        } else {
            this.f8187a.request(z10, hashMap, hashMap2, str, z11, new NetCommunicator.Callback<T>() { // from class: com.mob.MobCommunicator.1
                @Override // com.mob.tools.network.NetCommunicator.Callback
                public void onResultError(Throwable th2) {
                    callback.onResultError(th2);
                }

                @Override // com.mob.tools.network.NetCommunicator.Callback
                public void onResultOk(T t10) {
                    callback.onResultOk(t10);
                }
            });
        }
    }

    public <T> T requestSynchronized(String str, String str2, boolean z10) {
        return (T) requestSynchronized((HashMap<String, String>) null, str, str2, z10);
    }

    public <T> T requestSynchronized(HashMap<String, String> hashMap, String str, String str2, boolean z10) {
        return (T) requestSynchronized(true, hashMap, str, str2, z10);
    }

    public <T> T requestSynchronized(HashMap<String, Object> hashMap, String str, boolean z10) {
        return (T) requestSynchronized((HashMap<String, String>) null, hashMap, str, z10);
    }

    public <T> T requestSynchronized(HashMap<String, String> hashMap, HashMap<String, Object> hashMap2, String str, boolean z10) {
        return (T) requestSynchronized(true, hashMap, hashMap2, str, z10);
    }

    public <T> T requestSynchronized(boolean z10, HashMap<String, String> hashMap, String str, String str2, boolean z11) {
        return (T) this.f8187a.requestSynchronized(z10, hashMap, str, str2, z11);
    }

    public <T> T requestSynchronized(boolean z10, HashMap<String, String> hashMap, HashMap<String, Object> hashMap2, String str, boolean z11) {
        return (T) this.f8187a.requestSynchronized(z10, hashMap, hashMap2, str, z11);
    }

    public void setThreadPool(ThreadPoolExecutor threadPoolExecutor) {
        this.f8187a.setThreadPool(threadPoolExecutor);
    }
}
