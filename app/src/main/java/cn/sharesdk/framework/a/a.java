package cn.sharesdk.framework.a;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Base64;
import cn.sharesdk.framework.InnerShareParams;
import cn.sharesdk.framework.ShareSDKCallback;
import cn.sharesdk.framework.a.a.e;
import cn.sharesdk.framework.a.b.f;
import cn.sharesdk.framework.utils.SSDKLog;
import com.mob.MobSDK;
import com.mob.tools.utils.BitmapHelper;
import com.mob.tools.utils.DH;
import com.mob.tools.utils.Data;
import com.mob.tools.utils.ResHelper;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import no.nordicsemi.android.dfu.DfuBaseService;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a */
    private static a f5088a;

    /* renamed from: d */
    private boolean f5091d = true;

    /* renamed from: b */
    private c f5089b = new c();

    /* renamed from: c */
    private e f5090c = e.a();

    private a() {
    }

    public static a a() {
        if (f5088a == null) {
            f5088a = new a();
        }
        return f5088a;
    }

    private String a(String str, String str2, int i10, String str3, HashMap<String, String> hashMap) {
        HashMap<String, Object> a10;
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        ArrayList<String> arrayList = new ArrayList<>();
        Pattern compile = Pattern.compile(str2);
        Matcher matcher = compile.matcher(str);
        while (matcher.find()) {
            String group = matcher.group();
            if (group != null && group.length() > 0) {
                arrayList.add(group);
            }
        }
        if (arrayList.size() != 0 && (a10 = this.f5089b.a(str, arrayList, i10, str3, hashMap)) != null && a10.size() > 0 && a10.containsKey("data")) {
            HashMap hashMap2 = new HashMap();
            Iterator it = ((ArrayList) a10.get("data")).iterator();
            while (it.hasNext()) {
                HashMap hashMap3 = (HashMap) it.next();
                hashMap2.put(String.valueOf(hashMap3.get("source")), String.valueOf(hashMap3.get("surl")));
            }
            Matcher matcher2 = compile.matcher(str);
            StringBuilder sb2 = new StringBuilder();
            int i11 = 0;
            while (matcher2.find()) {
                sb2.append(str.substring(i11, matcher2.start()));
                sb2.append((String) hashMap2.get(matcher2.group()));
                i11 = matcher2.end();
            }
            sb2.append(str.substring(i11, str.length()));
            String sb3 = sb2.toString();
            SSDKLog.b().c("> SERVER_SHORT_LINK_URL content after replace link ===  %s", sb3);
            return sb3;
        }
        return str;
    }

    private void a(cn.sharesdk.framework.a.b.b bVar) {
        String str;
        boolean d10 = this.f5090c.d();
        String str2 = bVar.f5123c;
        if (!d10 || TextUtils.isEmpty(str2)) {
            str = null;
            bVar.f5124d = null;
        } else {
            str = Data.Base64AES(str2, bVar.f5126f.substring(0, 16));
        }
        bVar.f5123c = str;
    }

    private void a(final f fVar) {
        ArrayList<Bitmap> arrayList;
        int f10 = this.f5090c.f();
        boolean d10 = this.f5090c.d();
        final f.a aVar = fVar.f5146d;
        if (!d10) {
            fVar.f5147m = null;
        }
        if (f10 == 1) {
            ArrayList arrayList2 = (aVar == null || aVar.f5153e == null) ? new ArrayList(aVar.f5153e) : new ArrayList();
            int size = (aVar == null || (arrayList = aVar.f5154f) == null) ? 0 : arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                Bitmap bitmap = aVar.f5154f.get(i10);
                try {
                    File createTempFile = File.createTempFile("bm_tmp", ".png");
                    FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
                    bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
                    fileOutputStream.flush();
                    fileOutputStream.close();
                    arrayList2.add(createTempFile.getAbsolutePath());
                } catch (Throwable th2) {
                    SSDKLog.b().a(cn.sharesdk.facebook.e.a("bit", th2), new Object[0]);
                }
            }
            if (arrayList2.size() > 0) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    a((String) it.next(), b.FINISH_SHARE, new ShareSDKCallback<String>() { // from class: cn.sharesdk.framework.a.a.3
                        @Override // cn.sharesdk.framework.ShareSDKCallback
                        /* renamed from: a */
                        public void onCallback(String str) {
                            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str)) {
                                return;
                            }
                            aVar.f5152d.add(str);
                            a.this.b(fVar);
                        }
                    });
                }
                return;
            }
        } else {
            fVar.f5146d = null;
        }
        b(fVar);
    }

    private void a(final String str, final ShareSDKCallback<String> shareSDKCallback) {
        DH.requester(MobSDK.getContext()).getNetworkType().request(new DH.DHResponder() { // from class: cn.sharesdk.framework.a.a.4
            @Override // com.mob.tools.utils.DH.DHResponder
            public void onResponse(DH.DHResponse dHResponse) {
                try {
                    String networkType = dHResponse.getNetworkType();
                    if (!"none".equals(networkType) && !TextUtils.isEmpty(networkType)) {
                        HashMap<String, Object> c10 = a.this.f5089b.c(str);
                        if (c10 != null && c10.size() > 0) {
                            if (!c10.containsKey("status")) {
                                ShareSDKCallback shareSDKCallback2 = shareSDKCallback;
                                if (shareSDKCallback2 != null) {
                                    shareSDKCallback2.onCallback(null);
                                    return;
                                }
                                return;
                            } else if (ResHelper.parseInt(String.valueOf(c10.get("status"))) != 200) {
                                ShareSDKCallback shareSDKCallback3 = shareSDKCallback;
                                if (shareSDKCallback3 != null) {
                                    shareSDKCallback3.onCallback(null);
                                    return;
                                }
                                return;
                            } else {
                                String str2 = c10.containsKey(InnerShareParams.URL) ? (String) c10.get(InnerShareParams.URL) : null;
                                ShareSDKCallback shareSDKCallback4 = shareSDKCallback;
                                if (shareSDKCallback4 != null) {
                                    shareSDKCallback4.onCallback(str2);
                                    return;
                                }
                                return;
                            }
                        }
                        ShareSDKCallback shareSDKCallback5 = shareSDKCallback;
                        if (shareSDKCallback5 != null) {
                            shareSDKCallback5.onCallback(null);
                            return;
                        }
                        return;
                    }
                    ShareSDKCallback shareSDKCallback6 = shareSDKCallback;
                    if (shareSDKCallback6 != null) {
                        shareSDKCallback6.onCallback(null);
                    }
                } catch (Throwable unused) {
                    SSDKLog.b().a("up fi", new Object[0]);
                    ShareSDKCallback shareSDKCallback7 = shareSDKCallback;
                    if (shareSDKCallback7 != null) {
                        shareSDKCallback7.onCallback(null);
                    }
                }
            }
        });
    }

    private void a(final String str, String str2, int i10, String str3, final ShareSDKCallback<String> shareSDKCallback) {
        ArrayList<String> arrayList = new ArrayList<>();
        final Pattern compile = Pattern.compile(str2);
        Matcher matcher = compile.matcher(str);
        while (matcher.find()) {
            String group = matcher.group();
            if (group != null && group.length() > 0) {
                arrayList.add(group);
            }
        }
        if (arrayList.size() == 0 && shareSDKCallback != null) {
            shareSDKCallback.onCallback(str);
        }
        this.f5089b.a(str, arrayList, i10, str3, new ShareSDKCallback<HashMap<String, Object>>() { // from class: cn.sharesdk.framework.a.a.5
            @Override // cn.sharesdk.framework.ShareSDKCallback
            /* renamed from: a */
            public void onCallback(HashMap<String, Object> hashMap) {
                if (hashMap == null || hashMap.size() <= 0 || !hashMap.containsKey("data")) {
                    shareSDKCallback.onCallback(str);
                    return;
                }
                HashMap hashMap2 = new HashMap();
                Iterator it = ((ArrayList) hashMap.get("data")).iterator();
                while (it.hasNext()) {
                    HashMap hashMap3 = (HashMap) it.next();
                    hashMap2.put(String.valueOf(hashMap3.get("source")), String.valueOf(hashMap3.get("surl")));
                }
                Matcher matcher2 = compile.matcher(str);
                StringBuilder sb2 = new StringBuilder();
                int i11 = 0;
                while (matcher2.find()) {
                    sb2.append(str.substring(i11, matcher2.start()));
                    sb2.append((String) hashMap2.get(matcher2.group()));
                    i11 = matcher2.end();
                }
                sb2.append(str.substring(i11));
                String sb3 = sb2.toString();
                SSDKLog.b().c("> SERVER_SHORT_LINK_URL content after replace link ===  %s", sb3);
                ShareSDKCallback shareSDKCallback2 = shareSDKCallback;
                if (shareSDKCallback2 != null) {
                    shareSDKCallback2.onCallback(sb3);
                }
            }
        });
    }

    private boolean a(String str, boolean z10) {
        return this.f5089b.a(str, z10);
    }

    public void b(cn.sharesdk.framework.a.b.c cVar) {
        try {
            long b10 = this.f5090c.b();
            if (b10 == 0) {
                b10 = this.f5089b.b();
            }
            cVar.f5125e = System.currentTimeMillis() - b10;
            this.f5089b.a(cVar);
        } catch (Throwable th2) {
            SSDKLog.b().a(cn.sharesdk.facebook.e.a("s l", th2), new Object[0]);
        }
    }

    private String c(String str) {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(str.getBytes());
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
        byte[] bArr = new byte[DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED];
        while (true) {
            int read = byteArrayInputStream.read(bArr, 0, DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED);
            if (read == -1) {
                gZIPOutputStream.flush();
                gZIPOutputStream.close();
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.flush();
                byteArrayOutputStream.close();
                byteArrayInputStream.close();
                return Base64.encodeToString(byteArray, 2);
            }
            gZIPOutputStream.write(bArr, 0, read);
        }
    }

    public String a(String str, int i10, boolean z10, String str2, HashMap<String, String> hashMap) {
        String a10;
        try {
            if (this.f5090c.i() && this.f5090c.e()) {
                String str3 = hashMap.get("nt");
                if (!"none".equals(str3) && !TextUtils.isEmpty(str3)) {
                    if (z10 && (a10 = a(str, "<a[^>]*?href[\\s]*=[\\s]*[\"']?([^'\">]+?)['\"]?>", i10, str2, hashMap)) != null && !a10.equals(str)) {
                        return a10;
                    }
                    String a11 = a(str, "(http://|https://){1}[\\w\\.\\-/:\\?&%=,;\\[\\]\\{\\}`~!@#\\$\\^\\*\\(\\)_\\+\\\\\\|]+", i10, str2, hashMap);
                    if (a11 != null) {
                        if (!a11.equals(str)) {
                            return a11;
                        }
                    }
                }
            }
            return str;
        } catch (Throwable th2) {
            SSDKLog.b().a(th2);
            return str;
        }
    }

    public HashMap<String, Object> a(String str, String str2) {
        try {
            return this.f5089b.a(str, str2);
        } catch (Throwable th2) {
            SSDKLog.b().a(th2);
            return null;
        }
    }

    public void a(final Handler handler) {
        try {
            if (this.f5090c.i()) {
                this.f5090c.a(System.currentTimeMillis());
                this.f5089b.a(new ShareSDKCallback<HashMap<String, Object>>() { // from class: cn.sharesdk.framework.a.a.2
                    @Override // cn.sharesdk.framework.ShareSDKCallback
                    /* renamed from: a */
                    public void onCallback(HashMap<String, Object> hashMap) {
                        HashMap hashMap2;
                        HashMap hashMap3;
                        if (hashMap != null && !hashMap.isEmpty()) {
                            try {
                                if (hashMap.containsKey("status") && ResHelper.parseInt(String.valueOf(hashMap.get("status"))) == -200) {
                                    SSDKLog.b().a((String) hashMap.get("error"), new Object[0]);
                                    return;
                                }
                            } catch (Throwable th2) {
                                SSDKLog.b().a(cn.sharesdk.facebook.e.a("get status", th2), new Object[0]);
                            }
                            try {
                                if (hashMap.containsKey("timestamp")) {
                                    a.this.f5090c.a("service_time", Long.valueOf(System.currentTimeMillis() - ResHelper.parseLong(String.valueOf(hashMap.get("timestamp")))));
                                }
                            } catch (Throwable th3) {
                                SSDKLog.b().a(cn.sharesdk.facebook.e.a("timestamp", th3), new Object[0]);
                            }
                            if (hashMap.containsKey("switchs") && (hashMap3 = (HashMap) hashMap.get("switchs")) != null) {
                                String valueOf = String.valueOf(hashMap3.get("device"));
                                String valueOf2 = String.valueOf(hashMap3.get("share"));
                                String valueOf3 = String.valueOf(hashMap3.get("auth"));
                                String valueOf4 = String.valueOf(hashMap3.get("backflow"));
                                String valueOf5 = String.valueOf(hashMap3.get("loginplus"));
                                String valueOf6 = String.valueOf(hashMap3.get("linkcard"));
                                a.this.f5090c.b(valueOf);
                                a.this.f5090c.d(valueOf2);
                                a.this.f5090c.c(valueOf3);
                                a.this.f5090c.a(valueOf4);
                                a.this.f5090c.e(valueOf5);
                                a.this.f5090c.f(valueOf6);
                            }
                            if (hashMap.containsKey("serpaths") && (hashMap2 = (HashMap) hashMap.get("serpaths")) != null) {
                                String valueOf7 = String.valueOf(hashMap2.get("defhost"));
                                String valueOf8 = String.valueOf(hashMap2.get("defport"));
                                if (!TextUtils.isEmpty(valueOf7) && !TextUtils.isEmpty(valueOf8)) {
                                    if (!"443".equals(valueOf8) && !"80".equals(valueOf8)) {
                                        c cVar = a.this.f5089b;
                                        cVar.b(MobSDK.checkRequestUrl(valueOf7) + ":" + valueOf8);
                                    } else {
                                        a.this.f5089b.b(MobSDK.checkRequestUrl(valueOf7));
                                    }
                                }
                                HashMap<String, String> hashMap4 = new HashMap<>();
                                if (hashMap2.containsKey("assigns")) {
                                    HashMap hashMap5 = (HashMap) hashMap2.get("assigns");
                                    if (hashMap5 != null && hashMap5.size() != 0) {
                                        for (String str : hashMap5.keySet()) {
                                            HashMap hashMap6 = (HashMap) hashMap5.get(str);
                                            String valueOf9 = String.valueOf(hashMap6.get("host"));
                                            String valueOf10 = String.valueOf(hashMap6.get("port"));
                                            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(valueOf9) && !TextUtils.isEmpty(valueOf10)) {
                                                hashMap4.put(str, "http://" + valueOf9 + ":" + valueOf10);
                                            }
                                        }
                                        a.this.f5089b.a(hashMap4);
                                        handler.sendEmptyMessageDelayed(4, 600000L);
                                        return;
                                    }
                                    a.this.f5089b.a((HashMap<String, String>) null);
                                }
                            }
                        }
                    }
                });
            }
        } catch (Throwable th2) {
            SSDKLog.b().a(th2);
        }
    }

    public void a(final ShareSDKCallback<Boolean> shareSDKCallback) {
        DH.requester(MobSDK.getContext()).getNetworkType().request(new DH.DHResponder() { // from class: cn.sharesdk.framework.a.a.1
            @Override // com.mob.tools.utils.DH.DHResponder
            public void onResponse(DH.DHResponse dHResponse) {
                try {
                    String networkType = dHResponse.getNetworkType();
                    if (!"none".equals(networkType) && !TextUtils.isEmpty(networkType)) {
                        long longValue = a.this.f5090c.j().longValue();
                        long currentTimeMillis = System.currentTimeMillis();
                        Calendar calendar = Calendar.getInstance();
                        calendar.setTimeInMillis(longValue);
                        int i10 = calendar.get(5);
                        calendar.setTimeInMillis(currentTimeMillis);
                        int i11 = calendar.get(5);
                        if (currentTimeMillis - longValue >= 86400000 || i10 != i11) {
                            HashMap<String, Object> a10 = a.this.f5089b.a();
                            a.this.f5090c.c(a10.containsKey("res") ? "true".equals(String.valueOf(a10.get("res"))) : true);
                            if (a10.size() > 0) {
                                a.this.f5090c.b(System.currentTimeMillis());
                            }
                            shareSDKCallback.onCallback(Boolean.TRUE);
                        }
                    }
                } catch (Throwable th2) {
                    SSDKLog.b().a(th2);
                }
            }
        });
    }

    public void a(cn.sharesdk.framework.a.b.c cVar) {
        try {
            if (this.f5090c.i()) {
                if (!this.f5090c.c()) {
                    cVar.f5132l = null;
                }
                if (cVar instanceof cn.sharesdk.framework.a.b.b) {
                    a((cn.sharesdk.framework.a.b.b) cVar);
                } else if (cVar instanceof f) {
                    a((f) cVar);
                    return;
                }
                b(cVar);
            }
        } catch (Throwable th2) {
            SSDKLog.b().a(th2);
        }
    }

    public void a(String str) {
        if (this.f5089b == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.f5089b.a(str);
    }

    public void a(HashMap<String, Object> hashMap) {
        try {
            this.f5089b.b(hashMap);
        } catch (Throwable th2) {
            SSDKLog.b().a(th2);
        }
    }

    public HashMap<String, Object> b(String str) {
        if (this.f5090c.i() || !this.f5090c.k()) {
            try {
                HashMap<String, Object> d10 = this.f5089b.d(str);
                this.f5090c.d(true);
                return d10;
            } catch (Throwable th2) {
                this.f5090c.d(false);
                SSDKLog.b().a(th2);
                return new HashMap<>();
            }
        }
        return new HashMap<>();
    }

    public void b() {
        try {
            if (this.f5090c.i()) {
                ArrayList<cn.sharesdk.framework.a.a.c> c10 = this.f5089b.c();
                for (int i10 = 0; i10 < c10.size(); i10++) {
                    cn.sharesdk.framework.a.a.c cVar = c10.get(i10);
                    if (cVar.f5109b.size() == 1 ? a(cVar.f5108a, false) : a(c(cVar.f5108a), true)) {
                        this.f5089b.a(cVar.f5109b);
                    }
                }
            }
        } catch (Throwable th2) {
            SSDKLog.b().a(th2);
        }
    }

    public HashMap<String, Object> c() {
        try {
            return this.f5089b.d();
        } catch (Throwable th2) {
            SSDKLog.b().a(th2);
            return new HashMap<>();
        }
    }

    public void a(String str, int i10, boolean z10, String str2, ShareSDKCallback<String> shareSDKCallback) {
        try {
            if ((!this.f5090c.i() || !this.f5090c.e()) && shareSDKCallback != null) {
                shareSDKCallback.onCallback(str);
                return;
            }
            SSDKLog.b().c("> SERVER_SHORT_LINK_URL content before replace link ===  %s", str);
            if (z10) {
                a(str, "<a[^>]*?href[\\s]*=[\\s]*[\"']?([^'\">]+?)['\"]?>", i10, str2, shareSDKCallback);
            } else {
                a(str, "(http://|https://){1}[\\w\\.\\-/:\\?&%=,;\\[\\]\\{\\}`~!@#\\$\\^\\*\\(\\)_\\+\\\\\\|]+", i10, str2, shareSDKCallback);
            }
        } catch (Throwable th2) {
            SSDKLog.b().a(th2);
            if (shareSDKCallback != null) {
                StringBuilder a10 = android.support.v4.media.d.a("error:");
                a10.append(th2.getMessage());
                shareSDKCallback.onCallback(a10.toString());
            }
        }
    }

    private void a(String str, b bVar, ShareSDKCallback<String> shareSDKCallback) {
        float f10;
        if (TextUtils.isEmpty(str) || !new File(str).exists()) {
            if (shareSDKCallback != null) {
                shareSDKCallback.onCallback(null);
                return;
            }
            return;
        }
        Bitmap.CompressFormat bmpFormat = BitmapHelper.getBmpFormat(str);
        float f11 = bVar == b.BEFORE_SHARE ? 600.0f : 200.0f;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        options.inJustDecodeBounds = false;
        int i10 = options.outWidth;
        int i11 = options.outHeight;
        if (i10 >= i11 && i11 > f11) {
            f10 = i11;
        } else if (i10 >= i11 || i10 <= f11) {
            a(str, shareSDKCallback);
            return;
        } else {
            f10 = i10;
        }
        int ceil = (int) Math.ceil(f10 / f11);
        if (ceil <= 0) {
            ceil = 1;
        }
        BitmapFactory.Options options2 = new BitmapFactory.Options();
        options2.inSampleSize = ceil;
        options2.inPurgeable = true;
        options2.inInputShareable = true;
        Bitmap decodeFile = BitmapFactory.decodeFile(str, options2);
        decodeFile.getHeight();
        decodeFile.getWidth();
        StringBuilder a10 = android.support.v4.media.d.a(".");
        a10.append(bmpFormat.name().toLowerCase());
        File createTempFile = File.createTempFile("bm_tmp2", a10.toString());
        FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
        decodeFile.compress(bmpFormat, 80, fileOutputStream);
        fileOutputStream.flush();
        fileOutputStream.close();
        a(createTempFile.getAbsolutePath(), shareSDKCallback);
    }
}
