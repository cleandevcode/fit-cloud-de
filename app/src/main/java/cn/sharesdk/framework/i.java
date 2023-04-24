package cn.sharesdk.framework;

import android.app.Activity;
import android.os.Message;
import android.text.TextUtils;
import cn.sharesdk.framework.utils.SSDKLog;
import cn.sharesdk.framework.utils.j;
import com.mob.MobSDK;
import com.mob.commons.eventrecoder.EventRecorder;
import com.mob.tools.network.NetworkHelper;
import com.mob.tools.utils.DH;
import com.mob.tools.utils.Hashon;
import com.mob.tools.utils.ResHelper;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

/* loaded from: classes.dex */
public class i extends cn.sharesdk.framework.utils.f {

    /* renamed from: b */
    private a f5260b;

    /* renamed from: k */
    private boolean f5269k;

    /* renamed from: j */
    private boolean f5268j = true;

    /* renamed from: c */
    private HashMap<String, HashMap<String, String>> f5261c = new HashMap<>();

    /* renamed from: d */
    private ArrayList<Platform> f5262d = new ArrayList<>();

    /* renamed from: e */
    private HashMap<String, Integer> f5263e = new HashMap<>();

    /* renamed from: f */
    private HashMap<Integer, String> f5264f = new HashMap<>();

    /* renamed from: g */
    private HashMap<Integer, CustomPlatform> f5265g = new HashMap<>();

    /* renamed from: h */
    private HashMap<Integer, HashMap<String, Object>> f5266h = new HashMap<>();

    /* renamed from: i */
    private HashMap<Integer, Service> f5267i = new HashMap<>();

    /* loaded from: classes.dex */
    public enum a {
        INITIALIZING,
        READY
    }

    public HashMap<String, Object> a(cn.sharesdk.framework.a.a aVar, HashMap<String, Object> hashMap, String str) {
        try {
            if (hashMap.containsKey("error")) {
                SSDKLog.b().c("ShareSDK parse sns config ==>>", new Hashon().fromHashMap(hashMap));
                return null;
            } else if (!hashMap.containsKey("res")) {
                SSDKLog.b().a("ShareSDK platform config result ==>>", "SNS configuration is empty");
                return null;
            } else {
                String str2 = (String) hashMap.get("res");
                if (str2 == null) {
                    return null;
                }
                return aVar.a(str2, str);
            }
        } catch (Throwable th2) {
            SSDKLog.b().b(th2);
            return null;
        }
    }

    public void a(cn.sharesdk.framework.a.a aVar, ShareSDKCallback<Boolean> shareSDKCallback, String str) {
        Boolean bool;
        try {
            HashMap<String, Object> b10 = aVar.b(str);
            HashMap<String, Object> a10 = a(aVar, b10, str);
            if (a10 == null || a10.size() <= 0) {
                SSDKLog.b().a("d i n");
                if (shareSDKCallback == null) {
                    return;
                }
                bool = Boolean.FALSE;
            } else if (!a(a10)) {
                return;
            } else {
                aVar.a(b10);
                if (shareSDKCallback == null) {
                    return;
                }
                bool = Boolean.TRUE;
            }
            shareSDKCallback.onCallback(bool);
        } catch (Throwable th2) {
            SSDKLog.b().b(th2);
            if (shareSDKCallback != null) {
                shareSDKCallback.onCallback(Boolean.FALSE);
            }
        }
    }

    public boolean a(HashMap<String, Object> hashMap) {
        synchronized (this.f5266h) {
            HashMap<Integer, HashMap<String, Object>> a10 = h.a(hashMap);
            if (a10 == null || a10.size() <= 0) {
                return false;
            }
            this.f5266h.clear();
            this.f5266h = a10;
            return true;
        }
    }

