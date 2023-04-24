package com.mob.tools.a;

import android.app.ActivityManager;
import android.app.Application;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.location.Location;
import android.os.Build;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.os.StatFs;
import android.os.SystemClock;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import android.view.inputmethod.InputMethodInfo;
import android.view.inputmethod.InputMethodManager;
import com.mob.MobSDK;
import com.mob.commons.C0744r;
import com.mob.tools.MobLog;
import com.mob.tools.utils.Data;
import com.mob.tools.utils.NtFetcher;
import com.mob.tools.utils.ReflectHelper;
import com.mob.tools.utils.ResHelper;
import com.sina.weibo.BuildConfig;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.BlockingQueue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public class b {

    /* renamed from: b */
    private static b f8613b;

    /* renamed from: a */
    private Context f8614a;

    /* renamed from: e */
    private String f8617e;

    /* renamed from: c */
    private long f8615c = 0;

    /* renamed from: d */
    private String f8616d = null;

    /* renamed from: f */
    private int f8618f = -1;

    private b(Context context) {
        this.f8614a = context.getApplicationContext();
    }

    public static Object V() {
        return C0744r.c();
    }

    public static Context W() {
        return C0744r.b();
    }

    public static synchronized b a(Context context) {
        b bVar;
        synchronized (b.class) {
            if (f8613b == null && context != null) {
                f8613b = new b(context);
            }
            bVar = f8613b;
        }
        return bVar;
    }

    public static Object a(String str) {
        return ReflectHelper.invokeInstanceMethod(ReflectHelper.invokeStaticMethod(ReflectHelper.importClass(com.mob.commons.i.a("0170jhfh'lCfhgngffhfmhhgnigfefm!fIfg2nk")), com.mob.commons.i.a("010>hh5kf[igfefm!fHfgBnk"), new Object[0]), com.mob.commons.i.a("004k2fn(kMfi"), new Object[]{str}, new Class[]{String.class});
    }

    private void a(String str, String str2, long[] jArr) {
        try {
            int indexOf = str.indexOf(str2);
            if (indexOf != -1) {
                Matcher matcher = Pattern.compile(" \\d+ ").matcher(str.substring(indexOf));
                int i10 = 0;
                while (matcher.find()) {
                    if (i10 == 0) {
                        jArr[0] = Long.parseLong(matcher.group().trim());
                    } else if (i10 == 8) {
                        jArr[1] = Long.parseLong(matcher.group().trim());
                        return;
                    }
                    i10++;
                }
            }
        } catch (Throwable th2) {
            MobLog.getInstance().d(th2);
        }
    }

    private boolean aZ() {
        try {
        } catch (Throwable th2) {
            MobLog.getInstance().w(th2);
        }
        if (new File(com.mob.commons.i.a("025iXhifkhi4fkni8fhTggiVgjfeFgk'fjfehi:kHfjgnfh,gCfl")).exists()) {
            return true;
        }
        String[] strArr = {com.mob.commons.i.a("012ij8fhSf^fh^iIgfgefifhgfFi"), com.mob.commons.i.a("016ij2fhUfCfhJi)gfgefifhgf i6hefgfmHi"), com.mob.commons.i.a("017ij,fhEfKfhEiFgfgefifhgfGi<fnhefgfmDi"), com.mob.commons.i.a("006i,hihefgfmYi"), com.mob.commons.i.a("008iQhife(i'hefgfm_i"), com.mob.commons.i.a("012iPhifkhiKfkniRhefgfmYi"), com.mob.commons.i.a("017i0hifkhiFfkniAhefgfmYi,gn)k'fnQfi"), com.mob.commons.i.a("021iNhifkhi)fkniAhefgfmFiKhjfhfggfhifhhj^ki"), com.mob.commons.i.a("016iNhifkhiMfkni6hi;ji7fnhefgfm!i"), com.mob.commons.i.a("025iRhifkhi5fkniEfehifj%i%hfVk4jkfm,kkj-jkfjgegePfi"), com.mob.commons.i.a("013i-hifkhi[fkniBfnhefgfm'i"), com.mob.commons.i.a("013iMhifkhi4fkni5hihefgfm1i"), com.mob.commons.i.a("012ilk3fmTjJgefj;iHhefgfmMi"), com.mob.commons.i.a("006i?fifhfi@ek"), com.mob.commons.i.a("005ij(fhXfQfh"), com.mob.commons.i.a("004ijkl")};
        for (int i10 = 0; i10 < 16; i10++) {
            if (new File(strArr[i10], com.mob.commons.i.a("002-hife")).exists()) {
                return true;
            }
        }
        for (int i11 = 0; i11 < 16; i11++) {
            if (new File(strArr[i11], com.mob.commons.i.a("007!hefehifkhegefn")).exists()) {
                return true;
            }
        }
        for (int i12 = 0; i12 < 16; i12++) {
            if (new File(strArr[i12], com.mob.commons.i.a("006n:fhhhfghifl")).exists()) {
                return true;
            }
        }
        return false;
    }

    private int b(Context context) {
        try {
            String aK = aK();
            if (!TextUtils.isEmpty(aK)) {
                if (!aK.equals(context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).processName)) {
                    return 0;
                }
                return 1;
            }
            return -1;
        } catch (Throwable th2) {
            MobLog.getInstance().d(cn.sharesdk.facebook.e.a("MobPush checkIsInMainProcess: ", th2), new Object[0]);
            return -1;
        }
    }

    public String ba() {
        String I = I();
        if (TextUtils.isEmpty(I)) {
            return null;
        }
        return Data.byteToHex(Data.SHA1(I));
    }

    public String A() {
        return a(false);
    }

    public boolean B() {
        int i10;
        if (this.f8618f == -1) {
            try {
            } catch (Throwable th2) {
                MobLog.getInstance().d(th2);
            }
            if (f8.e.f14182b.b(this.f8614a, f8.e.f14181a) == 0) {
                i10 = 1;
                this.f8618f = i10;
            }
            i10 = 0;
            this.f8618f = i10;
        }
        if (this.f8618f != 1) {
            return false;
        }
        return true;
    }

    public String C() {
        return this.f8614a.getPackageName();
    }

    public String D() {
        try {
            ApplicationInfo applicationInfo = this.f8614a.getApplicationInfo();
            String str = applicationInfo.name;
            if (str != null) {
                if (Build.VERSION.SDK_INT < 25 || str.endsWith(".*")) {
                    return str;
                }
                try {
                    ReflectHelper.importClass(str);
                } catch (Throwable unused) {
                }
            }
            int i10 = applicationInfo.labelRes;
            return i10 > 0 ? this.f8614a.getString(i10) : String.valueOf(applicationInfo.nonLocalizedLabel);
        } catch (Throwable th2) {
            MobLog.getInstance().w(th2);
            return "";
        }
    }

    public int E() {
        long longVersionCode;
        try {
            PackageInfo a10 = c.a(this.f8614a).b().a(false, 0, C(), 0);
            if (Build.VERSION.SDK_INT >= 28) {
                longVersionCode = a10.getLongVersionCode();
                return (int) longVersionCode;
            }
            return a10.versionCode;
        } catch (Throwable th2) {
            MobLog.getInstance().d(th2);
            return 0;
        }
    }

    public String F() {
        try {
            return c.a(this.f8614a).b().a(false, 0, C(), 0).versionName;
        } catch (Throwable th2) {
            MobLog.getInstance().d(th2);
            return BuildConfig.VERSION_NAME;
        }
    }

    public ArrayList<String> G() {
        return new ArrayList<>();
    }

    public String H() {
        try {
            return (Build.VERSION.SDK_INT < 29 || this.f8614a.getApplicationInfo().targetSdkVersion < 29 || !"mounted".equals(Environment.getExternalStorageState())) ? this.f8614a.getFilesDir().getAbsolutePath() : this.f8614a.getExternalFilesDir(null).getAbsolutePath();
        } catch (Throwable unused) {
            return null;
        }
    }

    public String I() {
        return null;
    }

    public synchronized String J() {
        return null;
    }

    public synchronized String[] K() {
        return null;
    }

    public int L() {
        return -1;
    }

    public int M() {
        return -1;
    }

    public int N() {
        return -1;
    }

    public int O() {
        return -1;
    }

    public int P() {
        return -1;
    }

    public int Q() {
        return -1;
    }

    public int R() {
        return -1;
    }

    public int S() {
        return -1;
    }

    public ArrayList<HashMap<String, Object>> T() {
        return null;
    }

    public String U() {
        String str;
        String a10 = com.mob.commons.i.a("0090ggghhkifhmgighifhk");
        try {
            UiModeManager uiModeManager = (UiModeManager) d("uimode");
            if (uiModeManager != null) {
                switch (uiModeManager.getCurrentModeType()) {
                    case 1:
                        str = "005Xghhnffgggi";
                        break;
                    case 2:
                        str = "004Zhkifgjjl";
                        break;
                    case 3:
                        str = "003=iiglig";
                        break;
                    case 4:
                        str = "010Kgkifgmifihgigjgihngh";
                        break;
                    case 5:
                        str = "009[glijijgmgiglghiiif";
                        break;
                    case 6:
                        str = "0057jeglgkiijf";
                        break;
                    case 7:
                        str = "009*ihigjfifglhkgjifgk";
                        break;
                    default:
                        str = "009-ggghhkifhmgighifhk";
                        break;
                }
                a10 = com.mob.commons.i.a(str);
                return a10;
            }
            return a10;
        } catch (Throwable th2) {
            MobLog.getInstance().d(th2);
            return a10;
        }
    }

    public HashMap<String, Object> X() {
        return null;
    }

    public ArrayList<HashMap<String, Object>> Y() {
        return null;
    }

    public boolean Z() {
        return false;
    }

    public Location a(int i10, int i11, boolean z10) {
        try {
            if (f(com.mob.commons.i.a("039)fhfm$jJfjgefgHj+gn gkPfjGn]fghihifggefmgngliiiiifgjgjffhmgighifffgmhniiglgkgihngh")) || (Build.VERSION.SDK_INT >= 29 && f(com.mob.commons.i.a("045Bfhfm7jNfjgefg+j,gn;gkPfj)n?fghihifggefmgngliiiiifgjgjffhlgliijljmighnggghhkffgmhniiglgkgihngh")))) {
                if (Looper.myLooper() != Looper.getMainLooper()) {
                    return com.mob.tools.utils.c.a().a(this.f8614a, i10, i11, z10);
                }
                throw new Throwable("Method 'getLocation' can not be called from Main Thread");
            }
            return null;
        } catch (Throwable th2) {
            MobLog.getInstance().d(th2);
            return null;
        }
    }

    public String a(int i10) {
        long currentTimeMillis = System.currentTimeMillis() ^ SystemClock.elapsedRealtime();
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(currentTimeMillis);
        SecureRandom secureRandom = new SecureRandom();
        for (int i11 = 0; i11 < i10; i11++) {
            if (com.mob.commons.i.a("004>fiUe'fhfj").equalsIgnoreCase(com.mob.commons.i.a(secureRandom.nextInt(2) % 2 == 0 ? "004Dfi%e3fhfj" : "0030fmfe+n"))) {
                stringBuffer.insert(i11 + 1, (char) (secureRandom.nextInt(26) + 97));
            } else {
                stringBuffer.insert(stringBuffer.length(), secureRandom.nextInt(10));
            }
        }
        return stringBuffer.toString().substring(0, 40);
    }

    public String a(String str, String str2) {
        try {
            String encodeToString = Base64.encodeToString(Data.AES128Encode(str2, str), 0);
            return encodeToString.contains("\n") ? encodeToString.replace("\n", "") : encodeToString;
        } catch (Throwable th2) {
            MobLog.getInstance().w(th2);
            return null;
        }
    }

    public String a(boolean z10) {
        if (TextUtils.isEmpty(this.f8616d)) {
            String str = null;
            if (Looper.myLooper() == Looper.getMainLooper()) {
                if (TextUtils.isEmpty(this.f8617e)) {
                    String a10 = a(40);
                    this.f8617e = a10;
                    new Thread(new Runnable() { // from class: com.mob.tools.a.b.1
                        @Override // java.lang.Runnable
                        public void run() {
                            try {
                                b bVar = b.this;
                                bVar.f8616d = bVar.ba();
                            } catch (Throwable th2) {
                                MobLog.getInstance().d(th2);
                            }
                        }
                    }).start();
                    return a10;
                }
                return this.f8617e;
            }
            try {
                str = ba();
            } catch (Throwable th2) {
                MobLog.getInstance().d(th2);
            }
            if (TextUtils.isEmpty(str)) {
                str = a(40);
            }
            this.f8616d = str;
            return str;
        }
        return this.f8616d;
    }

    public ArrayList<HashMap<String, String>> a(boolean z10, boolean z11, boolean z12) {
        return new ArrayList<>();
    }

    public void a(BroadcastReceiver broadcastReceiver) {
        try {
            ReflectHelper.invokeInstanceMethod(MobSDK.getContext(), com.mob.commons.i.a("0180fefmfj+k,hhfghi$fk'fjig3k!fi6k'fgLlkMfj"), new Object[]{broadcastReceiver}, new Class[]{BroadcastReceiver.class});
        } catch (Throwable th2) {
            MobLog.getInstance().d(th2);
        }
    }

    public void a(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        try {
            if (Build.VERSION.SDK_INT < 33) {
                ReflectHelper.invokeInstanceMethod(MobSDK.getContext(), com.mob.commons.i.a("016Kfj(kDhhfghi%fk@fjigEk fiRk5fg[lkWfj"), new Object[]{broadcastReceiver, intentFilter}, new Class[]{BroadcastReceiver.class, IntentFilter.class});
            } else {
                ReflectHelper.invokeInstanceMethod(MobSDK.getContext(), com.mob.commons.i.a("016GfjSkUhhfghi'fk[fjigOkCfi$kWfg2lkEfj"), new Object[]{broadcastReceiver, intentFilter, 4}, new Class[]{BroadcastReceiver.class, IntentFilter.class, Integer.TYPE});
            }
        } catch (Throwable th2) {
            MobLog.getInstance().d(th2);
        }
    }

    public void a(final Handler.Callback callback) {
        try {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.BATTERY_CHANGED");
            BroadcastReceiver broadcastReceiver = new BroadcastReceiver() { // from class: com.mob.tools.a.b.2
                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context, Intent intent) {
                    HashMap hashMap = new HashMap();
                    for (String str : intent.getExtras().keySet()) {
                        hashMap.put(str, intent.getExtras().get(str));
                    }
                    if (callback != null) {
                        Message obtain = Message.obtain();
                        obtain.obj = hashMap;
                        callback.handleMessage(obtain);
                    }
                    try {
                        ReflectHelper.invokeInstanceMethod(context, com.mob.commons.i.a("0188fefmfjAk.hhfghiDfk'fjig2k,fiTk8fgMlk_fj"), new Object[]{this}, new Class[]{BroadcastReceiver.class});
                    } catch (Throwable unused) {
                    }
                }
            };
            if (Build.VERSION.SDK_INT < 33) {
                ReflectHelper.invokeInstanceMethod(this.f8614a, com.mob.commons.i.a("016!fjAkMhhfghiJfkTfjigXk_fi!kWfgNlk]fj"), new Object[]{broadcastReceiver, intentFilter}, new Class[]{BroadcastReceiver.class, IntentFilter.class});
            } else {
                ReflectHelper.invokeInstanceMethod(this.f8614a, com.mob.commons.i.a("016,fjOk8hhfghiWfkIfjig[k=fiVkZfgMlkKfj"), new Object[]{broadcastReceiver, intentFilter, 4}, new Class[]{BroadcastReceiver.class, IntentFilter.class, Integer.TYPE});
            }
        } catch (Throwable th2) {
            MobLog.getInstance().w(th2);
            if (callback != null) {
                callback.handleMessage(Message.obtain());
            }
        }
    }

    public void a(View view) {
        Object d10 = d("input_method");
        if (d10 == null) {
            return;
        }
        ((InputMethodManager) d10).hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    public void a(final BlockingQueue<Boolean> blockingQueue) {
        BroadcastReceiver broadcastReceiver = new BroadcastReceiver() { // from class: com.mob.tools.a.b.3
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                try {
                    b.this.a(this);
                    if ("android.net.wifi.SCAN_RESULTS".equals(intent.getAction())) {
                        blockingQueue.put(Boolean.TRUE);
                    }
                } catch (Throwable th2) {
                    MobLog.getInstance().d(th2);
                }
            }
        };
        try {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.wifi.SCAN_RESULTS");
            a(broadcastReceiver, intentFilter);
        } catch (Throwable th2) {
            MobLog.getInstance().d(th2);
        }
    }

    public boolean a() {
        String str = Build.TAGS;
        return (str != null && str.contains(com.mob.commons.i.a("009fkHhi1f@jkflWkLfkhi"))) || aZ();
    }

    public String aA() {
        try {
            return b(com.mob.commons.i.a("017CfjgegnhegefhfjKj5gnYgDgffhLf;hjgefjQn"));
        } catch (Throwable th2) {
            MobLog.getInstance().d(th2);
            return null;
        }
    }

    public int aB() {
        return NtFetcher.getInstance(this.f8614a).getDtNtType();
    }

    public String aC() {
        try {
            String string = Settings.Secure.getString(this.f8614a.getContentResolver(), "default_input_method");
            if (TextUtils.isEmpty(string)) {
                return null;
            }
            return string.split(com.mob.commons.i.a("001i"))[0];
        } catch (Throwable th2) {
            MobLog.getInstance().d(th2);
            return null;
        }
    }

    public HashMap<String, Object> aD() {
        HashMap<String, Object> hashMap = new HashMap<>();
        try {
            String aC = aC();
            hashMap.put(com.mob.commons.i.a("0049fmfhMnk"), e(aC));
            hashMap.put(com.mob.commons.i.a("003gTflhh"), aC);
        } catch (Throwable th2) {
            MobLog.getInstance().d(th2);
        }
        return hashMap;
    }

    public ArrayList<HashMap<String, Object>> aE() {
        ArrayList<HashMap<String, Object>> arrayList = new ArrayList<>();
        try {
            for (InputMethodInfo inputMethodInfo : ((InputMethodManager) d("input_method")).getInputMethodList()) {
                if (inputMethodInfo != null) {
                    HashMap<String, Object> hashMap = new HashMap<>();
                    hashMap.put(com.mob.commons.i.a("004'fmfhYnk"), inputMethodInfo.loadLabel(this.f8614a.getPackageManager()));
                    hashMap.put(com.mob.commons.i.a("003g[flhh"), inputMethodInfo.getPackageName());
                    arrayList.add(hashMap);
                }
            }
        } catch (Throwable th2) {
            MobLog.getInstance().d(th2);
        }
        return arrayList;
    }

    public String aF() {
        return Build.BRAND;
    }

    public boolean aG() {
        com.mob.tools.utils.g gVar;
        int i10;
        try {
            gVar = new com.mob.tools.utils.g();
            i10 = gVar.a(this.f8614a) == 1 ? 1 : 0;
            if (gVar.b(this.f8614a) == 1) {
                i10++;
            }
        } catch (Throwable th2) {
            MobLog.getInstance().d(th2);
        }
        if (i10 >= 2) {
            return true;
        }
        if (gVar.c(this.f8614a) == 1) {
            i10++;
        }
        if (i10 >= 2) {
            return true;
        }
        if (gVar.d(this.f8614a) == 1) {
            i10++;
        }
        if (i10 >= 2) {
            return true;
        }
        if (gVar.e(this.f8614a) == 1) {
            i10++;
        }
        if (i10 < 2 && i10 < 2) {
            if (gVar.f(this.f8614a) == 1) {
                i10++;
            }
            if (i10 >= 2) {
                return true;
            }
            if (gVar.g(this.f8614a) == 1) {
                i10++;
            }
            if (i10 >= 2) {
                return true;
            }
            if (gVar.a() == 1) {
                i10++;
            }
            return i10 >= 2 || i10 >= 2;
        }
        return true;
    }

    public HashMap<String, Object> aH() {
        BufferedReader bufferedReader;
        Throwable th2;
        String a10;
        Long valueOf;
        HashMap<String, Object> hashMap = new HashMap<>();
        try {
            try {
                bufferedReader = new BufferedReader(new FileReader(com.mob.commons.i.a("013igLfjgefiZinknFfgfmhjge")));
                while (true) {
                    try {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            break;
                        }
                        String[] split = readLine.split("\\s+");
                        if (split != null && split.length > 1) {
                            String str = split[0];
                            long parseLong = Long.parseLong(split[1]) * 1024;
                            if ("MemTotal:".equals(str)) {
                                a10 = com.mob.commons.i.a("015fLgeNfTfhgfikRknXgefjfkgjfgie(k");
                                valueOf = Long.valueOf(parseLong);
                            } else if (com.mob.commons.i.a("0087ikKkn'hmfjZkkh").equals(str)) {
                                a10 = com.mob.commons.i.a("0143hjfjUkkWik=kn*gefjfkgjfgieEk");
                                valueOf = Long.valueOf(parseLong);
                            } else if (com.mob.commons.i.a("013IikIkn3glCl=fhfggffhhegfXkh").equals(str)) {
                                a10 = com.mob.commons.i.a("019KfhUlAfhfggffhhegfKkZik5knOgefjfkgjfgie7k");
                                valueOf = Long.valueOf(parseLong);
                            } else if (com.mob.commons.i.a("007MglfiPfGfg4lkh").equals(str)) {
                                a10 = com.mob.commons.i.a("0163fhfi>f5fg1lk0ikIkn^gefjfkgjfgieDk");
                                valueOf = Long.valueOf(parseLong);
                            } else if ("Inactive:".equals(str)) {
                                a10 = com.mob.commons.i.a("018!fgfmfhfi<f6fgQlk(ikNkn>gefjfkgjfgie(k");
                                valueOf = Long.valueOf(parseLong);
                            }
                            hashMap.put(a10, valueOf);
                        }
                    } catch (Throwable th3) {
                        th2 = th3;
                        try {
                            MobLog.getInstance().d(th2);
                            if (bufferedReader != null) {
                                bufferedReader.close();
                            }
                            return hashMap;
                        } catch (Throwable th4) {
                            if (bufferedReader != null) {
                                try {
                                    bufferedReader.close();
                                } catch (Throwable th5) {
                                    MobLog.getInstance().d(th5);
                                }
                            }
                            throw th4;
                        }
                    }
                }
                bufferedReader.close();
            } catch (Throwable th6) {
                bufferedReader = null;
                th2 = th6;
            }
        } catch (Throwable th7) {
            MobLog.getInstance().d(th7);
        }
        return hashMap;
    }

    public boolean aI() {
        boolean z10;
        try {
            String e10 = e();
            String ah2 = ah();
            if (!TextUtils.isEmpty(ah2) && ah2.length() >= 3) {
                if (Integer.parseInt(ah2.substring(1)) >= 12) {
                    z10 = true;
                    return com.mob.commons.i.a("006LfnfgfhgeSn1fg").equalsIgnoreCase(e10) && z10;
                }
            }
            z10 = false;
            if (com.mob.commons.i.a("006LfnfgfhgeSn1fg").equalsIgnoreCase(e10)) {
                return false;
            }
        } catch (Throwable th2) {
            String message = th2.getMessage();
            if (message == null) {
                message = "";
            }
            MobLog.getInstance().d(message, new Object[0]);
            return false;
        }
    }

    public boolean aJ() {
        return b(this.f8614a) != 0;
    }

    public String aK() {
        String str = "";
        try {
            if (Build.VERSION.SDK_INT >= 28) {
                str = Application.getProcessName();
            } else {
                Method declaredMethod = Class.forName(com.mob.commons.i.a("026KfhfmWjTfjgefgXj3gnfh8gg!gnglfi%f[fg%lSfgNfFfkgk)e^fjTkAfhBj"), false, Application.class.getClassLoader()).getDeclaredMethod("currentProcessName", new Class[0]);
                declaredMethod.setAccessible(true);
                Object invoke = declaredMethod.invoke(null, new Object[0]);
                if (invoke instanceof String) {
                    str = (String) invoke;
                }
            }
        } catch (Throwable th2) {
            MobLog.getInstance().d(cn.sharesdk.facebook.e.a("MobPush getProcessName: ", th2), new Object[0]);
        }
        return str;
    }

    public long aL() {
        try {
            return c.a(this.f8614a).b().a(false, 0, C(), 0).lastUpdateTime;
        } catch (Throwable th2) {
            MobLog.getInstance().d(th2);
            return 0L;
        }
    }

    public String aM() {
        return Build.BOARD;
    }

    public String aN() {
        return Build.DEVICE;
    }

    public String aO() {
        return Build.DISPLAY;
    }

    public String aP() {
        return Build.FINGERPRINT;
    }

    public String aQ() {
        return Build.getRadioVersion();
    }

    public String aR() {
        Object obj;
        try {
            try {
                obj = a(com.mob.commons.i.a("021GfifhXf:ke3ig0fjgefiVi=hiGkQgfhj^iCfihhfjgefe g"));
            } catch (Throwable th2) {
                th = th2;
                obj = null;
            }
        } catch (Throwable unused) {
        }
        try {
            InputStream inputStream = (InputStream) ReflectHelper.invokeInstanceMethod(obj, com.mob.commons.i.a("014>hh7kfJgifm@gCfe+f)gjGfGfjUkSfh2n"), new Object[0]);
            r1 = inputStream != null ? new BufferedReader(new InputStreamReader(inputStream)).readLine() : null;
        } catch (Throwable th3) {
            th = th3;
            try {
                MobLog.getInstance().d(th);
                if (obj != null) {
                    ReflectHelper.invokeInstanceMethod(obj, com.mob.commons.i.a("007jkJhiQfCfjgefk"), new Object[0]);
                }
                return r1;
            } catch (Throwable th4) {
                if (obj != null) {
                    try {
                        ReflectHelper.invokeInstanceMethod(obj, com.mob.commons.i.a("007jkJhiQfCfjgefk"), new Object[0]);
                    } catch (Throwable unused2) {
                    }
                }
                throw th4;
            }
        }
        if (obj != null) {
            ReflectHelper.invokeInstanceMethod(obj, com.mob.commons.i.a("007jkJhiQfCfjgefk"), new Object[0]);
        }
        return r1;
    }

    public String aS() {
        try {
            Object a10 = a(com.mob.commons.i.a("017FfifhIfKke8igBfjgefi<iGfiQgEfefgfmhjge"));
            InputStream inputStream = (InputStream) ReflectHelper.invokeInstanceMethod(a10, com.mob.commons.i.a("014HhhRkf!gifm4gIfe8fPgj]f6fjRk@fhHn"), new Object[0]);
            if (inputStream == null) {
                if (a10 != null) {
                    ReflectHelper.invokeInstanceMethod(a10, com.mob.commons.i.a("007jkGhi6fWfjgefk"), new Object[0]);
                    return "";
                }
                return "";
            }
            StringBuffer stringBuffer = new StringBuffer();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "utf-8"));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                stringBuffer.append(readLine);
            }
            bufferedReader.close();
            String lowerCase = stringBuffer.toString().toLowerCase();
            if (a10 != null) {
                try {
                    ReflectHelper.invokeInstanceMethod(a10, com.mob.commons.i.a("007jkGhi6fWfjgefk"), new Object[0]);
                } catch (Throwable unused) {
                }
            }
            return lowerCase;
        } catch (Throwable unused2) {
            return "";
        }
    }

    public String aT() {
        return com.mob.commons.b.b.c(this.f8614a);
    }

    public String aU() {
        return com.mob.commons.b.b.d(this.f8614a);
    }

    public String aV() {
        return com.mob.commons.b.b.e(this.f8614a);
    }

    public String aW() {
        return com.mob.commons.b.b.g(this.f8614a);
    }

    public String aX() {
        return com.mob.commons.b.b.f(this.f8614a);
    }

    public HashMap<String, Object> aY() {
        return com.mob.commons.b.b.a(this.f8614a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0031, code lost:
        if (r5 == null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0033, code lost:
        r3.add(r5);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.HashMap<java.lang.String, java.lang.Object> aa() {
        /*
            r9 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.io.FileReader r1 = new java.io.FileReader     // Catch: java.lang.Throwable -> L87
            java.lang.String r2 = "013igFfjgefiGiJfiBg]fefgfmhjge"
            java.lang.String r2 = com.mob.commons.i.a(r2)     // Catch: java.lang.Throwable -> L87
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L87
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L87
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L87
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L87
            r3.<init>()     // Catch: java.lang.Throwable -> L87
            java.lang.String r4 = "010g!fjgefiQk<hihigefjhi"
            java.lang.String r4 = com.mob.commons.i.a(r4)     // Catch: java.lang.Throwable -> L87
            r0.put(r4, r3)     // Catch: java.lang.Throwable -> L87
            r4 = 0
        L24:
            r5 = r4
        L25:
            java.lang.String r6 = r2.readLine()     // Catch: java.lang.Throwable -> L87
            if (r6 == 0) goto L80
            boolean r7 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Throwable -> L87
            if (r7 == 0) goto L37
            if (r5 == 0) goto L24
            r3.add(r5)     // Catch: java.lang.Throwable -> L87
            goto L24
        L37:
            java.lang.String r6 = r6.trim()     // Catch: java.lang.Throwable -> L87
            java.lang.String r7 = "009g5fjgefiQk%hihigefj"
            java.lang.String r7 = com.mob.commons.i.a(r7)     // Catch: java.lang.Throwable -> L87
            boolean r7 = r6.startsWith(r7)     // Catch: java.lang.Throwable -> L87
            if (r7 == 0) goto L51
            if (r5 == 0) goto L4c
            r3.add(r5)     // Catch: java.lang.Throwable -> L87
        L4c:
            java.util.HashMap r5 = new java.util.HashMap     // Catch: java.lang.Throwable -> L87
            r5.<init>()     // Catch: java.lang.Throwable -> L87
        L51:
            java.lang.String r7 = ":"
            java.lang.String[] r6 = r6.split(r7)     // Catch: java.lang.Throwable -> L87
            if (r6 == 0) goto L25
            int r7 = r6.length     // Catch: java.lang.Throwable -> L87
            r8 = 1
            if (r7 <= r8) goto L25
            r7 = 0
            if (r5 != 0) goto L70
            r7 = r6[r7]     // Catch: java.lang.Throwable -> L87
            java.lang.String r7 = r7.trim()     // Catch: java.lang.Throwable -> L87
            r6 = r6[r8]     // Catch: java.lang.Throwable -> L87
            java.lang.String r6 = r6.trim()     // Catch: java.lang.Throwable -> L87
            r0.put(r7, r6)     // Catch: java.lang.Throwable -> L87
            goto L25
        L70:
            r7 = r6[r7]     // Catch: java.lang.Throwable -> L87
            java.lang.String r7 = r7.trim()     // Catch: java.lang.Throwable -> L87
            r6 = r6[r8]     // Catch: java.lang.Throwable -> L87
            java.lang.String r6 = r6.trim()     // Catch: java.lang.Throwable -> L87
            r5.put(r7, r6)     // Catch: java.lang.Throwable -> L87
            goto L25
        L80:
            r2.close()     // Catch: java.lang.Throwable -> L87
            r1.close()     // Catch: java.lang.Throwable -> L87
            goto L8f
        L87:
            r1 = move-exception
            com.mob.tools.log.NLog r2 = com.mob.tools.MobLog.getInstance()
            r2.d(r1)
        L8f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mob.tools.a.b.aa():java.util.HashMap");
    }

    public ArrayList<ArrayList<String>> ab() {
        ArrayList<ArrayList<String>> arrayList = new ArrayList<>();
        if (Build.VERSION.SDK_INT < 28) {
            try {
                FileReader fileReader = new FileReader(com.mob.commons.i.a("017ig fjgefi2iffEfk$ijPfjfgRlk,fjhi"));
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    } else if (!TextUtils.isEmpty(readLine)) {
                        String[] split = readLine.trim().split(" ");
                        if (split.length > 1) {
                            ArrayList<String> arrayList2 = new ArrayList<>();
                            for (String str : split) {
                                if (!TextUtils.isEmpty(str)) {
                                    arrayList2.add(str.trim());
                                }
                            }
                            arrayList.add(arrayList2);
                        }
                    }
                }
                bufferedReader.close();
                fileReader.close();
            } catch (Throwable th2) {
                MobLog.getInstance().d(th2.getMessage(), new Object[0]);
            }
        }
        return arrayList;
    }

    public int ac() {
        try {
            return Settings.System.getInt(this.f8614a.getContentResolver(), "screen_brightness");
        } catch (Throwable th2) {
            MobLog.getInstance().w(th2);
            return -1;
        }
    }

    public int ad() {
        try {
            return Settings.System.getInt(this.f8614a.getContentResolver(), "screen_brightness_mode");
        } catch (Throwable th2) {
            MobLog.getInstance().w(th2);
            return -1;
        }
    }

    public String ae() {
        String a10 = k.a(this.f8614a).a().a(com.mob.commons.i.a("014Hfjgegnfl2kNfjfm,k'gfgn=mkn_fe"), "0");
        return a10 == null ? "0" : a10;
    }

    public HashMap<String, HashMap<String, Long>> af() {
        HashMap<String, HashMap<String, Long>> hashMap = new HashMap<>();
        String[] strArr = {com.mob.commons.i.a("0067hi<j.fifhfj+j"), com.mob.commons.i.a("004j<fh:f<fh")};
        for (int i10 = 0; i10 < 2; i10++) {
            String str = strArr[i10];
            HashMap<String, Long> hashMap2 = new HashMap<>();
            hashMap2.put("available", -1L);
            hashMap2.put(com.mob.commons.i.a("004AhjfjPkk"), -1L);
            hashMap2.put(com.mob.commons.i.a("005fUge3f9fhgf"), -1L);
            hashMap.put(str, hashMap2);
        }
        HashMap hashMap3 = new HashMap();
        try {
            String H = H();
            if (H != null) {
                hashMap3.put(com.mob.commons.i.a("0069hi^j]fifhfj-j"), new StatFs(H));
            }
        } catch (Throwable unused) {
        }
        try {
            File dataDirectory = Environment.getDataDirectory();
            if (dataDirectory != null) {
                hashMap3.put(com.mob.commons.i.a("004j_fhZf!fh"), new StatFs(dataDirectory.getPath()));
            }
        } catch (Throwable unused2) {
        }
        for (Map.Entry entry : hashMap3.entrySet()) {
            StatFs statFs = (StatFs) entry.getValue();
            long blockSizeLong = statFs.getBlockSizeLong() * statFs.getAvailableBlocksLong();
            long blockSizeLong2 = statFs.getBlockSizeLong() * statFs.getFreeBlocksLong();
            long blockSizeLong3 = statFs.getBlockSizeLong() * statFs.getBlockCountLong();
            HashMap<String, Long> hashMap4 = hashMap.get(entry.getKey());
            hashMap4.put("available", Long.valueOf(blockSizeLong));
            hashMap4.put(com.mob.commons.i.a("004*hjfj<kk"), Long.valueOf(blockSizeLong2));
            hashMap4.put(com.mob.commons.i.a("005fTgeIfNfhgf"), Long.valueOf(blockSizeLong3));
        }
        return hashMap;
    }

    public HashMap<String, Long> ag() {
        HashMap<String, Long> hashMap = new HashMap<>();
        hashMap.put("available", -1L);
        hashMap.put(com.mob.commons.i.a("005f$geNf)fhgf"), -1L);
        hashMap.put(com.mob.commons.i.a("0056fghigmgehf"), -1L);
        hashMap.put(com.mob.commons.i.a("009fe+fjRk+hiUe!gegf?j"), -1L);
        try {
            Object d10 = d(com.mob.commons.i.a("008Pfhfi:fEfg[lKfg3f^fk"));
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            ReflectHelper.invokeInstanceMethod(d10, com.mob.commons.i.a("013^hh_kfIik,kn]gefjfkgifmhjge"), memoryInfo);
            hashMap.put("available", Long.valueOf(memoryInfo.availMem));
            hashMap.put(com.mob.commons.i.a("005f9geVfWfhgf"), Long.valueOf(memoryInfo.totalMem));
            hashMap.put(com.mob.commons.i.a("005Lfghigmgehf"), Long.valueOf(memoryInfo.lowMemory ? 1L : 0L));
            hashMap.put(com.mob.commons.i.a("009fe.fjBkWhiQe-gegfIj"), Long.valueOf(memoryInfo.threshold));
        } catch (Throwable unused) {
        }
        return hashMap;
    }

    public String ah() {
        return com.mob.tools.utils.d.a().b();
    }

    public int ai() {
        return -1;
    }

    public boolean aj() {
        BufferedReader bufferedReader;
        Throwable th2;
        String[] strArr = {com.mob.commons.i.a("0201fige0n'gn2f]ge'g2jhge[eYfmhffegn8nCfhhhfghifl"), com.mob.commons.i.a("032jk^gnfjgehe lUgnfhfm=jWfjgefg8j+gnfnIgAgehi8kj=gnfgfmhi-f>fhgfgf%k=fj"), com.mob.commons.i.a("028'gefjhhgn8nkQgehffifhVf$gn2kj+fn(g>gehi*kj;gnBn0fhfmfhhhRk?fj"), com.mob.commons.i.a("027nTge:k*gnhiVeLfgiefeflfegnfj:kj1fgfjEk(fi9fDhiCfWgefjfhhh'k")};
        for (int i10 = 0; i10 < 4; i10++) {
            if (k.a(this.f8614a).a().b(strArr[i10], 0) != null) {
                return true;
            }
        }
        try {
            throw new Exception("test");
        } catch (Throwable th3) {
            for (StackTraceElement stackTraceElement : th3.getStackTrace()) {
                if (stackTraceElement.getClassName().contains(com.mob.commons.i.a("035jkQgnfjgeheIl<gnfhfm%jJfjgefgGj-gnfn4gSgehi7kjIgnji^g@gehi,kjUhlfjfgPjLhh^k"))) {
                    return true;
                }
            }
            try {
                try {
                    ClassLoader.getSystemClassLoader().loadClass(com.mob.commons.i.a("036jk+gnfjgehe)l^gnfhfmWjLfjgefg0j=gnfn0g=gehiYkj6gnjiYg=gehi[kj5jf8kPgf gkCfjhi")).newInstance();
                    try {
                        ClassLoader.getSystemClassLoader().loadClass(com.mob.commons.i.a("035jk2gnfjgehe7lDgnfhfm=j8fjgefgPj=gnfn,g gehiQkj,gnjiHg)gehi'kj7hlfjfgQj(hhCk")).newInstance();
                    } catch (IllegalAccessException | InstantiationException unused) {
                    }
                    return true;
                } catch (Throwable unused2) {
                    try {
                        bufferedReader = new BufferedReader(new FileReader(com.mob.commons.i.a("006igNfjgefiQi") + Process.myPid() + com.mob.commons.i.a("005in>fh8gIhi")));
                        boolean z10 = false;
                        while (true) {
                            try {
                                String readLine = bufferedReader.readLine();
                                if (readLine == null || z10) {
                                    try {
                                        bufferedReader.close();
                                    } catch (IOException e10) {
                                        MobLog.getInstance().d(e10);
                                    }
                                    return z10;
                                }
                                z10 = readLine.toLowerCase().contains(com.mob.commons.i.a("006TfnSgBgehiBkj"));
                            } catch (Throwable th4) {
                                th2 = th4;
                                try {
                                    MobLog.getInstance().d(th2);
                                    return false;
                                } finally {
                                    if (bufferedReader != null) {
                                        try {
                                            bufferedReader.close();
                                        } catch (IOException e11) {
                                            MobLog.getInstance().d(e11);
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Throwable th5) {
                        bufferedReader = null;
                        th2 = th5;
                    }
                }
            } catch (IllegalAccessException | InstantiationException unused3) {
                return true;
            }
        }
    }

    public boolean ak() {
        return (this.f8614a.getResources().getConfiguration().screenLayout & 15) >= 3;
    }

    public boolean al() {
        try {
            return Settings.Secure.getInt(this.f8614a.getContentResolver(), "adb_enabled", 0) > 0;
        } catch (Throwable unused) {
            return false;
        }
    }

    public boolean am() {
        try {
            return Settings.Secure.getInt(this.f8614a.getContentResolver(), "development_settings_enabled", 0) > 0;
        } catch (Throwable unused) {
            return false;
        }
    }

    public boolean an() {
        try {
            IntentFilter intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
            return ((Intent) (Build.VERSION.SDK_INT < 33 ? ReflectHelper.invokeInstanceMethod(this.f8614a, com.mob.commons.i.a("016Ffj0k.hhfghi-fk?fjig8kWfi!k;fg!lk8fj"), new Object[]{null, intentFilter}, new Class[]{BroadcastReceiver.class, IntentFilter.class}) : ReflectHelper.invokeInstanceMethod(this.f8614a, com.mob.commons.i.a("016'fjSk7hhfghi4fk[fjig6kKfiBkPfgAlkEfj"), new Object[]{null, intentFilter, 4}, new Class[]{BroadcastReceiver.class, IntentFilter.class, Integer.TYPE}))).getIntExtra("plugged", -1) == 2;
        } catch (Throwable th2) {
            MobLog.getInstance().d(th2);
            return false;
        }
    }

    public boolean ao() {
        return false;
    }

    public boolean ap() {
        try {
            return (c.a(this.f8614a).b().a(false, 0, this.f8614a.getPackageName(), 1).applicationInfo.flags & 2) != 0;
        } catch (Throwable th2) {
            MobLog.getInstance().d(th2);
            return false;
        }
    }

    public boolean aq() {
        int i10;
        try {
            String property = System.getProperty(com.mob.commons.i.a("014effg$gn:g*fjgefnfkjfgehiIf"));
            String property2 = System.getProperty(com.mob.commons.i.a("014effg+gn;gTfjgefnfkijgefjZf"));
            if (property2 == null) {
                property2 = "-1";
            }
            try {
                i10 = Integer.parseInt(property2);
            } catch (Throwable unused) {
                i10 = -1;
            }
            return (TextUtils.isEmpty(property) || i10 == -1) ? false : true;
        } catch (Throwable unused2) {
            return false;
        }
    }

    public ArrayList<HashMap<String, String>> ar() {
        return null;
    }

    public String as() {
        try {
            String id2 = TimeZone.getDefault().getID();
            if (TextUtils.isEmpty(id2)) {
                Configuration configuration = new Configuration();
                configuration.setToDefaults();
                Settings.System.getConfiguration(this.f8614a.getContentResolver(), configuration);
                Locale locale = configuration.locale;
                if (locale == null) {
                    locale = Locale.getDefault();
                }
                Calendar calendar = Calendar.getInstance(locale);
                return calendar != null ? calendar.getTimeZone().getID() : id2;
            }
            return id2;
        } catch (Throwable th2) {
            MobLog.getInstance().d(th2);
            return null;
        }
    }

    public HashMap<String, Object> at() {
        HashMap<String, Object> hashMap = new HashMap<>();
        try {
            PackageManager packageManager = this.f8614a.getPackageManager();
            if (packageManager != null) {
                try {
                    hashMap.put("mbmt", Boolean.valueOf(packageManager.hasSystemFeature(com.mob.commons.i.a("026;fhfmHj5fjgefg]jBgn(eDfhfj2j+hffhfj6k?gn9fk-gfIkge5gefmfk"))));
                } catch (Throwable unused) {
                }
                try {
                    hashMap.put("wmt", Boolean.valueOf(packageManager.hasSystemFeature(com.mob.commons.i.a("021Ifhfm+jEfjgefgIjYgnRe:fhfjGj$hffhfjHk%gnhffghjfg"))));
                } catch (Throwable unused2) {
                }
                try {
                    hashMap.put("gmt", Boolean.valueOf(packageManager.hasSystemFeature(com.mob.commons.i.a("029$fhfm*j.fjgefgJjOgn$eYfhfjMj^hffhfj0k:gngfgefifh>f7fggefmgnhh0gFhi"))));
                } catch (Throwable unused3) {
                }
                try {
                    hashMap.put("nmt", Boolean.valueOf(packageManager.hasSystemFeature(com.mob.commons.i.a("020]fhfm!jSfjgefg,j?gn+e1fhfjGjFhffhfjSkLgnfmhjfi"))));
                } catch (Throwable unused4) {
                }
                hashMap.put(com.mob.commons.i.a("003.geXf^hh"), Boolean.valueOf(packageManager.hasSystemFeature(com.mob.commons.i.a("0254fhfm$j7fjgefg$j]gnUe+fhfjUjJhffhfj=k+gnfehihegnWe6gehiZf"))));
            }
        } catch (Throwable unused5) {
        }
        return hashMap;
    }

    public HashMap<String, String> au() {
        HashMap<String, String> hashMap = new HashMap<>();
        String i10 = i(com.mob.commons.i.a("053iHhifkhi4ijklKfgfi8k7hiLi-hifkhi+fkni@fi@g4fe iBfi9g4fehg)i[fiTgAfehjfjNkmiVhififhgffgfmhhfffifefjffhjfj(km"));
        if (!TextUtils.isEmpty(i10)) {
            hashMap.put(com.mob.commons.i.a("012Ofifefjfj]k4fmDf4iiYgLfejfie"), i10);
        }
        String i11 = i(com.mob.commons.i.a("053i9hifkhi ijklXfgfi:k0hi7iLhifkhi_fkniKfiXg]fe:iFfi<gIfehg1iYfi4gEfehjfjLkmi)fi1g:fefgfmhjgeff0nSfgfmffhjfjHkm"));
        if (!TextUtils.isEmpty(i11)) {
            hashMap.put(com.mob.commons.i.a("008n6fgfmiiRgTfejfie"), i11);
        }
        String i12 = i(com.mob.commons.i.a("053iZhifkhi_ijklNfgfi kQhiZiOhifkhiNfkni3fiYgJfeQi5fiSgHfehgDi]fi<g@fehjfj[kmi;fiBg1fefgfmhjgeff.nXfhfnffhjfj7km"));
        if (!TextUtils.isEmpty(i12)) {
            hashMap.put(com.mob.commons.i.a("008n^fhfniiGg9fejfie"), i12);
        }
        return hashMap;
    }

    public String av() {
        try {
            return Build.SUPPORTED_ABIS[0];
        } catch (Throwable th2) {
            MobLog.getInstance().d(th2);
            return null;
        }
    }

    public String aw() {
        try {
            return b(com.mob.commons.i.a("015DfjgegnhefefggfHjAgnhjgffhJl<gefj"));
        } catch (Throwable th2) {
            MobLog.getInstance().d(th2);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:92:0x00c7 A[Catch: all -> 0x00f6, TRY_ENTER, TRY_LEAVE, TryCatch #5 {all -> 0x00ff, blocks: (B:89:0x00bb, B:92:0x00c7), top: B:109:0x00bb }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:81:0x00a3 -> B:104:0x00bb). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.HashMap<java.lang.String, java.lang.Object> ax() {
        /*
            Method dump skipped, instructions count: 264
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mob.tools.a.b.ax():java.util.HashMap");
    }

    public String ay() {
        try {
            return b(com.mob.commons.i.a("020ZhhhiAnWgn3lkLfjhifggefmgnhefhhi4k9hefhfm9j"));
        } catch (Throwable th2) {
            MobLog.getInstance().d(th2);
            return null;
        }
    }

    public String az() {
        try {
            return b(com.mob.commons.i.a("016_fjgegn!gQfjge-jJfefi,fXgnhegefhfj?j"));
        } catch (Throwable th2) {
            MobLog.getInstance().d(th2);
            return null;
        }
    }

    public synchronized String b() {
        return null;
    }

    public String b(String str) {
        return k.a(this.f8614a).a().a(str);
    }

    public void b(View view) {
        Object d10 = d("input_method");
        if (d10 == null) {
            return;
        }
        ((InputMethodManager) d10).toggleSoftInputFromWindow(view.getWindowToken(), 2, 0);
    }

    public synchronized String c() {
        return null;
    }

    public String c(String str) {
        try {
            return Data.MD5(c.a(this.f8614a).b().a(false, 0, str, 64).signatures[0].toByteArray());
        } catch (Exception e10) {
            MobLog.getInstance().w(e10);
            return null;
        }
    }

    public Object d(String str) {
        try {
            return this.f8614a.getSystemService(str);
        } catch (Throwable th2) {
            MobLog.getInstance().w(th2);
            return null;
        }
    }

    public String d() {
        String str = Build.MODEL;
        return !TextUtils.isEmpty(str) ? str.trim() : str;
    }

    public String e() {
        return Build.MANUFACTURER;
    }

    public String e(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            return c.a(this.f8614a).b().a(false, 0, str, 1).applicationInfo.loadLabel(this.f8614a.getPackageManager()).toString();
        } catch (Throwable th2) {
            MobLog.getInstance().d(th2);
            return null;
        }
    }

    public String f() {
        String g10 = g();
        return TextUtils.isEmpty(g10) ? i() : g10;
    }

    public boolean f(String str) {
        int i10 = -1;
        if (Build.VERSION.SDK_INT >= 23) {
            try {
                ReflectHelper.importClass(com.mob.commons.i.a("023Jfhfm6jBfjgefg>jSgnfigefm*fkVfmBf0gniigefmXfkVfnMf"));
                Integer num = (Integer) ReflectHelper.invokeInstanceMethod(this.f8614a, com.mob.commons.i.a("0191fi5ek(fiflgj:kRgfhjijFk%fj[n@fghihifggefm"), str);
                if (num != null) {
                    i10 = num.intValue();
                }
            } catch (Throwable th2) {
                MobLog.getInstance().d(th2);
            }
        } else {
            i10 = this.f8614a.getPackageManager().checkPermission(str, C());
        }
        return i10 == 0;
    }

    public synchronized String g() {
        return null;
    }

    public String g(String str) {
        return null;
    }

    public boolean h(String str) {
        try {
            return c.a(this.f8614a).b().a(true, 0, str, 0) != null;
        } catch (Throwable unused) {
            return false;
        }
    }

    public synchronized String[] h() {
        return null;
    }

    public String i() {
        return null;
    }

    public String i(String str) {
        StringBuilder sb2 = new StringBuilder();
        try {
            FileReader fileReader = new FileReader(str);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                String trim = readLine.trim();
                if (sb2.length() > 0) {
                    sb2.append("\n");
                }
                sb2.append(trim);
            }
            bufferedReader.close();
            fileReader.close();
        } catch (Throwable th2) {
            MobLog.getInstance().d(th2);
        }
        return sb2.toString();
    }

    public String j() {
        try {
            String str = c.a(this.f8614a).b().y() + "|" + l() + "|" + e() + "|" + r() + "|" + q();
            String A = A();
            if (A == null) {
                A = "";
            } else if (A.length() > 16) {
                A = A.substring(0, 16);
            }
            return a(str, A);
        } catch (Throwable th2) {
            MobLog.getInstance().w(th2);
            return "";
        }
    }

    public boolean j(String str) {
        try {
            String importClass = ReflectHelper.importClass(com.mob.commons.i.a("037 fhfmZj fjgefg>jQfngnfigefjLk9gnfhIggXgnglSgg;hnVgDhiikfhfmfhhh8kDfjiige3ngBfhUf"));
            return ((Integer) ReflectHelper.invokeStaticMethod(importClass, com.mob.commons.i.a("011,fmgeOfk ijfjgefnfkhn-g"), this.f8614a, (String) ReflectHelper.invokeStaticMethod(importClass, com.mob.commons.i.a("014gk+fjBn>fghihifggefmgkgehn,g"), str), C())).intValue() == 1;
        } catch (Throwable th2) {
            MobLog.getInstance().d(th2);
            return false;
        }
    }

    public String k() {
        return c.a(this.f8614a).b().y() + "|" + l() + "|" + e() + "|" + r() + "|" + q();
    }

    public int l() {
        return Build.VERSION.SDK_INT;
    }

    public String m() {
        try {
            return Build.VERSION.RELEASE;
        } catch (Throwable unused) {
            return null;
        }
    }

    public String n() {
        return Locale.getDefault().getLanguage();
    }

    public String o() {
        return this.f8614a.getResources().getConfiguration().locale.getLanguage();
    }

    public String p() {
        return Locale.getDefault().getCountry();
    }

    public String q() {
        StringBuilder sb2;
        int i10;
        int[] screenSize = ResHelper.getScreenSize(this.f8614a);
        if (this.f8614a.getResources().getConfiguration().orientation == 1) {
            sb2 = new StringBuilder();
            sb2.append(screenSize[0]);
            sb2.append("x");
            i10 = screenSize[1];
        } else {
            sb2 = new StringBuilder();
            sb2.append(screenSize[1]);
            sb2.append("x");
            i10 = screenSize[0];
        }
        sb2.append(i10);
        return sb2.toString();
    }

    public String r() {
        try {
            Object d10 = d("phone");
            if (d10 == null) {
                return "-1";
            }
            String str = (String) ReflectHelper.invokeInstanceMethod(d10, com.mob.commons.i.a("014Xhh.kfIgjfgUn+hnKgk0fjfhMfCgefj"), new Object[0]);
            return TextUtils.isEmpty(str) ? "-1" : str;
        } catch (Throwable th2) {
            MobLog.getInstance().w(th2);
            return "-1";
        }
    }

    public String s() {
        Object d10 = d("phone");
        if (d10 == null) {
            return null;
        }
        try {
            if (f(com.mob.commons.i.a("0352fhfm?j%fjgefg!jOgnDgkPfj0n>fghihifggefmgnigifglhkffijjfhnghifffgjgkglgkif"))) {
                String str = (String) ReflectHelper.invokeInstanceMethod(d10, com.mob.commons.i.a("0180hh!kf5gjfgVnDhn8gk4fjfhRfBgefjghfh$nk"), new Object[0]);
                if (TextUtils.isEmpty(str)) {
                    return null;
                }
                return str;
            }
        } catch (Throwable th2) {
            MobLog.getInstance().w(th2);
        }
        return null;
    }

    public String t() {
        return "-1";
    }

    public String u() {
        return null;
    }

    public String v() {
        try {
            return Data.MD5(c.a(this.f8614a).b().a(false, 0, C(), 64).signatures[0].toByteArray());
        } catch (Exception e10) {
            MobLog.getInstance().w(e10);
            return null;
        }
    }

    public String w() {
        return NtFetcher.getInstance(this.f8614a).getNtType();
    }

    public boolean x() {
        try {
            String z10 = z();
            if (!com.mob.commons.i.a("004(hffghjfg").equals(z10) && !com.mob.commons.i.a("002^jghh").equals(z10) && !com.mob.commons.i.a("002Jlkhh").equals(z10) && !com.mob.commons.i.a("002Hlehh").equals(z10)) {
                if (!com.mob.commons.i.a("002Aimhh").equals(z10)) {
                    return false;
                }
            }
            return true;
        } catch (Throwable th2) {
            MobLog.getInstance().d(th2);
            return false;
        }
    }

    public String y() {
        String lowerCase = w().toLowerCase();
        return com.mob.commons.i.a((TextUtils.isEmpty(lowerCase) || com.mob.commons.i.a("0044fmgefm0k").equals(lowerCase)) ? "004Zfmgefm.k" : (lowerCase.startsWith(com.mob.commons.i.a("002Rjghh")) || lowerCase.startsWith(com.mob.commons.i.a("002Glkhh")) || lowerCase.startsWith(com.mob.commons.i.a("002Ylehh")) || lowerCase.startsWith(com.mob.commons.i.a("002'imhh"))) ? "004>fiMkZgfgf" : lowerCase.startsWith(com.mob.commons.i.a("004Phffghjfg")) ? "004Chffghjfg" : "005SgePfek$fj");
    }

    public String z() {
        try {
            String lowerCase = w().toLowerCase();
            if (!TextUtils.isEmpty(lowerCase) && !com.mob.commons.i.a("004NfmgefmWk").equals(lowerCase)) {
                return lowerCase.startsWith(com.mob.commons.i.a("004Uhffghjfg")) ? com.mob.commons.i.a("004Bhffghjfg") : lowerCase.startsWith(com.mob.commons.i.a("0025jghh")) ? com.mob.commons.i.a("0023jghh") : lowerCase.startsWith(com.mob.commons.i.a("0028lkhh")) ? com.mob.commons.i.a("002+lkhh") : lowerCase.startsWith(com.mob.commons.i.a("002Zlehh")) ? com.mob.commons.i.a("002Ylehh") : lowerCase.startsWith(com.mob.commons.i.a("0024imhh")) ? com.mob.commons.i.a("002Bimhh") : lowerCase.startsWith(com.mob.commons.i.a("009?hegffe>kf+gegeOfe")) ? com.mob.commons.i.a("009DhegffeGkf5gege>fe") : lowerCase;
            }
            return com.mob.commons.i.a("004_fmgefmRk");
        } catch (Throwable th2) {
            MobLog.getInstance().w(th2);
            return com.mob.commons.i.a("004GfmgefmHk");
        }
    }
}
