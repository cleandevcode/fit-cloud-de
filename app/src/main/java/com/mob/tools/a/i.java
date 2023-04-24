package com.mob.tools.a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.ResolveInfo;
import android.location.Location;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import com.mob.commons.s;
import com.mob.tools.MobLog;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class i implements com.mob.tools.a.a {

    /* renamed from: a */
    private ConcurrentHashMap<String, Object> f8947a = new ConcurrentHashMap<>();

    /* renamed from: b */
    private ConcurrentHashMap<String, Integer> f8948b = new ConcurrentHashMap<>();

    /* renamed from: c */
    private ConcurrentHashMap<String, Long> f8949c = new ConcurrentHashMap<>();

    /* renamed from: d */
    private Context f8950d;

    /* renamed from: e */
    private b f8951e;

    /* loaded from: classes.dex */
    public static abstract class a<T> {

        /* renamed from: e */
        public T f9095e;

        /* renamed from: f */
        public int f9096f;

        /* renamed from: g */
        public long f9097g;

        public a(T t10) {
            this(t10, 1, 0L);
        }

        public a(T t10, int i10, long j10) {
            this.f9095e = t10;
            this.f9096f = i10;
            this.f9097g = j10;
        }

        public a(T t10, long j10) {
            this(t10, 1, j10);
        }

        public abstract T b();
    }

    public i(Context context) {
        this.f8950d = context;
        this.f8951e = b.a(context);
    }

    private <T> T a(String str, a<T> aVar) {
        return (T) a(str, (a<Object>) aVar, false);
    }

    @Override // com.mob.tools.a.a
    public String A() {
        return (String) a("brd", new a<String>(null) { // from class: com.mob.tools.a.i.42
            @Override // com.mob.tools.a.i.a
            /* renamed from: a */
            public String b() {
                return i.this.f8951e.aF();
            }
        });
    }

    @Override // com.mob.tools.a.a
    public String B() {
        return (String) a("dte", new a<String>(null) { // from class: com.mob.tools.a.i.43
            @Override // com.mob.tools.a.i.a
            /* renamed from: a */
            public String b() {
                return i.this.f8951e.U();
            }
        });
    }

    @Override // com.mob.tools.a.a
    public String[] C() {
        return (String[]) a("ieia", new a<String[]>(null) { // from class: com.mob.tools.a.i.44
            @Override // com.mob.tools.a.i.a
            /* renamed from: a */
            public String[] b() {
                return i.this.f8951e.h();
            }
        });
    }

    @Override // com.mob.tools.a.a
    public String D() {
        return (String) a("bne", new a<String>(null) { // from class: com.mob.tools.a.i.46
            @Override // com.mob.tools.a.i.a
            /* renamed from: a */
            public String b() {
                return i.this.f8951e.u();
            }
        });
    }

    @Override // com.mob.tools.a.a
    public int E() {
        return ((Integer) a("bscld", new a<Integer>(-1, 180000L) { // from class: com.mob.tools.a.i.47
            @Override // com.mob.tools.a.i.a
            /* renamed from: a */
            public Integer b() {
                return Integer.valueOf(i.this.f8951e.L());
            }
        })).intValue();
    }

    @Override // com.mob.tools.a.a
    public int F() {
        return ((Integer) a("bscllc", new a<Integer>(-1, 180000L) { // from class: com.mob.tools.a.i.48
            @Override // com.mob.tools.a.i.a
            /* renamed from: a */
            public Integer b() {
                return Integer.valueOf(i.this.f8951e.M());
            }
        })).intValue();
    }

    @Override // com.mob.tools.a.a
    public int G() {
        return ((Integer) a("bsps", new a<Integer>(-1, 180000L) { // from class: com.mob.tools.a.i.49
            @Override // com.mob.tools.a.i.a
            /* renamed from: a */
            public Integer b() {
                return Integer.valueOf(i.this.f8951e.N());
            }
        })).intValue();
    }

    @Override // com.mob.tools.a.a
    public int H() {
        return ((Integer) a("bscalt", new a<Integer>(-1, 180000L) { // from class: com.mob.tools.a.i.50
            @Override // com.mob.tools.a.i.a
            /* renamed from: a */
            public Integer b() {
                return Integer.valueOf(i.this.f8951e.O());
            }
        })).intValue();
    }

    @Override // com.mob.tools.a.a
    public int I() {
        return ((Integer) a("bscaln", new a<Integer>(-1, 180000L) { // from class: com.mob.tools.a.i.51
            @Override // com.mob.tools.a.i.a
            /* renamed from: a */
            public Integer b() {
                return Integer.valueOf(i.this.f8951e.P());
            }
        })).intValue();
    }

    @Override // com.mob.tools.a.a
    public int J() {
        return ((Integer) a("bscabd", new a<Integer>(-1, 180000L) { // from class: com.mob.tools.a.i.52
            @Override // com.mob.tools.a.i.a
            /* renamed from: a */
            public Integer b() {
                return Integer.valueOf(i.this.f8951e.Q());
            }
        })).intValue();
    }

    @Override // com.mob.tools.a.a
    public int K() {
        return ((Integer) a("bscasd", new a<Integer>(-1, 180000L) { // from class: com.mob.tools.a.i.53
            @Override // com.mob.tools.a.i.a
            /* renamed from: a */
            public Integer b() {
                return Integer.valueOf(i.this.f8951e.R());
            }
        })).intValue();
    }

    @Override // com.mob.tools.a.a
    public int L() {
        return ((Integer) a("bscnd", new a<Integer>(-1, 180000L) { // from class: com.mob.tools.a.i.54
            @Override // com.mob.tools.a.i.a
            /* renamed from: a */
            public Integer b() {
                return Integer.valueOf(i.this.f8951e.S());
            }
        })).intValue();
    }

    @Override // com.mob.tools.a.a
    public ArrayList<HashMap<String, Object>> M() {
        return (ArrayList) a("bsnbcl", new a<ArrayList<HashMap<String, Object>>>(null, 180000L) { // from class: com.mob.tools.a.i.55
            @Override // com.mob.tools.a.i.a
            /* renamed from: a */
            public ArrayList<HashMap<String, Object>> b() {
                return i.this.f8951e.T();
            }
        });
    }

    @Override // com.mob.tools.a.a
    public HashMap<String, Object> N() {
        return (HashMap) a("crtwfo", new a<HashMap<String, Object>>(null, 180000L) { // from class: com.mob.tools.a.i.57
            @Override // com.mob.tools.a.i.a
            /* renamed from: a */
            public HashMap<String, Object> b() {
                return i.this.f8951e.X();
            }
        });
    }

    @Override // com.mob.tools.a.a
    public ArrayList<HashMap<String, Object>> O() {
        return (ArrayList) a((String) null, new a<ArrayList<HashMap<String, Object>>>(null, 180000L) { // from class: com.mob.tools.a.i.58
            @Override // com.mob.tools.a.i.a
            /* renamed from: a */
            public ArrayList<HashMap<String, Object>> b() {
                return i.this.f8951e.Y();
            }
        });
    }

    @Override // com.mob.tools.a.a
    public boolean P() {
        return ((Boolean) a((String) null, new a<Boolean>(Boolean.FALSE, 180000L) { // from class: com.mob.tools.a.i.59
            @Override // com.mob.tools.a.i.a
            /* renamed from: a */
            public Boolean b() {
                return Boolean.valueOf(i.this.f8951e.Z());
            }
        })).booleanValue();
    }

    @Override // com.mob.tools.a.a
    public int Q() {
        return ((Integer) a("ovit", new a<Integer>(-1) { // from class: com.mob.tools.a.i.60
            @Override // com.mob.tools.a.i.a
            /* renamed from: a */
            public Integer b() {
                return Integer.valueOf(i.this.f8951e.l());
            }
        })).intValue();
    }

    @Override // com.mob.tools.a.a
    public String R() {
        return (String) a("ovne", new a<String>(null) { // from class: com.mob.tools.a.i.61
            @Override // com.mob.tools.a.i.a
            /* renamed from: a */
            public String b() {
                return i.this.f8951e.m();
            }
        });
    }

    @Override // com.mob.tools.a.a
    public String S() {
        return (String) a("ole", new a<String>(null) { // from class: com.mob.tools.a.i.62
            @Override // com.mob.tools.a.i.a
            /* renamed from: a */
            public String b() {
                return i.this.f8951e.n();
            }
        });
    }

    @Override // com.mob.tools.a.a
    public String T() {
        return (String) a("ocy", new a<String>(null) { // from class: com.mob.tools.a.i.63
            @Override // com.mob.tools.a.i.a
            /* renamed from: a */
            public String b() {
                return i.this.f8951e.p();
            }
        });
    }

    @Override // com.mob.tools.a.a
    public HashMap<String, Object> U() {
        return (HashMap) a("cio0", new a<HashMap<String, Object>>(null) { // from class: com.mob.tools.a.i.64
            @Override // com.mob.tools.a.i.a
            /* renamed from: a */
            public HashMap<String, Object> b() {
                return i.this.f8951e.aa();
            }
        });
    }

    @Override // com.mob.tools.a.a
    public ArrayList<ArrayList<String>> V() {
        return (ArrayList) a("tdio", new a<ArrayList<ArrayList<String>>>(null) { // from class: com.mob.tools.a.i.65
            @Override // com.mob.tools.a.i.a
            /* renamed from: a */
            public ArrayList<ArrayList<String>> b() {
                return i.this.f8951e.ab();
            }
        });
    }

    @Override // com.mob.tools.a.a
    public int W() {
        return ((Integer) a("snbrtn", new a<Integer>(-1) { // from class: com.mob.tools.a.i.68
            @Override // com.mob.tools.a.i.a
            /* renamed from: a */
            public Integer b() {
                return Integer.valueOf(i.this.f8951e.ac());
            }
        })).intValue();
    }

    @Override // com.mob.tools.a.a
    public int X() {
        return ((Integer) a("snbrtnmd", new a<Integer>(-1) { // from class: com.mob.tools.a.i.69
            @Override // com.mob.tools.a.i.a
            /* renamed from: a */
            public Integer b() {
                return Integer.valueOf(i.this.f8951e.ad());
            }
        })).intValue();
    }

    @Override // com.mob.tools.a.a
    public String Y() {
        return (String) a("qkl", new a<String>(null) { // from class: com.mob.tools.a.i.70
            @Override // com.mob.tools.a.i.a
            /* renamed from: a */
            public String b() {
                return i.this.f8951e.ae();
            }
        });
    }

    @Override // com.mob.tools.a.a
    public HashMap<String, HashMap<String, Long>> Z() {
        return (HashMap) a("siio", new a<HashMap<String, HashMap<String, Long>>>(null) { // from class: com.mob.tools.a.i.71
            @Override // com.mob.tools.a.i.a
            /* renamed from: a */
            public HashMap<String, HashMap<String, Long>> b() {
                return i.this.f8951e.af();
            }
        });
    }

    @Override // com.mob.tools.a.a
    public ApplicationInfo a(final String str, final int i10) {
        return (ApplicationInfo) a((String) null, new a<ApplicationInfo>(null) { // from class: com.mob.tools.a.i.25
            @Override // com.mob.tools.a.i.a
            /* renamed from: a */
            public ApplicationInfo b() {
                return k.a(i.this.f8950d).a().b(str, i10);
            }
        });
    }

    @Override // com.mob.tools.a.a
    public PackageInfo a(boolean z10, int i10, final String str, final int i11) {
        return (PackageInfo) a("gpi-" + i10 + "-" + str + "-" + i11, new a<PackageInfo>(null, i10) { // from class: com.mob.tools.a.i.6
            @Override // com.mob.tools.a.i.a
            /* renamed from: a */
            public PackageInfo b() {
                return k.a(i.this.f8950d).a().a(str, i11);
            }
        }, z10);
    }

    @Override // com.mob.tools.a.a
    public Location a(final int i10, final int i11, final boolean z10) {
        StringBuilder a10 = w1.h.a("loc-", i10, "-", i11, "-");
        a10.append(z10);
        return (Location) a(a10.toString(), new a<Location>(null, 180000L) { // from class: com.mob.tools.a.i.98
            @Override // com.mob.tools.a.i.a
            /* renamed from: a */
            public Location b() {
                return i.this.f8951e.a(i10, i11, z10);
            }
        });
    }

    @Override // com.mob.tools.a.a
    public String a(String str, String str2) {
        return this.f8951e.a(str, str2);
    }

    @Override // com.mob.tools.a.a
    public String a(boolean z10) {
        return (String) a("iei", new a<String>(null) { // from class: com.mob.tools.a.i.29
            @Override // com.mob.tools.a.i.a
            /* renamed from: a */
            public String b() {
                return i.this.f8951e.g();
            }
        }, z10);
    }

    @Override // com.mob.tools.a.a
    public List<ResolveInfo> a(final Intent intent, final int i10) {
        return (List) a((String) null, new a<List<ResolveInfo>>(null) { // from class: com.mob.tools.a.i.4
            @Override // com.mob.tools.a.i.a
            /* renamed from: a */
            public List<ResolveInfo> b() {
                return k.a(i.this.f8950d).a().a(intent, i10);
            }
        });
    }

    @Override // com.mob.tools.a.a
    public void a(BroadcastReceiver broadcastReceiver) {
        this.f8951e.a(broadcastReceiver);
    }

    @Override // com.mob.tools.a.a
    public void a(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        this.f8951e.a(broadcastReceiver, intentFilter);
    }

    @Override // com.mob.tools.a.a
    public void a(Handler.Callback callback) {
        if (callback != null) {
            callback.handleMessage((Message) a("batrst", new a<Message>(Message.obtain(), 180000L) { // from class: com.mob.tools.a.i.66
                @Override // com.mob.tools.a.i.a
                /* renamed from: a */
                public Message b() {
                    final LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
                    i.this.f8951e.a(new Handler.Callback() { // from class: com.mob.tools.a.i.66.1
                        @Override // android.os.Handler.Callback
                        public boolean handleMessage(Message message) {
                            try {
                                linkedBlockingQueue.offer(message);
                                return false;
                            } catch (Throwable th2) {
                                MobLog.getInstance().d(th2);
                                return false;
                            }
                        }
                    });
                    return (Message) linkedBlockingQueue.poll(3000L, TimeUnit.MILLISECONDS);
                }
            }));
        }
    }

    @Override // com.mob.tools.a.a
    public void a(View view) {
        this.f8951e.a(view);
    }

    @Override // com.mob.tools.a.a
    public void a(BlockingQueue<Boolean> blockingQueue) {
        this.f8951e.a(blockingQueue);
    }

    @Override // com.mob.tools.a.a
    public boolean a() {
        return ((Boolean) a("ird", new a<Boolean>(Boolean.FALSE) { // from class: com.mob.tools.a.i.1
            @Override // com.mob.tools.a.i.a
            /* renamed from: a */
            public Boolean b() {
                return Boolean.valueOf(i.this.f8951e.a());
            }
        })).booleanValue();
    }

    @Override // com.mob.tools.a.a
    public HashMap<String, Object> aA() {
        return (HashMap) a("dfim", new a<HashMap<String, Object>>(null) { // from class: com.mob.tools.a.i.106
            @Override // com.mob.tools.a.i.a
            /* renamed from: a */
            public HashMap<String, Object> b() {
                return i.this.f8951e.aD();
            }
        });
    }

    @Override // com.mob.tools.a.a
    public ArrayList<HashMap<String, Object>> aB() {
        return (ArrayList) a("iml", new a<ArrayList<HashMap<String, Object>>>(null) { // from class: com.mob.tools.a.i.107
            @Override // com.mob.tools.a.i.a
            /* renamed from: a */
            public ArrayList<HashMap<String, Object>> b() {
                return i.this.f8951e.aE();
            }
        });
    }

    @Override // com.mob.tools.a.a
    public String aC() {
        return (String) a("scph", new a<String>(null) { // from class: com.mob.tools.a.i.109
            @Override // com.mob.tools.a.i.a
            /* renamed from: a */
            public String b() {
                return i.this.f8951e.H();
            }
        });
    }

    @Override // com.mob.tools.a.a
    public String aD() {
        return (String) a("snm", new a<String>(null) { // from class: com.mob.tools.a.i.110
            @Override // com.mob.tools.a.i.a
            /* renamed from: a */
            public String b() {
                return i.this.f8951e.v();
            }
        });
    }

    @Override // com.mob.tools.a.a
    public String aE() {
        return (String) a("pne", new a<String>(null) { // from class: com.mob.tools.a.i.113
            @Override // com.mob.tools.a.i.a
            /* renamed from: a */
            public String b() {
                return i.this.f8951e.C();
            }
        });
    }

    @Override // com.mob.tools.a.a
    public String aF() {
        return (String) a("ane", new a<String>(null) { // from class: com.mob.tools.a.i.114
            @Override // com.mob.tools.a.i.a
            /* renamed from: a */
            public String b() {
                return i.this.f8951e.D();
            }
        });
    }

    @Override // com.mob.tools.a.a
    public int aG() {
        return ((Integer) a("avn", new a<Integer>(-1) { // from class: com.mob.tools.a.i.116
            @Override // com.mob.tools.a.i.a
            /* renamed from: a */
            public Integer b() {
                return Integer.valueOf(i.this.f8951e.E());
            }
        })).intValue();
    }

    @Override // com.mob.tools.a.a
    public String aH() {
        return (String) a("avne", new a<String>(null) { // from class: com.mob.tools.a.i.117
            @Override // com.mob.tools.a.i.a
            /* renamed from: a */
            public String b() {
                return i.this.f8951e.F();
            }
        });
    }

    @Override // com.mob.tools.a.a
    public boolean aI() {
        return ((Boolean) a("imp", new a<Boolean>(Boolean.FALSE) { // from class: com.mob.tools.a.i.118
            @Override // com.mob.tools.a.i.a
            /* renamed from: a */
            public Boolean b() {
                return Boolean.valueOf(i.this.f8951e.aJ());
            }
        })).booleanValue();
    }

    @Override // com.mob.tools.a.a
    public String aJ() {
        return (String) a("cpne", new a<String>(null) { // from class: com.mob.tools.a.i.119
            @Override // com.mob.tools.a.i.a
            /* renamed from: a */
            public String b() {
                return i.this.f8951e.aK();
            }
        });
    }

    @Override // com.mob.tools.a.a
    public boolean aK() {
        return s.a();
    }

    @Override // com.mob.tools.a.a
    public Object aL() {
        return a("catd", new a<Object>(null) { // from class: com.mob.tools.a.i.121
            @Override // com.mob.tools.a.i.a
            public Object b() {
                b unused = i.this.f8951e;
                return b.V();
            }
        });
    }

    @Override // com.mob.tools.a.a
    public Context aM() {
        return (Context) a((String) null, new a<Context>(null) { // from class: com.mob.tools.a.i.3
            @Override // com.mob.tools.a.i.a
            /* renamed from: a */
            public Context b() {
                if (i.this.f8950d != null) {
                    return i.this.f8950d;
                }
                Context W = b.W();
                if (W != null) {
                    i.this.f8950d = W;
                }
                return W;
            }
        });
    }

    @Override // com.mob.tools.a.a
    public String aN() {
        return this.f8951e.j();
    }

    @Override // com.mob.tools.a.a
    public String aO() {
        return this.f8951e.k();
    }

    @Override // com.mob.tools.a.a
    public long aP() {
        return ((Long) a("alut", new a<Long>(0L) { // from class: com.mob.tools.a.i.7
            @Override // com.mob.tools.a.i.a
            /* renamed from: a */
            public Long b() {
                return Long.valueOf(i.this.f8951e.aL());
            }
        })).longValue();
    }

    @Override // com.mob.tools.a.a
    public String aQ() {
        return (String) a("bard", new a<String>(null) { // from class: com.mob.tools.a.i.8
            @Override // com.mob.tools.a.i.a
            /* renamed from: a */
            public String b() {
                return i.this.f8951e.aM();
            }
        });
    }

    @Override // com.mob.tools.a.a
    public String aR() {
        return (String) a("dvcnm", new a<String>(null) { // from class: com.mob.tools.a.i.9
            @Override // com.mob.tools.a.i.a
            /* renamed from: a */
            public String b() {
                return i.this.f8951e.aN();
            }
        });
    }

    @Override // com.mob.tools.a.a
    public String aS() {
        return (String) a("dspid", new a<String>(null) { // from class: com.mob.tools.a.i.10
            @Override // com.mob.tools.a.i.a
            /* renamed from: a */
            public String b() {
                return i.this.f8951e.aO();
            }
        });
    }

    @Override // com.mob.tools.a.a
    public String aT() {
        return (String) a("fngprt", new a<String>(null) { // from class: com.mob.tools.a.i.11
            @Override // com.mob.tools.a.i.a
            /* renamed from: a */
            public String b() {
                return i.this.f8951e.aP();
            }
        });
    }

    @Override // com.mob.tools.a.a
    public String aU() {
        return (String) a("rdvsn", new a<String>(null) { // from class: com.mob.tools.a.i.12
            @Override // com.mob.tools.a.i.a
            /* renamed from: a */
            public String b() {
                return i.this.f8951e.aQ();
            }
        });
    }

    @Override // com.mob.tools.a.a
    public String aV() {
        return (String) a("cgrp", new a<String>(null) { // from class: com.mob.tools.a.i.14
            @Override // com.mob.tools.a.i.a
            /* renamed from: a */
            public String b() {
                return i.this.f8951e.aR();
            }
        });
    }

    @Override // com.mob.tools.a.a
    public String aW() {
        return (String) a("cinfo", new a<String>(null) { // from class: com.mob.tools.a.i.15
            @Override // com.mob.tools.a.i.a
            /* renamed from: a */
            public String b() {
                return i.this.f8951e.aS();
            }
        });
    }

    @Override // com.mob.tools.a.a
    public String aX() {
        return (String) a("odmt", new a<String>(null) { // from class: com.mob.tools.a.i.16
            @Override // com.mob.tools.a.i.a
            /* renamed from: a */
            public String b() {
                return i.this.f8951e.aT();
            }
        });
    }

    @Override // com.mob.tools.a.a
    public String aY() {
        return (String) a("odhmt", new a<String>(null) { // from class: com.mob.tools.a.i.17
            @Override // com.mob.tools.a.i.a
            /* renamed from: a */
            public String b() {
                return i.this.f8951e.aU();
            }
        });
    }

    @Override // com.mob.tools.a.a
    public String aZ() {
        return (String) a("admt", new a<String>(null) { // from class: com.mob.tools.a.i.18
            @Override // com.mob.tools.a.i.a
            /* renamed from: a */
            public String b() {
                return i.this.f8951e.aV();
            }
        });
    }

    @Override // com.mob.tools.a.a
    public HashMap<String, Long> aa() {
        return (HashMap) a("meio", new a<HashMap<String, Long>>(null) { // from class: com.mob.tools.a.i.72
            @Override // com.mob.tools.a.i.a
            /* renamed from: a */
            public HashMap<String, Long> b() {
                return i.this.f8951e.ag();
            }
        });
    }

    @Override // com.mob.tools.a.a
    public int ab() {
        return ((Integer) a("alct", new a<Integer>(-1) { // from class: com.mob.tools.a.i.73
            @Override // com.mob.tools.a.i.a
            /* renamed from: a */
            public Integer b() {
                return Integer.valueOf(i.this.f8951e.ai());
            }
        })).intValue();
    }

    @Override // com.mob.tools.a.a
    public String ac() {
        return (String) a("ale", new a<String>(null) { // from class: com.mob.tools.a.i.74
            @Override // com.mob.tools.a.i.a
            /* renamed from: a */
            public String b() {
                return i.this.f8951e.o();
            }
        });
    }

    @Override // com.mob.tools.a.a
    public String ad() {
        return (String) a("sse", new a<String>(null) { // from class: com.mob.tools.a.i.75
            @Override // com.mob.tools.a.i.a
            /* renamed from: a */
            public String b() {
                return i.this.f8951e.q();
            }
        });
    }

    @Override // com.mob.tools.a.a
    public String ae() {
        return e(false);
    }

    @Override // com.mob.tools.a.a
    public String af() {
        return (String) a((String) null, new a<String>(null) { // from class: com.mob.tools.a.i.77
            @Override // com.mob.tools.a.i.a
            /* renamed from: a */
            public String b() {
                return i.this.f8951e.y();
            }
        });
    }

    @Override // com.mob.tools.a.a
    public String ag() {
        return (String) a((String) null, new a<String>(null) { // from class: com.mob.tools.a.i.79
            @Override // com.mob.tools.a.i.a
            /* renamed from: a */
            public String b() {
                return i.this.f8951e.z();
            }
        });
    }

    @Override // com.mob.tools.a.a
    public boolean ah() {
        return ((Boolean) a((String) null, new a<Boolean>(Boolean.FALSE) { // from class: com.mob.tools.a.i.80
            @Override // com.mob.tools.a.i.a
            /* renamed from: a */
            public Boolean b() {
                return Boolean.valueOf(i.this.f8951e.x());
            }
        })).booleanValue();
    }

    @Override // com.mob.tools.a.a
    public int ai() {
        return ((Integer) a("dtnttp", new a<Integer>(-1, 180000L) { // from class: com.mob.tools.a.i.81
            @Override // com.mob.tools.a.i.a
            /* renamed from: a */
            public Integer b() {
                return Integer.valueOf(i.this.f8951e.aB());
            }
        })).intValue();
    }

    @Override // com.mob.tools.a.a
    public ArrayList<HashMap<String, String>> aj() {
        return (ArrayList) a("carn", new a<ArrayList<HashMap<String, String>>>(null) { // from class: com.mob.tools.a.i.82
            @Override // com.mob.tools.a.i.a
            /* renamed from: a */
            public ArrayList<HashMap<String, String>> b() {
                return i.this.f8951e.ar();
            }
        });
    }

    @Override // com.mob.tools.a.a
    public String ak() {
        return (String) a("tize", new a<String>(null) { // from class: com.mob.tools.a.i.83
            @Override // com.mob.tools.a.i.a
            /* renamed from: a */
            public String b() {
                return i.this.f8951e.as();
            }
        });
    }

    @Override // com.mob.tools.a.a
    public HashMap<String, Object> al() {
        return (HashMap) a("surt", new a<HashMap<String, Object>>(null) { // from class: com.mob.tools.a.i.84
            @Override // com.mob.tools.a.i.a
            /* renamed from: a */
            public HashMap<String, Object> b() {
                return i.this.f8951e.at();
            }
        });
    }

    @Override // com.mob.tools.a.a
    public HashMap<String, String> am() {
        return (HashMap) a("cpfq", new a<HashMap<String, String>>(null, 180000L) { // from class: com.mob.tools.a.i.85
            @Override // com.mob.tools.a.i.a
            /* renamed from: a */
            public HashMap<String, String> b() {
                return i.this.f8951e.au();
            }
        });
    }

    @Override // com.mob.tools.a.a
    public String an() {
        return (String) a("cpte", new a<String>(null) { // from class: com.mob.tools.a.i.86
            @Override // com.mob.tools.a.i.a
            /* renamed from: a */
            public String b() {
                return i.this.f8951e.av();
            }
        });
    }

    @Override // com.mob.tools.a.a
    public String ao() {
        return (String) a("flvr", new a<String>(null) { // from class: com.mob.tools.a.i.87
            @Override // com.mob.tools.a.i.a
            /* renamed from: a */
            public String b() {
                return i.this.f8951e.aw();
            }
        });
    }

    @Override // com.mob.tools.a.a
    public HashMap<String, Object> ap() {
        return (HashMap) a("trfc", new a<HashMap<String, Object>>(null, 180000L) { // from class: com.mob.tools.a.i.88
            @Override // com.mob.tools.a.i.a
            /* renamed from: a */
            public HashMap<String, Object> b() {
                return i.this.f8951e.ax();
            }
        });
    }

    @Override // com.mob.tools.a.a
    public String aq() {
        return (String) a("babd", new a<String>(null) { // from class: com.mob.tools.a.i.90
            @Override // com.mob.tools.a.i.a
            /* renamed from: a */
            public String b() {
                return i.this.f8951e.ay();
            }
        });
    }

    @Override // com.mob.tools.a.a
    public String ar() {
        return (String) a("bfsp", new a<String>(null) { // from class: com.mob.tools.a.i.91
            @Override // com.mob.tools.a.i.a
            /* renamed from: a */
            public String b() {
                return i.this.f8951e.az();
            }
        });
    }

    @Override // com.mob.tools.a.a
    public String as() {
        return (String) a("bopm", new a<String>(null) { // from class: com.mob.tools.a.i.92
            @Override // com.mob.tools.a.i.a
            /* renamed from: a */
            public String b() {
                return i.this.f8951e.aA();
            }
        });
    }

    @Override // com.mob.tools.a.a
    public HashMap<String, Object> at() {
        return (HashMap) a("dmue", new a<HashMap<String, Object>>(null) { // from class: com.mob.tools.a.i.93
            @Override // com.mob.tools.a.i.a
            /* renamed from: a */
            public HashMap<String, Object> b() {
                return i.this.f8951e.aH();
            }
        });
    }

    @Override // com.mob.tools.a.a
    public String au() {
        return (String) a("iades", new a<String>(null, 180000L) { // from class: com.mob.tools.a.i.94
            @Override // com.mob.tools.a.i.a
            /* renamed from: a */
            public String b() {
                try {
                    Enumeration<NetworkInterface> a10 = k.a(i.this.f8950d).a().a();
                    while (a10.hasMoreElements()) {
                        Enumeration<InetAddress> a11 = k.a(i.this.f8950d).a().a(a10.nextElement());
                        while (a11.hasMoreElements()) {
                            InetAddress nextElement = a11.nextElement();
                            if (!nextElement.isLoopbackAddress() && (nextElement instanceof Inet4Address)) {
                                return nextElement.getHostAddress();
                            }
                        }
                    }
                    return null;
                } catch (Throwable th2) {
                    MobLog.getInstance().w(th2);
                    return null;
                }
            }
        });
    }

    @Override // com.mob.tools.a.a
    public ArrayList<HashMap<String, String>> av() {
        return (ArrayList) a((String) null, new a<ArrayList<HashMap<String, String>>>(null) { // from class: com.mob.tools.a.i.96
            @Override // com.mob.tools.a.i.a
            /* renamed from: a */
            public ArrayList<HashMap<String, String>> b() {
                return i.this.f8951e.a(false, false, true);
            }
        });
    }

    @Override // com.mob.tools.a.a
    public ArrayList<HashMap<String, String>> aw() {
        return (ArrayList) a("sal", new a<ArrayList<HashMap<String, String>>>(null) { // from class: com.mob.tools.a.i.97
            @Override // com.mob.tools.a.i.a
            /* renamed from: a */
            public ArrayList<HashMap<String, String>> b() {
                return i.this.f8951e.a(true, true, true);
            }
        });
    }

    @Override // com.mob.tools.a.a
    public String ax() {
        return (String) a("ded0", new a<String>(null) { // from class: com.mob.tools.a.i.101
            @Override // com.mob.tools.a.i.a
            /* renamed from: a */
            public String b() {
                return i.this.f8951e.f();
            }
        });
    }

    @Override // com.mob.tools.a.a
    public String ay() {
        return (String) a("deky", new a<String>(null) { // from class: com.mob.tools.a.i.102
            @Override // com.mob.tools.a.i.a
            /* renamed from: a */
            public String b() {
                return i.this.f8951e.A();
            }
        });
    }

    @Override // com.mob.tools.a.a
    public String az() {
        return (String) a("dfimp", new a<String>(null) { // from class: com.mob.tools.a.i.105
            @Override // com.mob.tools.a.i.a
            /* renamed from: a */
            public String b() {
                return i.this.f8951e.aC();
            }
        });
    }

    @Override // com.mob.tools.a.a
    public ResolveInfo b(final Intent intent, final int i10) {
        return (ResolveInfo) a((String) null, new a<ResolveInfo>(null) { // from class: com.mob.tools.a.i.5
            @Override // com.mob.tools.a.i.a
            /* renamed from: a */
            public ResolveInfo b() {
                return k.a(i.this.f8950d).a().b(intent, i10);
            }
        });
    }

    @Override // com.mob.tools.a.a
    public String b(final String str) {
        return (String) a(a.b.b("syprt-", str), new a<String>(null) { // from class: com.mob.tools.a.i.99
            @Override // com.mob.tools.a.i.a
            /* renamed from: a */
            public String b() {
                return i.this.f8951e.b(str);
            }
        });
    }

    @Override // com.mob.tools.a.a
    public String b(boolean z10) {
        return (String) a("isi", new a<String>(null) { // from class: com.mob.tools.a.i.30
            @Override // com.mob.tools.a.i.a
            /* renamed from: a */
            public String b() {
                return i.this.f8951e.J();
            }
        }, z10);
    }

    @Override // com.mob.tools.a.a
    public void b(View view) {
        this.f8951e.b(view);
    }

    @Override // com.mob.tools.a.a
    public boolean b() {
        return ((Boolean) a("cx0", new a<Boolean>(Boolean.FALSE) { // from class: com.mob.tools.a.i.34
            @Override // com.mob.tools.a.i.a
            /* renamed from: a */
            public Boolean b() {
                return Boolean.valueOf(i.this.f8951e.aj());
            }
        })).booleanValue();
    }

    @Override // com.mob.tools.a.a
    public String ba() {
        return (String) a("vdmt", new a<String>(null) { // from class: com.mob.tools.a.i.19
            @Override // com.mob.tools.a.i.a
            /* renamed from: a */
            public String b() {
                return i.this.f8951e.aW();
            }
        });
    }

    @Override // com.mob.tools.a.a
    public String bb() {
        return (String) a("udmt", new a<String>(null) { // from class: com.mob.tools.a.i.20
            @Override // com.mob.tools.a.i.a
            /* renamed from: a */
            public String b() {
                return i.this.f8951e.aX();
            }
        });
    }

    @Override // com.mob.tools.a.a
    public HashMap<String, Object> bc() {
        return (HashMap) a("alldmt", new a<HashMap<String, Object>>(null) { // from class: com.mob.tools.a.i.21
            @Override // com.mob.tools.a.i.a
            /* renamed from: a */
            public HashMap<String, Object> b() {
                return i.this.f8951e.aY();
            }
        });
    }

    @Override // com.mob.tools.a.a
    public ApplicationInfo bd() {
        return (ApplicationInfo) a("gtaif", new a<ApplicationInfo>(null) { // from class: com.mob.tools.a.i.22
            @Override // com.mob.tools.a.i.a
            /* renamed from: a */
            public ApplicationInfo b() {
                return k.a(i.this.f8950d).a().d();
            }
        });
    }

    @Override // com.mob.tools.a.a
    public ArrayList<HashMap<String, Object>> be() {
        return (ArrayList) a("gtwflok", new a<ArrayList<HashMap<String, Object>>>(null, 180000L) { // from class: com.mob.tools.a.i.23
            @Override // com.mob.tools.a.i.a
            /* renamed from: a */
            public ArrayList<HashMap<String, Object>> b() {
                Boolean bool;
                if (i.this.h("android.permission.CHANGE_WIFI_STATE") && i.this.h("android.permission.ACCESS_WIFI_STATE")) {
                    LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
                    i.this.a(linkedBlockingQueue);
                    i.this.P();
                    try {
                        bool = (Boolean) linkedBlockingQueue.poll(20000L, TimeUnit.MILLISECONDS);
                    } catch (Throwable th2) {
                        MobLog.getInstance().d(th2);
                        bool = null;
                    }
                    if (bool == null || !bool.booleanValue()) {
                        return null;
                    }
                    return i.this.O();
                }
                return null;
            }
        });
    }

    @Override // com.mob.tools.a.a
    public boolean bf() {
        return ((Boolean) a("gpsavlbmt", new a<Boolean>(null) { // from class: com.mob.tools.a.i.26
            @Override // com.mob.tools.a.i.a
            /* renamed from: a */
            public Boolean b() {
                return Boolean.valueOf(i.this.f8951e.B());
            }
        })).booleanValue();
    }

    @Override // com.mob.tools.a.a
    public String c(final String str) {
        return (String) a((String) null, new a<String>(null) { // from class: com.mob.tools.a.i.104
            @Override // com.mob.tools.a.i.a
            /* renamed from: a */
            public String b() {
                return i.this.f8951e.g(str);
            }
        });
    }

    @Override // com.mob.tools.a.a
    public String c(boolean z10) {
        return (String) a("car", new a<String>(null) { // from class: com.mob.tools.a.i.35
            @Override // com.mob.tools.a.i.a
            /* renamed from: a */
            public String b() {
                return i.this.f8951e.r();
            }
        }, z10);
    }

    @Override // com.mob.tools.a.a
    public boolean c() {
        return ((Boolean) a("pd0", new a<Boolean>(Boolean.FALSE) { // from class: com.mob.tools.a.i.45
            @Override // com.mob.tools.a.i.a
            /* renamed from: a */
            public Boolean b() {
                return Boolean.valueOf(i.this.f8951e.ak());
            }
        })).booleanValue();
    }

    @Override // com.mob.tools.a.a
    public String d(boolean z10) {
        return (String) a("cne", new a<String>(null) { // from class: com.mob.tools.a.i.36
            @Override // com.mob.tools.a.i.a
            /* renamed from: a */
            public String b() {
                return i.this.f8951e.s();
            }
        }, z10);
    }

    @Override // com.mob.tools.a.a
    public List<String> d(String str) {
        return null;
    }

    @Override // com.mob.tools.a.a
    public boolean d() {
        return ((Boolean) a("dee", new a<Boolean>(Boolean.FALSE) { // from class: com.mob.tools.a.i.56
            @Override // com.mob.tools.a.i.a
            /* renamed from: a */
            public Boolean b() {
                return Boolean.valueOf(i.this.f8951e.ap());
            }
        })).booleanValue();
    }

    @Override // com.mob.tools.a.a
    public String e(boolean z10) {
        return (String) a("nte", new a<String>(null, 180000L) { // from class: com.mob.tools.a.i.76
            @Override // com.mob.tools.a.i.a
            /* renamed from: a */
            public String b() {
                return i.this.f8951e.w();
            }
        }, z10);
    }

    @Override // com.mob.tools.a.a
    public boolean e() {
        return ((Boolean) a("vn0", new a<Boolean>(Boolean.FALSE) { // from class: com.mob.tools.a.i.67
            @Override // com.mob.tools.a.i.a
            /* renamed from: a */
            public Boolean b() {
                return Boolean.valueOf(i.this.f8951e.ao());
            }
        })).booleanValue();
    }

    @Override // com.mob.tools.a.a
    public boolean e(final String str) {
        return ((Boolean) a((String) null, new a<Boolean>(Boolean.FALSE) { // from class: com.mob.tools.a.i.108
            @Override // com.mob.tools.a.i.a
            /* renamed from: a */
            public Boolean b() {
                return Boolean.valueOf(i.this.f8951e.h(str));
            }
        })).booleanValue();
    }

    @Override // com.mob.tools.a.a
    public String f(final String str) {
        return (String) a(a.b.b("snm_", str), new a<String>(null) { // from class: com.mob.tools.a.i.112
            @Override // com.mob.tools.a.i.a
            /* renamed from: a */
            public String b() {
                return i.this.f8951e.c(str);
            }
        });
    }

    @Override // com.mob.tools.a.a
    public ArrayList<HashMap<String, String>> f(final boolean z10) {
        return (ArrayList) a((String) null, new a<ArrayList<HashMap<String, String>>>(null) { // from class: com.mob.tools.a.i.95
            @Override // com.mob.tools.a.i.a
            /* renamed from: a */
            public ArrayList<HashMap<String, String>> b() {
                return i.this.f8951e.a(false, z10, true);
            }
        });
    }

    @Override // com.mob.tools.a.a
    public boolean f() {
        return ((Boolean) a("ua0", new a<Boolean>(Boolean.FALSE, 180000L) { // from class: com.mob.tools.a.i.78
            @Override // com.mob.tools.a.i.a
            /* renamed from: a */
            public Boolean b() {
                return Boolean.valueOf(i.this.f8951e.an());
            }
        })).booleanValue();
    }

    @Override // com.mob.tools.a.a
    public String g(final String str) {
        return (String) a((String) null, new a<String>(null) { // from class: com.mob.tools.a.i.115
            @Override // com.mob.tools.a.i.a
            /* renamed from: a */
            public String b() {
                return i.this.f8951e.e(str);
            }
        });
    }

    @Override // com.mob.tools.a.a
    public String g(final boolean z10) {
        return (String) a((String) null, new a<String>(null) { // from class: com.mob.tools.a.i.103
            @Override // com.mob.tools.a.i.a
            /* renamed from: a */
            public String b() {
                return i.this.f8951e.a(z10);
            }
        });
    }

    @Override // com.mob.tools.a.a
    public boolean g() {
        return ((Boolean) a("dee1", new a<Boolean>(Boolean.FALSE, 180000L) { // from class: com.mob.tools.a.i.89
            @Override // com.mob.tools.a.i.a
            /* renamed from: a */
            public Boolean b() {
                return Boolean.valueOf(i.this.f8951e.am());
            }
        })).booleanValue();
    }

    @Override // com.mob.tools.a.a
    public boolean h() {
        return ((Boolean) a("uee", new a<Boolean>(Boolean.FALSE, 180000L) { // from class: com.mob.tools.a.i.100
            @Override // com.mob.tools.a.i.a
            /* renamed from: a */
            public Boolean b() {
                return Boolean.valueOf(i.this.f8951e.al());
            }
        })).booleanValue();
    }

    @Override // com.mob.tools.a.a
    public boolean h(final String str) {
        return ((Boolean) a((String) null, new a<Boolean>(Boolean.FALSE) { // from class: com.mob.tools.a.i.120
            @Override // com.mob.tools.a.i.a
            /* renamed from: a */
            public Boolean b() {
                return Boolean.valueOf(i.this.f8951e.f(str));
            }
        })).booleanValue();
    }

    @Override // com.mob.tools.a.a
    public boolean i() {
        return ((Boolean) a("wpy", new a<Boolean>(Boolean.FALSE, 180000L) { // from class: com.mob.tools.a.i.111
            @Override // com.mob.tools.a.i.a
            /* renamed from: a */
            public Boolean b() {
                return Boolean.valueOf(i.this.f8951e.aq());
            }
        })).booleanValue();
    }

    @Override // com.mob.tools.a.a
    public boolean j() {
        return ((Boolean) a("smlt", new a<Boolean>(Boolean.FALSE) { // from class: com.mob.tools.a.i.2
            @Override // com.mob.tools.a.i.a
            /* renamed from: a */
            public Boolean b() {
                return Boolean.valueOf(i.this.f8951e.aG());
            }
        })).booleanValue();
    }

    @Override // com.mob.tools.a.a
    public boolean k() {
        return ((Boolean) a("sde", new a<Boolean>(Boolean.FALSE) { // from class: com.mob.tools.a.i.24
            @Override // com.mob.tools.a.i.a
            /* renamed from: a */
            public Boolean b() {
                return Boolean.valueOf(i.this.f8951e.aI());
            }
        })).booleanValue();
    }

    @Override // com.mob.tools.a.a
    public String l() {
        return (String) a("sln", new a<String>(null) { // from class: com.mob.tools.a.i.27
            @Override // com.mob.tools.a.i.a
            /* renamed from: a */
            public String b() {
                return i.this.f8951e.i();
            }
        });
    }

    @Override // com.mob.tools.a.a
    public String m() {
        return (String) a("agi", new a<String>(null) { // from class: com.mob.tools.a.i.28
            @Override // com.mob.tools.a.i.a
            /* renamed from: a */
            public String b() {
                return i.this.f8951e.I();
            }
        });
    }

    @Override // com.mob.tools.a.a
    public String n() {
        return a(false);
    }

    @Override // com.mob.tools.a.a
    public String o() {
        ConcurrentHashMap<String, Object> concurrentHashMap = this.f8947a;
        if (concurrentHashMap == null || !concurrentHashMap.containsKey("iei")) {
            return null;
        }
        return (String) this.f8947a.get("iei");
    }

    @Override // com.mob.tools.a.a
    public String p() {
        return b(false);
    }

    @Override // com.mob.tools.a.a
    public String[] q() {
        return (String[]) a("isia", new a<String[]>(null) { // from class: com.mob.tools.a.i.31
            @Override // com.mob.tools.a.i.a
            /* renamed from: a */
            public String[] b() {
                return i.this.f8951e.K();
            }
        });
    }

    @Override // com.mob.tools.a.a
    public String r() {
        return (String) a("ssd", new a<String>(null, 180000L) { // from class: com.mob.tools.a.i.32
            @Override // com.mob.tools.a.i.a
            /* renamed from: a */
            public String b() {
                return i.this.f8951e.b();
            }
        });
    }

    @Override // com.mob.tools.a.a
    public String s() {
        return (String) a("bsd", new a<String>(null, 180000L) { // from class: com.mob.tools.a.i.33
            @Override // com.mob.tools.a.i.a
            /* renamed from: a */
            public String b() {
                return i.this.f8951e.c();
            }
        });
    }

    @Override // com.mob.tools.a.a
    public String t() {
        return c(false);
    }

    @Override // com.mob.tools.a.a
    public String u() {
        return d(false);
    }

    @Override // com.mob.tools.a.a
    public String v() {
        return (String) a("ssnr", new a<String>(null) { // from class: com.mob.tools.a.i.37
            @Override // com.mob.tools.a.i.a
            /* renamed from: a */
            public String b() {
                return i.this.f8951e.t();
            }
        });
    }

    @Override // com.mob.tools.a.a
    public String w() {
        return (String) a("mvn", new a<String>(null) { // from class: com.mob.tools.a.i.38
            @Override // com.mob.tools.a.i.a
            /* renamed from: a */
            public String b() {
                return i.this.f8951e.ah();
            }
        });
    }

    @Override // com.mob.tools.a.a
    public String x() {
        return (String) a("oad", new a<String>(null) { // from class: com.mob.tools.a.i.39
            @Override // com.mob.tools.a.i.a
            /* renamed from: a */
            public String b() {
                return com.mob.commons.b.b.c(i.this.f8950d);
            }
        });
    }

    @Override // com.mob.tools.a.a
    public String y() {
        return (String) a("mol", new a<String>(null) { // from class: com.mob.tools.a.i.40
            @Override // com.mob.tools.a.i.a
            /* renamed from: a */
            public String b() {
                return i.this.f8951e.d();
            }
        });
    }

    @Override // com.mob.tools.a.a
    public String z() {
        return (String) a("mar", new a<String>(null) { // from class: com.mob.tools.a.i.41
            @Override // com.mob.tools.a.i.a
            /* renamed from: a */
            public String b() {
                return i.this.f8951e.e();
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private <T> T a(java.lang.String r10, com.mob.tools.a.i.a<T> r11, boolean r12) {
        /*
            r9 = this;
            r0 = 0
            if (r10 != 0) goto L9
            java.lang.Object r10 = r11.b()     // Catch: java.lang.Throwable -> L82
            goto Lb8
        L9:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Integer> r1 = r9.f8948b     // Catch: java.lang.Throwable -> L82
            java.lang.Object r1 = r1.get(r10)     // Catch: java.lang.Throwable -> L82
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Throwable -> L82
            if (r1 == 0) goto L28
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Object> r2 = r9.f8947a     // Catch: java.lang.Throwable -> L82
            java.lang.Object r0 = r2.get(r10)     // Catch: java.lang.Throwable -> L82
            if (r0 != 0) goto L28
            int r2 = r1.intValue()     // Catch: java.lang.Throwable -> L82
            int r3 = r11.f9096f     // Catch: java.lang.Throwable -> L82
            if (r2 < r3) goto L28
            if (r12 != 0) goto L28
            T r10 = r11.f9095e     // Catch: java.lang.Throwable -> L82
            return r10
        L28:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Long> r2 = r9.f8949c     // Catch: java.lang.Throwable -> L82
            java.lang.Object r2 = r2.get(r10)     // Catch: java.lang.Throwable -> L82
            java.lang.Long r2 = (java.lang.Long) r2     // Catch: java.lang.Throwable -> L82
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L41
            long r5 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L82
            long r7 = r2.longValue()     // Catch: java.lang.Throwable -> L82
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 < 0) goto L41
            r3 = 1
        L41:
            if (r0 == 0) goto L47
            if (r3 != 0) goto L47
            if (r12 == 0) goto Lb7
        L47:
            java.lang.Object r0 = r11.b()     // Catch: java.lang.Throwable -> L82
            if (r0 == 0) goto L6a
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Object> r12 = r9.f8947a     // Catch: java.lang.Throwable -> L82
            r12.put(r10, r0)     // Catch: java.lang.Throwable -> L82
            long r2 = r11.f9097g     // Catch: java.lang.Throwable -> L82
            r5 = 0
            int r12 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r12 <= 0) goto L6a
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Long> r12 = r9.f8949c     // Catch: java.lang.Throwable -> L82
            long r2 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L82
            long r5 = r11.f9097g     // Catch: java.lang.Throwable -> L82
            long r2 = r2 + r5
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch: java.lang.Throwable -> L82
            r12.put(r10, r2)     // Catch: java.lang.Throwable -> L82
        L6a:
            if (r1 != 0) goto L73
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Integer> r12 = r9.f8948b     // Catch: java.lang.Throwable -> L82
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L82
            goto L7e
        L73:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Integer> r12 = r9.f8948b     // Catch: java.lang.Throwable -> L82
            int r1 = r1.intValue()     // Catch: java.lang.Throwable -> L82
            int r1 = r1 + r4
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L82
        L7e:
            r12.put(r10, r1)     // Catch: java.lang.Throwable -> L82
            goto Lb7
        L82:
            r10 = move-exception
            boolean r12 = r10 instanceof android.content.pm.PackageManager.NameNotFoundException
            if (r12 == 0) goto Lb0
            com.mob.tools.log.NLog r12 = com.mob.tools.MobLog.getInstance()
            java.lang.String r1 = "Exception: "
            java.lang.StringBuilder r1 = android.support.v4.media.d.a(r1)
            java.lang.Class r2 = r10.getClass()
            java.lang.String r2 = r2.getName()
            r1.append(r2)
            java.lang.String r2 = ": "
            r1.append(r2)
            java.lang.String r10 = r10.getMessage()
            r1.append(r10)
            java.lang.String r10 = r1.toString()
            r12.w(r10)
            goto Lb7
        Lb0:
            com.mob.tools.log.NLog r12 = com.mob.tools.MobLog.getInstance()
            r12.w(r10)
        Lb7:
            r10 = r0
        Lb8:
            if (r10 != 0) goto Lbc
            T r10 = r11.f9095e
        Lbc:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mob.tools.a.i.a(java.lang.String, com.mob.tools.a.i$a, boolean):java.lang.Object");
    }

    @Override // com.mob.tools.a.a
    public boolean a(final String str) {
        return ((Boolean) a(a.b.b("fps-", str), new a<Boolean>(Boolean.FALSE) { // from class: com.mob.tools.a.i.13
            @Override // com.mob.tools.a.i.a
            /* renamed from: a */
            public Boolean b() {
                return Boolean.valueOf(i.this.f8951e.j(str));
            }
        })).booleanValue();
    }
}