    private void h() {
        synchronized (this.f5261c) {
            this.f5261c.clear();
            XmlPullParserFactory newInstance = XmlPullParserFactory.newInstance();
            newInstance.setNamespaceAware(true);
            XmlPullParser newPullParser = newInstance.newPullParser();
            InputStream inputStream = null;
            try {
                inputStream = MobSDK.getContext().getAssets().open("ShareSDK.xml");
            } catch (Throwable th2) {
                SSDKLog.b().a(th2);
            }
            newPullParser.setInput(inputStream, "utf-8");
            for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.next()) {
                if (eventType == 2) {
                    String name = newPullParser.getName();
                    HashMap<String, String> hashMap = new HashMap<>();
                    int attributeCount = newPullParser.getAttributeCount();
                    for (int i10 = 0; i10 < attributeCount; i10++) {
                        hashMap.put(newPullParser.getAttributeName(i10), newPullParser.getAttributeValue(i10).trim());
                    }
                    this.f5261c.put(name, hashMap);
                }
            }
            inputStream.close();
        }
    }

    public Activity a() {
        return h.b();
    }

    public Platform a(String str) {
        Platform[] d10;
        if (str == null || (d10 = d()) == null) {
            return null;
        }
        for (Platform platform : d10) {
            if (str.equals(platform.getName())) {
                return platform;
            }
        }
        return null;
    }

    public String a(int i10, String str) {
        synchronized (this.f5266h) {
            HashMap<String, Object> hashMap = this.f5266h.get(Integer.valueOf(i10));
            String str2 = null;
            if (hashMap == null) {
                return null;
            }
            Object obj = hashMap.get(str);
            if (obj != null) {
                str2 = String.valueOf(obj);
            }
            return str2;
        }
    }

    public void a(int i10) {
        NetworkHelper.connectionTimeout = i10;
    }

    public void a(int i10, int i11) {
        synchronized (this.f5266h) {
            this.f5266h.put(Integer.valueOf(i11), this.f5266h.get(Integer.valueOf(i10)));
        }
    }

    public void a(int i10, Platform platform) {
        h.a(i10, platform);
    }

    public void a(Activity activity) {
        h.a(activity);
    }

    @Override // cn.sharesdk.framework.utils.f
    public void a(Message message) {
        synchronized (this.f5267i) {
            synchronized (this.f5262d) {
                String checkRecord = EventRecorder.checkRecord(ShareSDK.SDK_TAG);
                if (!TextUtils.isEmpty(checkRecord)) {
                    cn.sharesdk.framework.a.a.a().a((HashMap<String, Object>) null);
                    SSDKLog b10 = SSDKLog.b();
                    b10.a("EventRecorder checkRecord result ==" + checkRecord);
                    g();
                }
                EventRecorder.clear();
                this.f5262d.clear();
                ArrayList<Platform> a10 = h.a();
                if (a10 != null) {
                    this.f5262d.addAll(a10);
                }
                Iterator<Platform> it = this.f5262d.iterator();
                while (it.hasNext()) {
                    Platform next = it.next();
                    this.f5264f.put(Integer.valueOf(next.getPlatformId()), next.getName());
                    this.f5263e.put(next.getName(), Integer.valueOf(next.getPlatformId()));
                }
                h.a(this.f5306a);
                a aVar = a.READY;
                this.f5260b = aVar;
                new Thread() { // from class: cn.sharesdk.framework.i.1
                    @Override // java.lang.Thread, java.lang.Runnable
                    public void run() {
                        i.this.a((ShareSDKCallback<Boolean>) null);
                    }
                }.start();
                this.f5260b = aVar;
                this.f5262d.notify();
                this.f5267i.notify();
            }
        }
    }

    public void a(final ShareSDKCallback<Boolean> shareSDKCallback) {
        if (a.READY == this.f5260b) {
            DH.requester(MobSDK.getContext()).getDeviceKey().request(new DH.DHResponder() { // from class: cn.sharesdk.framework.i.2
                @Override // com.mob.tools.utils.DH.DHResponder
                public void onResponse(DH.DHResponse dHResponse) {
                    try {
                        final String deviceKey = dHResponse.getDeviceKey();
                        boolean z10 = false;
                        if (TextUtils.isEmpty(deviceKey)) {
                            SSDKLog.b().a("dk null", new Object[0]);
                            ShareSDKCallback shareSDKCallback2 = shareSDKCallback;
                            if (shareSDKCallback2 != null) {
                                shareSDKCallback2.onCallback(Boolean.FALSE);
                                return;
                            }
                            return;
                        }
                        final cn.sharesdk.framework.a.a a10 = cn.sharesdk.framework.a.a.a();
                        HashMap a11 = i.this.a(a10, a10.c(), deviceKey);
                        if (a11 != null && a11.size() > 0) {
                            z10 = i.this.a(a11);
                        }
                        if (z10) {
                            j.a(new j.a() { // from class: cn.sharesdk.framework.i.2.1
                                @Override // cn.sharesdk.framework.utils.j.a
                                public void a() {
                                    AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                                    i.this.a(a10, shareSDKCallback, deviceKey);
                                }
                            });
                        } else {
                            i.this.a(a10, shareSDKCallback, deviceKey);
                        }
                    } catch (Throwable th2) {
                        SSDKLog.b().a(th2);
                    }
                }
            });
            return;
        }
        SSDKLog.b().a("Statistics module unopened", new Object[0]);
        if (shareSDKCallback != null) {
            shareSDKCallback.onCallback(Boolean.FALSE);
        }
    }

    public void a(Class<? extends Service> cls) {
        synchronized (this.f5267i) {
            if (this.f5267i.containsKey(Integer.valueOf(cls.hashCode()))) {
                return;
            }
            Service newInstance = cls.newInstance();
            this.f5267i.put(Integer.valueOf(cls.hashCode()), newInstance);
            newInstance.onBind();
        }
    }

    public void a(String str, int i10) {
        h.a(str, i10);
    }

    public void a(String str, String str2) {
        synchronized (this.f5261c) {
            this.f5261c.put(str2, this.f5261c.get(str));
        }
    }

    public void a(String str, HashMap<String, Object> hashMap) {
        synchronized (this.f5261c) {
            HashMap<String, String> hashMap2 = this.f5261c.get(str);
            if (hashMap2 == null) {
                hashMap2 = new HashMap<>();
            }
            synchronized (hashMap2) {
                for (Map.Entry<String, Object> entry : hashMap.entrySet()) {
                    String key = entry.getKey();
                    Object value = entry.getValue();
                    if (value != null) {
                        hashMap2.put(key, String.valueOf(value));
                    }
                }
            }
            this.f5261c.put(str, hashMap2);
        }
        synchronized (this.f5262d) {
            if (this.f5260b == a.INITIALIZING) {
                this.f5262d.wait();
            }
        }
        Iterator<Platform> it = this.f5262d.iterator();
        while (it.hasNext()) {
            Platform next = it.next();
            if (next != null && next.getName().equals(str)) {
                next.a();
                return;
            }
        }
    }

    public void a(String str, boolean z10, int i10, String str2, ShareSDKCallback<String> shareSDKCallback) {
        if (a.READY == this.f5260b) {
            cn.sharesdk.framework.a.a.a().a(str, i10, z10, str2, shareSDKCallback);
        } else if (shareSDKCallback != null) {
            shareSDKCallback.onCallback(str);
        }
    }

    public void a(List<HashMap<String, Object>> list) {
        synchronized (this.f5261c) {
            for (HashMap<String, Object> hashMap : list) {
                String str = null;
                HashMap<String, String> hashMap2 = new HashMap<>();
                for (Map.Entry<String, Object> entry : hashMap.entrySet()) {
                    String key = entry.getKey();
                    Object value = entry.getValue();
                    if (key.equals("platformName")) {
                        str = String.valueOf(entry.getValue());
                    }
                    if (value != null) {
                        hashMap2.put(key, String.valueOf(value));
                    }
                }
                this.f5261c.put(str, hashMap2);
            }
        }
        synchronized (this.f5262d) {
            if (this.f5260b == a.INITIALIZING) {
                this.f5262d.wait();
            }
        }
    }

    public void a(boolean z10) {
        h.a(z10);
    }

    public int b(String str) {
        synchronized (this.f5262d) {
            synchronized (this.f5265g) {
                if (this.f5263e.containsKey(str)) {
                    return this.f5263e.get(str).intValue();
                }
                return 0;
            }
        }
    }

    public String b(String str, String str2) {
        synchronized (this.f5261c) {
            HashMap<String, String> hashMap = this.f5261c.get(str);
            if (hashMap == null) {
                return null;
            }
            return hashMap.get(str2);
        }
    }

    public void b(int i10) {
        NetworkHelper.readTimout = i10;
    }

    @Override // cn.sharesdk.framework.utils.f
    public void b(Message message) {
    }

    public void b(Class<? extends Service> cls) {
        synchronized (this.f5267i) {
            int hashCode = cls.hashCode();
            if (this.f5267i.containsKey(Integer.valueOf(hashCode))) {
                this.f5267i.get(Integer.valueOf(hashCode)).onUnbind();
                this.f5267i.remove(Integer.valueOf(hashCode));
            }
        }
    }

    public void b(boolean z10) {
        this.f5269k = z10;
    }

    public boolean b() {
        return h.c();
    }

    public <T extends Service> T c(Class<T> cls) {
        T cast;
        synchronized (this.f5267i) {
            if (this.f5260b == a.INITIALIZING) {
                this.f5267i.wait();
            }
            cast = cls.cast(this.f5267i.get(Integer.valueOf(cls.hashCode())));
        }
        return cast;
    }

    public String c(int i10) {
        String str;
        synchronized (this.f5262d) {
            synchronized (this.f5265g) {
                str = this.f5264f.get(Integer.valueOf(i10));
            }
        }
        return str;
    }

    @Override // cn.sharesdk.framework.utils.f
    public void c() {
        this.f5260b = a.INITIALIZING;
        SSDKLog.a();
        EventRecorder.prepare();
        h();
        super.c();
    }

    public void d(Class<? extends CustomPlatform> cls) {
        synchronized (this.f5265g) {
            if (this.f5265g.containsKey(Integer.valueOf(cls.hashCode()))) {
                return;
            }
            CustomPlatform newInstance = cls.newInstance();
            this.f5265g.put(Integer.valueOf(cls.hashCode()), newInstance);
            if (newInstance != null && newInstance.b()) {
                this.f5264f.put(Integer.valueOf(newInstance.getPlatformId()), newInstance.getName());
                this.f5263e.put(newInstance.getName(), Integer.valueOf(newInstance.getPlatformId()));
            }
        }
    }

    public Platform[] d() {
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (this.f5262d) {
            if (this.f5260b == a.INITIALIZING) {
                this.f5262d.wait();
            }
        }
        ArrayList arrayList = new ArrayList();
        Iterator<Platform> it = this.f5262d.iterator();
        while (it.hasNext()) {
            Platform next = it.next();
            if (next != null && next.b()) {
                next.a();
                arrayList.add(next);
            }
        }
        h.a(arrayList);
        for (Map.Entry<Integer, CustomPlatform> entry : this.f5265g.entrySet()) {
            CustomPlatform value = entry.getValue();
            if (value != null && value.b()) {
                arrayList.add(value);
            }
        }
        if (arrayList.size() <= 0) {
            return null;
        }
        int size = arrayList.size();
        Platform[] platformArr = new Platform[size];
        for (int i10 = 0; i10 < size; i10++) {
            platformArr[i10] = (Platform) arrayList.get(i10);
        }
        SSDKLog.b().c("sort list use time: %s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
        return platformArr;
    }

    public void e(Class<? extends CustomPlatform> cls) {
        int hashCode = cls.hashCode();
        synchronized (this.f5265g) {
            this.f5265g.remove(Integer.valueOf(hashCode));
        }
    }

    public boolean e() {
        return this.f5269k;
    }

    public boolean f() {
        synchronized (this.f5266h) {
            HashMap<Integer, HashMap<String, Object>> hashMap = this.f5266h;
            return hashMap != null && hashMap.size() > 0;
        }
    }

    public void g() {
        try {
            ResHelper.clearCache(MobSDK.getContext());
        } catch (Throwable th2) {
            SSDKLog.b().b(th2);
        }
    }
}
