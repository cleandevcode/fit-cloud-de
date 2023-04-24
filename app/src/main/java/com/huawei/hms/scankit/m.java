package com.huawei.hms.scankit;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.preference.PreferenceManager;
import com.huawei.hms.scankit.aiscan.common.BarcodeFormat;
import com.huawei.hms.scankit.aiscan.common.EnumC0631d;
import com.huawei.hms.scankit.p.C0657e;
import java.util.Collection;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Map;
import java.util.concurrent.CountDownLatch;

/* loaded from: classes.dex */
public final class m extends Thread {

    /* renamed from: a */
    private Context f7443a;

    /* renamed from: b */
    private final C0657e f7444b;

    /* renamed from: c */
    private final Map<EnumC0631d, Object> f7445c;

    /* renamed from: d */
    private Handler f7446d;

    /* renamed from: e */
    private HandlerC0627a f7447e;

    /* renamed from: g */
    private Rect f7449g;

    /* renamed from: h */
    private boolean f7450h = true;

    /* renamed from: f */
    private final CountDownLatch f7448f = new CountDownLatch(1);

    public m(Context context, C0657e c0657e, HandlerC0627a handlerC0627a, Collection<BarcodeFormat> collection, Map<EnumC0631d, ?> map, String str, com.huawei.hms.scankit.aiscan.common.A a10) {
        this.f7443a = context;
        this.f7444b = c0657e;
        this.f7447e = handlerC0627a;
        EnumMap enumMap = new EnumMap(EnumC0631d.class);
        this.f7445c = enumMap;
        if (map != null) {
            enumMap.putAll(map);
        }
        if (collection == null || collection.isEmpty()) {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
            collection = EnumSet.noneOf(BarcodeFormat.class);
            if (defaultSharedPreferences.getBoolean("preferences_decode_1D_product", true)) {
                collection.addAll(i.f7397a);
            }
            if (defaultSharedPreferences.getBoolean("preferences_decode_1D_industrial", true)) {
                collection.addAll(i.f7398b);
            }
            if (defaultSharedPreferences.getBoolean("preferences_decode_QR", true)) {
                collection.addAll(i.f7400d);
            }
            if (defaultSharedPreferences.getBoolean("preferences_decode_Data_Matrix", true)) {
                collection.addAll(i.f7401e);
            }
            if (defaultSharedPreferences.getBoolean("preferences_decode_Aztec", false)) {
                collection.addAll(i.f7402f);
            }
            if (defaultSharedPreferences.getBoolean("preferences_decode_PDF417", false)) {
                collection.addAll(i.f7403g);
            }
        }
        enumMap.put((EnumMap) EnumC0631d.POSSIBLE_FORMATS, (EnumC0631d) collection);
        if (str != null) {
            enumMap.put((EnumMap) EnumC0631d.CHARACTER_SET, (EnumC0631d) str);
        }
        enumMap.put((EnumMap) EnumC0631d.NEED_RESULT_POINT_CALLBACK, (EnumC0631d) a10);
        com.huawei.hms.scankit.util.a.c("DecodeThread", "Hints: " + enumMap);
    }

    public Handler a() {
        try {
            this.f7448f.await();
        } catch (InterruptedException unused) {
            com.huawei.hms.scankit.util.a.b("exception", "InterruptedException");
        }
        return this.f7446d;
    }

    public void a(Rect rect) {
        this.f7449g = rect;
    }

    public void a(boolean z10) {
        this.f7450h = z10;
    }

    public void b() {
        this.f7443a = null;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        Looper.prepare();
        this.f7446d = new j(this.f7443a, this.f7444b, this.f7447e, this.f7445c, this.f7449g, this.f7450h);
        this.f7448f.countDown();
        Looper.loop();
    }
}
