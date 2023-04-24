package com.mob.tools.b;

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import androidx.appcompat.widget.t2;
import com.mob.MobSDK;
import com.mob.tools.MobLog;
import com.mob.tools.a.c;
import com.mob.tools.a.d;
import com.mob.tools.log.NLog;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a */
    public static ThreadLocal<Boolean> f9104a = new ThreadLocal<>();

    /* renamed from: b */
    public static ThreadLocal<Boolean> f9105b = new ThreadLocal<>();

    /* renamed from: c */
    public static ThreadLocal<Boolean> f9106c = new ThreadLocal<>();

    /* renamed from: d */
    private static final List<String> f9107d = Arrays.asList("bgmdl", "gmnft", "gbrd", "govsit", "govsnm", "golgu", "gocnty", "galgu", "gtmne", "gsnmd", "gpgnm", "gpnmmt", "gpvsnm", "gpvsme", "cinmnps", "ckpmsi", "gaplcn", "gpgif", "gpgiffist", "gbrdm", "unrgrcv", "rgrcv", "gcrtpcnm", "gscpt", "cird", "cknavbl", "ipgist", "ckua", "ubenbl", "dvenbl", "vnmt", "iwpxy", "cx", "degb", "istvdv", "gdtlnktpfs", "gpgiffcin", "gpgifstrg", "gtaif", "gtaifprm", "rsaciy", "gisi", "gsnmdfp", "gcrie", "gcriefce", "gdvk", "gdvkfc", "gssn", "gpsavlb");

    private static com.mob.tools.a.a a() {
        return d.b() ? c.a(MobSDK.getContext()).f() : c.a(MobSDK.getContext()).a();
    }

    private static com.mob.tools.a.a a(String str) {
        CountDownLatch c10;
        CountDownLatch c11;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (Looper.myLooper() == Looper.getMainLooper()) {
            NLog mobLog = MobLog.getInstance();
            mobLog.w("WARNING: Call in main: key = " + str);
            b();
        }
        try {
        } catch (Throwable th2) {
            MobLog.getInstance().d(th2);
        }
        if (!(f9104a.get() == null ? false : f9104a.get().booleanValue())) {
            if (!f9107d.contains(str) && !d.b() && (c11 = d.a(MobSDK.getContext()).c()) != null) {
                NLog mobLog2 = MobLog.getInstance();
                mobLog2.d("dhs_ivkr k: " + str + ", cdl: " + c11, new Object[0]);
                c11.await(3500L, TimeUnit.MILLISECONDS);
            }
            return a();
        }
        boolean booleanValue = f9105b.get() == null ? false : f9105b.get().booleanValue();
        boolean booleanValue2 = f9106c.get() == null ? false : f9106c.get().booleanValue();
        if (booleanValue) {
            MobLog.getInstance().d("isGCFThread true", new Object[0]);
        }
        if (!booleanValue && !booleanValue2 && !d.b() && (c10 = d.a(MobSDK.getContext()).c()) != null) {
            NLog mobLog3 = MobLog.getInstance();
            mobLog3.d("dhs_ivkr_new k: " + str + ", cdl: " + c10, new Object[0]);
            c10.await(3500L, TimeUnit.MILLISECONDS);
        }
        return a();
        return a();
    }

    @b
    public static Object a(String str, ArrayList<Object> arrayList) {
        try {
            return b(str, arrayList);
        } catch (Throwable th2) {
            MobLog.getInstance().d(th2);
            return null;
        }
    }

    private static Object b(String str, ArrayList<Object> arrayList) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        com.mob.tools.a.a a10 = a(str);
        if ("cird".equals(str)) {
            return Boolean.valueOf(a10.a());
        }
        if ("cx".equals(str)) {
            return Boolean.valueOf(a10.b());
        }
        if ("ckpd".equals(str)) {
            return Boolean.valueOf(a10.c());
        }
        if ("degb".equals(str)) {
            return Boolean.valueOf(a10.d());
        }
        if ("vnmt".equals(str)) {
            return Boolean.valueOf(a10.e());
        }
        if ("ckua".equals(str)) {
            return Boolean.valueOf(a10.f());
        }
        if ("dvenbl".equals(str)) {
            return Boolean.valueOf(a10.g());
        }
        if ("ubenbl".equals(str)) {
            return Boolean.valueOf(a10.h());
        }
        if ("iwpxy".equals(str)) {
            return Boolean.valueOf(a10.i());
        }
        if ("ismlt".equals(str)) {
            return Boolean.valueOf(a10.j());
        }
        if ("ifkps".equals(str)) {
            if (arrayList != null && arrayList.size() == 1) {
                return Boolean.valueOf(a10.a((String) arrayList.get(0)));
            }
            throw new Throwable(t2.a("array illegal: ", arrayList));
        } else if ("istvdv".equals(str)) {
            return Boolean.valueOf(a10.k());
        } else {
            if ("gsrln".equals(str)) {
                return a10.l();
            }
            if ("gavti".equals(str)) {
                return a10.m();
            }
            if ("gimi".equals(str)) {
                return a10.n();
            }
            if ("gimip".equals(str)) {
                if (arrayList != null && arrayList.size() == 1) {
                    return a10.a(((Boolean) arrayList.get(0)).booleanValue());
                }
                throw new Throwable(t2.a("array illegal: ", arrayList));
            } else if ("gimimem".equals(str)) {
                return a10.o();
            } else {
                if ("gisi".equals(str)) {
                    return a10.p();
                }
                if ("gisip".equals(str)) {
                    if (arrayList != null && arrayList.size() == 1) {
                        return a10.b(((Boolean) arrayList.get(0)).booleanValue());
                    }
                    throw new Throwable(t2.a("array illegal: ", arrayList));
                } else if ("qryisi".equals(str)) {
                    return a10.q();
                } else {
                    if ("gsimt".equals(str)) {
                        return a10.r();
                    }
                    if ("gbsi".equals(str)) {
                        return a10.s();
                    }
                    if ("gcrie".equals(str)) {
                        return a10.t();
                    }
                    if ("gcriefce".equals(str)) {
                        if (arrayList != null && arrayList.size() == 1) {
                            return a10.c(((Boolean) arrayList.get(0)).booleanValue());
                        }
                        throw new Throwable(t2.a("array illegal: ", arrayList));
                    } else if ("gcrnmfce".equals(str)) {
                        if (arrayList != null && arrayList.size() == 1) {
                            return a10.d(((Boolean) arrayList.get(0)).booleanValue());
                        }
                        throw new Throwable(t2.a("array illegal: ", arrayList));
                    } else if ("gcrnm".equals(str)) {
                        return a10.u();
                    } else {
                        if ("gssn".equals(str)) {
                            return a10.v();
                        }
                        if ("gmivsn".equals(str)) {
                            return a10.w();
                        }
                        if ("godmt".equals(str)) {
                            return a10.x();
                        }
                        if ("bgmdl".equals(str)) {
                            return a10.y();
                        }
                        if ("gmnft".equals(str)) {
                            return a10.z();
                        }
                        if ("gbrd".equals(str)) {
                            return a10.A();
                        }
                        if ("gdvtp".equals(str)) {
                            return a10.B();
                        }
                        if ("qriei".equals(str)) {
                            return a10.C();
                        }
                        if ("gbhnm".equals(str)) {
                            return a10.D();
                        }
                        if ("gcld".equals(str)) {
                            return Integer.valueOf(a10.E());
                        }
                        if ("gcllc".equals(str)) {
                            return Integer.valueOf(a10.F());
                        }
                        if ("gpcmt".equals(str)) {
                            return Integer.valueOf(a10.G());
                        }
                        if ("gcmlt".equals(str)) {
                            return Integer.valueOf(a10.H());
                        }
                        if ("gcmln".equals(str)) {
                            return Integer.valueOf(a10.I());
                        }
                        if ("gcmbd".equals(str)) {
                            return Integer.valueOf(a10.J());
                        }
                        if ("gcmsd".equals(str)) {
                            return Integer.valueOf(a10.K());
                        }
                        if ("gcmnd".equals(str)) {
                            return Integer.valueOf(a10.L());
                        }
                        if ("gnbclin".equals(str)) {
                            return a10.M();
                        }
                        if ("wmcwi".equals(str)) {
                            return a10.N();
                        }
                        if ("gavlwls".equals(str)) {
                            return a10.O();
                        }
                        if ("scwls".equals(str)) {
                            return Boolean.valueOf(a10.P());
                        }
                        if ("govsit".equals(str)) {
                            return Integer.valueOf(a10.Q());
                        }
                        if ("govsnm".equals(str)) {
                            return a10.R();
                        }
                        if ("golgu".equals(str)) {
                            return a10.S();
                        }
                        if ("gocnty".equals(str)) {
                            return a10.T();
                        }
                        if ("gcuin".equals(str)) {
                            return a10.U();
                        }
                        if ("gtydvin".equals(str)) {
                            return a10.V();
                        }
                        if ("gbtrstt".equals(str)) {
                            if (arrayList != null && arrayList.size() == 1) {
                                a10.a((Handler.Callback) arrayList.get(0));
                                return null;
                            }
                            throw new Throwable(t2.a("array illegal: ", arrayList));
                        } else if ("gsnbtns".equals(str)) {
                            return Integer.valueOf(a10.W());
                        } else {
                            if ("gsnbtmd".equals(str)) {
                                return Integer.valueOf(a10.X());
                            }
                            if ("gqmkn".equals(str)) {
                                return a10.Y();
                            }
                            if ("gszin".equals(str)) {
                                return a10.Z();
                            }
                            if ("gmrin".equals(str)) {
                                return a10.aa();
                            }
                            if ("gabct".equals(str)) {
                                return Integer.valueOf(a10.ab());
                            }
                            if ("galgu".equals(str)) {
                                return a10.ac();
                            }
                            if ("gscsz".equals(str)) {
                                return a10.ad();
                            }
                            if ("gneyp".equals(str)) {
                                return a10.ae();
                            }
                            if ("gneypfce".equals(str)) {
                                if (arrayList != null && arrayList.size() == 1) {
                                    return a10.e(((Boolean) arrayList.get(0)).booleanValue());
                                }
                                throw new Throwable(t2.a("array illegal: ", arrayList));
                            } else if ("gnktpfs".equals(str)) {
                                return a10.af();
                            } else {
                                if ("gdtlnktpfs".equals(str)) {
                                    return a10.ag();
                                }
                                if ("cknavbl".equals(str)) {
                                    return Boolean.valueOf(a10.ah());
                                }
                                if ("gdntp".equals(str)) {
                                    return Integer.valueOf(a10.ai());
                                }
                                if ("gcrslt".equals(str)) {
                                    return a10.aj();
                                }
                                if ("gtmne".equals(str)) {
                                    return a10.ak();
                                }
                                if ("gspt".equals(str)) {
                                    return a10.al();
                                }
                                if ("gcfre".equals(str)) {
                                    return a10.am();
                                }
                                if ("gctp".equals(str)) {
                                    return a10.an();
                                }
                                if ("gflv".equals(str)) {
                                    return a10.ao();
                                }
                                if ("gtrc".equals(str)) {
                                    return a10.ap();
                                }
                                if ("gbsbd".equals(str)) {
                                    return a10.aq();
                                }
                                if ("gbfspy".equals(str)) {
                                    return a10.ar();
                                }
                                if ("gbplfo".equals(str)) {
                                    return a10.as();
                                }
                                if ("gdvmua".equals(str)) {
                                    return a10.at();
                                }
                                if ("giads".equals(str)) {
                                    return a10.au();
                                }
                                if ("gia".equals(str)) {
                                    if (arrayList != null && arrayList.size() == 1) {
                                        return a10.f(((Boolean) arrayList.get(0)).booleanValue());
                                    }
                                    throw new Throwable(t2.a("array illegal: ", arrayList));
                                } else if ("gal".equals(str)) {
                                    return a10.av();
                                } else {
                                    if ("gsl".equals(str)) {
                                        return a10.aw();
                                    }
                                    if ("glctn".equals(str)) {
                                        if (arrayList != null && arrayList.size() == 3) {
                                            return a10.a(((Integer) arrayList.get(0)).intValue(), ((Integer) arrayList.get(1)).intValue(), ((Boolean) arrayList.get(2)).booleanValue());
                                        }
                                        throw new Throwable(t2.a("array illegal: ", arrayList));
                                    } else if ("gstmpts".equals(str)) {
                                        if (arrayList != null && arrayList.size() == 1) {
                                            return a10.b((String) arrayList.get(0));
                                        }
                                        throw new Throwable(t2.a("array illegal: ", arrayList));
                                    } else if ("gdvci".equals(str)) {
                                        return a10.ax();
                                    } else {
                                        if ("gdvk".equals(str)) {
                                            return a10.ay();
                                        }
                                        if ("gdvkfc".equals(str)) {
                                            if (arrayList != null && arrayList.size() == 1) {
                                                return a10.g(((Boolean) arrayList.get(0)).booleanValue());
                                            }
                                            throw new Throwable(t2.a("array illegal: ", arrayList));
                                        } else if ("gdfrspg".equals(str)) {
                                            if (arrayList != null && arrayList.size() == 1) {
                                                return a10.c((String) arrayList.get(0));
                                            }
                                            throw new Throwable(t2.a("array illegal: ", arrayList));
                                        } else if ("grsvps".equals(str)) {
                                            if (arrayList != null && arrayList.size() == 1) {
                                                return a10.d((String) arrayList.get(0));
                                            }
                                            throw new Throwable(t2.a("array illegal: ", arrayList));
                                        } else if ("gdltmpg".equals(str)) {
                                            return a10.az();
                                        } else {
                                            if ("gdltm".equals(str)) {
                                                return a10.aA();
                                            }
                                            if ("gmlt".equals(str)) {
                                                return a10.aB();
                                            }
                                            if ("ipgist".equals(str)) {
                                                if (arrayList != null && arrayList.size() == 1) {
                                                    return Boolean.valueOf(a10.e((String) arrayList.get(0)));
                                                }
                                                throw new Throwable(t2.a("array illegal: ", arrayList));
                                            } else if ("gscpt".equals(str)) {
                                                return a10.aC();
                                            } else {
                                                if ("gsnmd".equals(str)) {
                                                    return a10.aD();
                                                }
                                                if ("gsnmdfp".equals(str)) {
                                                    if (arrayList != null && arrayList.size() == 1) {
                                                        return a10.f((String) arrayList.get(0));
                                                    }
                                                    throw new Throwable(t2.a("array illegal: ", arrayList));
                                                } else if ("gpgnm".equals(str)) {
                                                    return a10.aE();
                                                } else {
                                                    if ("gpnmmt".equals(str)) {
                                                        return a10.aF();
                                                    }
                                                    if ("gpnmfp".equals(str)) {
                                                        if (arrayList != null && arrayList.size() == 1) {
                                                            return a10.g((String) arrayList.get(0));
                                                        }
                                                        throw new Throwable(t2.a("array illegal: ", arrayList));
                                                    } else if ("gpvsnm".equals(str)) {
                                                        return Integer.valueOf(a10.aG());
                                                    } else {
                                                        if ("gpvsme".equals(str)) {
                                                            return a10.aH();
                                                        }
                                                        if ("cinmnps".equals(str)) {
                                                            return Boolean.valueOf(a10.aI());
                                                        }
                                                        if ("gcrtpcnm".equals(str)) {
                                                            return a10.aJ();
                                                        }
                                                        if ("ciafgd".equals(str)) {
                                                            return Boolean.valueOf(a10.aK());
                                                        }
                                                        if ("ckpmsi".equals(str)) {
                                                            if (arrayList != null && arrayList.size() == 1) {
                                                                return Boolean.valueOf(a10.h((String) arrayList.get(0)));
                                                            }
                                                            throw new Throwable(t2.a("array illegal: ", arrayList));
                                                        } else if ("crtavthd".equals(str)) {
                                                            return a10.aL();
                                                        } else {
                                                            if ("gaplcn".equals(str)) {
                                                                return a10.aM();
                                                            }
                                                            if ("qritsvc".equals(str)) {
                                                                if (arrayList != null && arrayList.size() == 2) {
                                                                    return a10.a((Intent) arrayList.get(0), ((Integer) arrayList.get(1)).intValue());
                                                                }
                                                                throw new Throwable(t2.a("array illegal: ", arrayList));
                                                            } else if ("rsaciy".equals(str)) {
                                                                if (arrayList != null && arrayList.size() == 2) {
                                                                    return a10.b((Intent) arrayList.get(0), ((Integer) arrayList.get(1)).intValue());
                                                                }
                                                                throw new Throwable(t2.a("array illegal: ", arrayList));
                                                            } else if ("gpgif".equals(str)) {
                                                                if (arrayList != null && arrayList.size() == 2) {
                                                                    return a10.a(false, 0, (String) arrayList.get(0), ((Integer) arrayList.get(1)).intValue());
                                                                }
                                                                throw new Throwable(t2.a("array illegal: ", arrayList));
                                                            } else if ("gpgiffcin".equals(str)) {
                                                                if (arrayList != null && arrayList.size() == 3) {
                                                                    return a10.a(((Boolean) arrayList.get(0)).booleanValue(), 0, (String) arrayList.get(1), ((Integer) arrayList.get(2)).intValue());
                                                                }
                                                                throw new Throwable(t2.a("array illegal: ", arrayList));
                                                            } else if ("gpgifstrg".equals(str)) {
                                                                if (arrayList != null && arrayList.size() == 3) {
                                                                    return a10.a(false, ((Integer) arrayList.get(0)).intValue(), (String) arrayList.get(1), ((Integer) arrayList.get(2)).intValue());
                                                                }
                                                                throw new Throwable(t2.a("array illegal: ", arrayList));
                                                            } else if ("gpgiffist".equals(str)) {
                                                                if (arrayList != null && arrayList.size() == 4) {
                                                                    return a10.a(((Boolean) arrayList.get(0)).booleanValue(), ((Integer) arrayList.get(1)).intValue(), (String) arrayList.get(2), ((Integer) arrayList.get(3)).intValue());
                                                                }
                                                                throw new Throwable(t2.a("array illegal: ", arrayList));
                                                            } else if ("hdstipu".equals(str)) {
                                                                if (arrayList != null && arrayList.size() == 1) {
                                                                    a10.a((View) arrayList.get(0));
                                                                    return null;
                                                                }
                                                                throw new Throwable(t2.a("array illegal: ", arrayList));
                                                            } else if ("swstin".equals(str)) {
                                                                if (arrayList != null && arrayList.size() == 1) {
                                                                    a10.b((View) arrayList.get(0));
                                                                    return null;
                                                                }
                                                                throw new Throwable(t2.a("array illegal: ", arrayList));
                                                            } else if ("gdvda".equals(str)) {
                                                                return a10.aN();
                                                            } else {
                                                                if ("gdvdtnas".equals(str)) {
                                                                    return a10.aO();
                                                                }
                                                                if ("bsasm".equals(str)) {
                                                                    if (arrayList != null && arrayList.size() == 2) {
                                                                        return a10.a((String) arrayList.get(0), (String) arrayList.get(1));
                                                                    }
                                                                    throw new Throwable(t2.a("array illegal: ", arrayList));
                                                                } else if ("galtut".equals(str)) {
                                                                    return Long.valueOf(a10.aP());
                                                                } else {
                                                                    if ("gbrdm".equals(str)) {
                                                                        return a10.aQ();
                                                                    }
                                                                    if ("gdvme".equals(str)) {
                                                                        return a10.aR();
                                                                    }
                                                                    if ("gdpyd".equals(str)) {
                                                                        return a10.aS();
                                                                    }
                                                                    if ("gfgrnt".equals(str)) {
                                                                        return a10.aT();
                                                                    }
                                                                    if ("grivsn".equals(str)) {
                                                                        return a10.aU();
                                                                    }
                                                                    if ("gcrup".equals(str)) {
                                                                        return a10.aV();
                                                                    }
                                                                    if ("gcifm".equals(str)) {
                                                                        return a10.aW();
                                                                    }
                                                                    if ("godm".equals(str)) {
                                                                        return a10.aX();
                                                                    }
                                                                    if ("godhm".equals(str)) {
                                                                        return a10.aY();
                                                                    }
                                                                    if ("gadm".equals(str)) {
                                                                        return a10.aZ();
                                                                    }
                                                                    if ("gvdm".equals(str)) {
                                                                        return a10.ba();
                                                                    }
                                                                    if ("gudm".equals(str)) {
                                                                        return a10.bb();
                                                                    }
                                                                    if ("galdm".equals(str)) {
                                                                        return a10.bc();
                                                                    }
                                                                    if ("unrgrcv".equals(str)) {
                                                                        if (arrayList != null && arrayList.size() == 1) {
                                                                            a10.a((BroadcastReceiver) arrayList.get(0));
                                                                            return null;
                                                                        }
                                                                        throw new Throwable(t2.a("array illegal: ", arrayList));
                                                                    } else if ("rgrcv".equals(str)) {
                                                                        if (arrayList != null && arrayList.size() == 2) {
                                                                            a10.a((BroadcastReceiver) arrayList.get(0), (IntentFilter) arrayList.get(1));
                                                                            return null;
                                                                        }
                                                                        throw new Throwable(t2.a("array illegal: ", arrayList));
                                                                    } else if ("rgwsr".equals(str)) {
                                                                        if (arrayList != null && arrayList.size() == 1) {
                                                                            a10.a((BlockingQueue) arrayList.get(0));
                                                                            return null;
                                                                        }
                                                                        throw new Throwable(t2.a("array illegal: ", arrayList));
                                                                    } else if ("gtaif".equals(str)) {
                                                                        return a10.bd();
                                                                    } else {
                                                                        if ("gtaifok".equals(str)) {
                                                                            return a10.be();
                                                                        }
                                                                        if ("gtaifprm".equals(str)) {
                                                                            if (arrayList != null && arrayList.size() == 2) {
                                                                                return a10.a((String) arrayList.get(0), ((Integer) arrayList.get(1)).intValue());
                                                                            }
                                                                            throw new Throwable(t2.a("array illegal: ", arrayList));
                                                                        } else if (!"gpsavlb".equals(str)) {
                                                                            return null;
                                                                        } else {
                                                                            return Boolean.valueOf(a10.bf());
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    private static void b() {
        try {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            if (stackTrace != null) {
                String str = "";
                for (StackTraceElement stackTraceElement : stackTrace) {
                    if (stackTraceElement != null) {
                        str = str + stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName() + "(" + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + ")\n";
                    }
                }
                MobLog.getInstance().d(str, new Object[0]);
            }
        } catch (Throwable th2) {
            MobLog.getInstance().d(th2);
        }
    }
}
