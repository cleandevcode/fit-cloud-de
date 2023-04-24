package com.mob.tools.utils;

import a0.q0;
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.ResolveInfo;
import android.location.Location;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.mob.MobSDK;
import com.mob.commons.j;
import com.mob.commons.u;
import com.mob.tools.MobLog;
import com.mob.tools.log.NLog;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import no.nordicsemi.android.dfu.DfuServiceInitiator;

/* loaded from: classes.dex */
public class DH {

    /* loaded from: classes.dex */
    public interface DHResponder {
        void onResponse(DHResponse dHResponse);
    }

    /* loaded from: classes.dex */
    public static class DHResponse {
        private boolean A;
        private String B;
        private String C;
        private int D;
        private String E;
        private LinkedList<String> F;
        private String G;
        private String H;
        private LinkedList<String> I;
        private int J;
        private String K;
        private LinkedList<ArrayList<HashMap<String, String>>> L;
        private ArrayList<HashMap<String, String>> M;
        private LinkedList<Boolean> N;
        private boolean O;
        private String P;
        private String Q;
        private String R;
        private String[] S;
        private LinkedList<Location> T;
        private int U;
        private int V;
        private int W;
        private int X;
        private int Y;
        private int Z;

        /* renamed from: a */
        private boolean f9187a;
        private boolean aA;
        private boolean aB;
        private boolean aC;
        private ArrayList<HashMap<String, String>> aD;
        private String aE;
        private HashMap<String, Object> aF;
        private HashMap<String, String> aG;
        private String aH;
        private String aI;
        private HashMap<String, Object> aJ;
        private String aK;
        private String aL;
        private String aM;
        private int aN;
        private String aO;
        private HashMap<String, Object> aP;
        private ArrayList<HashMap<String, Object>> aQ;
        private String aR;
        private boolean aS;
        private HashMap<String, Object> aT;
        private LinkedList<Boolean> aU;
        private boolean aV;
        private boolean aW;
        private String aX;
        private Void aY;
        private Void aZ;

        /* renamed from: aa */
        private int f9188aa;

        /* renamed from: ab */
        private int f9189ab;

        /* renamed from: ac */
        private ArrayList<HashMap<String, Object>> f9190ac;

        /* renamed from: ad */
        private String f9191ad;

        /* renamed from: ae */
        private LinkedList<String> f9192ae;

        /* renamed from: af */
        private LinkedList<List<String>> f9193af;

        /* renamed from: ag */
        private Activity f9194ag;

        /* renamed from: ah */
        private HashMap<String, Object> f9195ah;

        /* renamed from: ai */
        private ArrayList<HashMap<String, Object>> f9196ai;

        /* renamed from: aj */
        private boolean f9197aj;

        /* renamed from: ak */
        private LinkedList<Boolean> f9198ak;

        /* renamed from: al */
        private HashMap<String, Object> f9199al;

        /* renamed from: am */
        private ArrayList<ArrayList<String>> f9200am;

        /* renamed from: an */
        private HashMap<String, Object> f9201an;

        /* renamed from: ao */
        private int f9202ao;
        private int ap;
        private String aq;
        private HashMap<String, HashMap<String, Long>> ar;
        private HashMap<String, Long> as;
        private String at;
        private int au;
        private boolean av;
        private boolean aw;
        private boolean ax;
        private boolean ay;
        private boolean az;

        /* renamed from: b */
        private String f9203b;
        private String bA;
        private String bB;
        private HashMap<String, Object> bC;
        private ApplicationInfo bD;
        private ArrayList<HashMap<String, Object>> bE;
        private LinkedList<ApplicationInfo> bF;

        /* renamed from: ba */
        private Void f9204ba;

        /* renamed from: bb */
        private LinkedList<Object> f9205bb;

        /* renamed from: bc */
        private Context f9206bc;

        /* renamed from: bd */
        private LinkedList<List<ResolveInfo>> f9207bd;

        /* renamed from: be */
        private LinkedList<ResolveInfo> f9208be;

        /* renamed from: bf */
        private LinkedList<PackageInfo> f9209bf;

        /* renamed from: bg */
        private LinkedList<PackageInfo> f9210bg;

        /* renamed from: bh */
        private LinkedList<PackageInfo> f9211bh;

        /* renamed from: bi */
        private String f9212bi;

        /* renamed from: bj */
        private Void f9213bj;

        /* renamed from: bk */
        private Void f9214bk;

        /* renamed from: bl */
        private String f9215bl;

        /* renamed from: bm */
        private String f9216bm;

        /* renamed from: bn */
        private LinkedList<String> f9217bn;

        /* renamed from: bo */
        private Object f9218bo;
        private long bp;
        private String bq;
        private String br;
        private String bs;
        private String bt;
        private String bu;
        private String bv;
        private String bw;
        private String bx;
        private String by;
        private String bz;

        /* renamed from: c */
        private String f9219c;

        /* renamed from: d */
        private String f9220d;

        /* renamed from: e */
        private String f9221e;
        public Error errors = new Error();

        /* renamed from: f */
        private String f9222f;

        /* renamed from: g */
        private String f9223g;

        /* renamed from: h */
        private String[] f9224h;

        /* renamed from: i */
        private LinkedList<String> f9225i;

        /* renamed from: j */
        private String f9226j;

        /* renamed from: k */
        private int f9227k;

        /* renamed from: l */
        private String f9228l;

        /* renamed from: m */
        private String f9229m;

        /* renamed from: n */
        private String f9230n;

        /* renamed from: o */
        private String f9231o;

        /* renamed from: p */
        private String f9232p;

        /* renamed from: q */
        private String f9233q;

        /* renamed from: r */
        private LinkedList<String> f9234r;

        /* renamed from: s */
        private String f9235s;

        /* renamed from: t */
        private LinkedList<String> f9236t;

        /* renamed from: u */
        private String f9237u;

        /* renamed from: v */
        private String f9238v;

        /* renamed from: w */
        private String f9239w;

        /* renamed from: x */
        private LinkedList<String> f9240x;

        /* renamed from: y */
        private String f9241y;

        /* renamed from: z */
        private LinkedList<String> f9242z;

        /* loaded from: classes.dex */
        public class Error {
            private Throwable A;
            private LinkedList<Throwable> B;
            private Throwable C;
            private LinkedList<Throwable> D;
            private Throwable E;
            private Throwable F;
            private Throwable G;
            private Throwable H;
            private Throwable I;
            private LinkedList<Throwable> J;
            private Throwable K;
            private Throwable L;
            private LinkedList<Throwable> M;
            private Throwable N;
            private Throwable O;
            private LinkedList<Throwable> P;
            private Throwable Q;
            private LinkedList<Throwable> R;
            private Throwable S;
            private Throwable T;
            private Throwable U;
            private Throwable V;
            private Throwable W;
            private LinkedList<Throwable> X;
            private Throwable Y;
            private Throwable Z;
            private Throwable aA;
            private Throwable aB;
            private Throwable aC;
            private Throwable aD;
            private Throwable aE;
            private Throwable aF;
            private Throwable aG;
            private Throwable aH;
            private Throwable aI;
            private Throwable aJ;
            private Throwable aK;
            private Throwable aL;
            private Throwable aM;
            private Throwable aN;
            private Throwable aO;
            private Throwable aP;
            private Throwable aQ;
            private Throwable aR;
            private Throwable aS;
            private Throwable aT;
            private Throwable aU;
            private Throwable aV;
            private Throwable aW;
            private Throwable aX;
            private LinkedList<Throwable> aY;
            private Throwable aZ;

            /* renamed from: aa */
            private Throwable f9244aa;

            /* renamed from: ab */
            private Throwable f9245ab;

            /* renamed from: ac */
            private Throwable f9246ac;

            /* renamed from: ad */
            private Throwable f9247ad;

            /* renamed from: ae */
            private Throwable f9248ae;

            /* renamed from: af */
            private Throwable f9249af;

            /* renamed from: ag */
            private Throwable f9250ag;

            /* renamed from: ah */
            private Throwable f9251ah;

            /* renamed from: ai */
            private LinkedList<Throwable> f9252ai;

            /* renamed from: aj */
            private Throwable f9253aj;

            /* renamed from: ak */
            private Throwable f9254ak;

            /* renamed from: al */
            private Throwable f9255al;

            /* renamed from: am */
            private Throwable f9256am;

            /* renamed from: an */
            private Throwable f9257an;

            /* renamed from: ao */
            private LinkedList<Throwable> f9258ao;
            private Throwable ap;
            private Throwable aq;
            private Throwable ar;
            private Throwable as;
            private Throwable at;
            private Throwable au;
            private Throwable av;
            private Throwable aw;
            private Throwable ax;
            private Throwable ay;
            private Throwable az;
            private Throwable bA;
            private Throwable bB;
            private Throwable bC;
            private Throwable bD;
            private Throwable bE;
            private Throwable bF;
            private Throwable bG;
            private Throwable bH;
            private Throwable bI;
            private LinkedList<Throwable> bJ;

            /* renamed from: ba */
            private Throwable f9260ba;

            /* renamed from: bb */
            private Throwable f9261bb;

            /* renamed from: bc */
            private Throwable f9262bc;

            /* renamed from: bd */
            private Throwable f9263bd;

            /* renamed from: be */
            private Throwable f9264be;

            /* renamed from: bf */
            private LinkedList<Throwable> f9265bf;

            /* renamed from: bg */
            private Throwable f9266bg;

            /* renamed from: bh */
            private LinkedList<Throwable> f9267bh;

            /* renamed from: bi */
            private LinkedList<Throwable> f9268bi;

            /* renamed from: bj */
            private LinkedList<Throwable> f9269bj;

            /* renamed from: bk */
            private LinkedList<Throwable> f9270bk;

            /* renamed from: bl */
            private LinkedList<Throwable> f9271bl;

            /* renamed from: bm */
            private Throwable f9272bm;

            /* renamed from: bn */
            private Throwable f9273bn;

            /* renamed from: bo */
            private Throwable f9274bo;
            private Throwable bp;
            private Throwable bq;
            private LinkedList<Throwable> br;
            private Throwable bs;
            private Throwable bt;
            private Throwable bu;
            private Throwable bv;
            private Throwable bw;
            private Throwable bx;
            private Throwable by;
            private Throwable bz;

            /* renamed from: d */
            private Throwable f9276d;

            /* renamed from: e */
            private Throwable f9277e;

            /* renamed from: f */
            private Throwable f9278f;

            /* renamed from: g */
            private Throwable f9279g;

            /* renamed from: h */
            private Throwable f9280h;

            /* renamed from: i */
            private Throwable f9281i;

            /* renamed from: j */
            private Throwable f9282j;

            /* renamed from: k */
            private Throwable f9283k;

            /* renamed from: l */
            private Throwable f9284l;

            /* renamed from: m */
            private LinkedList<Throwable> f9285m;

            /* renamed from: n */
            private Throwable f9286n;

            /* renamed from: o */
            private Throwable f9287o;

            /* renamed from: p */
            private Throwable f9288p;

            /* renamed from: q */
            private Throwable f9289q;

            /* renamed from: r */
            private Throwable f9290r;

            /* renamed from: s */
            private Throwable f9291s;

            /* renamed from: t */
            private Throwable f9292t;

            /* renamed from: u */
            private Throwable f9293u;

            /* renamed from: v */
            private LinkedList<Throwable> f9294v;

            /* renamed from: w */
            private Throwable f9295w;

            /* renamed from: x */
            private LinkedList<Throwable> f9296x;

            /* renamed from: y */
            private Throwable f9297y;

            /* renamed from: z */
            private Throwable f9298z;

            /* renamed from: b */
            private boolean f9259b = false;

            /* renamed from: c */
            private boolean f9275c = false;

            public Error() {
                DHResponse.this = r1;
            }

            public void a(String str, Throwable th2) {
                LinkedList<Throwable> linkedList;
                if ("glberr".equals(str)) {
                    this.f9259b = true;
                } else if (th2 != null) {
                    this.f9275c = true;
                }
                if ("glberr".equals(str)) {
                    this.f9276d = th2;
                } else if ("cird".equals(str)) {
                    this.f9277e = th2;
                } else if ("gsimt".equals(str)) {
                    this.f9278f = th2;
                } else if ("gbsi".equals(str)) {
                    this.f9279g = th2;
                } else if ("bgmdl".equals(str)) {
                    this.f9280h = th2;
                } else if ("gmnft".equals(str)) {
                    this.f9281i = th2;
                } else if ("gdvci".equals(str)) {
                    this.f9282j = th2;
                } else if ("gimi".equals(str)) {
                    this.f9283k = th2;
                } else if ("qriei".equals(str)) {
                    this.f9284l = th2;
                } else {
                    if ("gstmpts".equals(str)) {
                        if (this.f9285m == null) {
                            this.f9285m = new LinkedList<>();
                        }
                        linkedList = this.f9285m;
                    } else if ("gsrln".equals(str)) {
                        this.f9286n = th2;
                        return;
                    } else if ("govsit".equals(str)) {
                        this.f9287o = th2;
                        return;
                    } else if ("govsnm".equals(str)) {
                        this.f9288p = th2;
                        return;
                    } else if ("golgu".equals(str)) {
                        this.f9289q = th2;
                        return;
                    } else if ("galgu".equals(str)) {
                        this.f9290r = th2;
                        return;
                    } else if ("gocnty".equals(str)) {
                        this.f9291s = th2;
                        return;
                    } else if ("gscsz".equals(str)) {
                        this.f9292t = th2;
                        return;
                    } else if ("gcrie".equals(str)) {
                        this.f9293u = th2;
                        return;
                    } else if ("gcriefce".equals(str)) {
                        if (this.f9294v == null) {
                            this.f9294v = new LinkedList<>();
                        }
                        linkedList = this.f9294v;
                    } else if ("gcrnm".equals(str)) {
                        this.f9295w = th2;
                        return;
                    } else if ("gcrnmfce".equals(str)) {
                        if (this.f9296x == null) {
                            this.f9296x = new LinkedList<>();
                        }
                        linkedList = this.f9296x;
                    } else if ("gssn".equals(str)) {
                        this.f9297y = th2;
                        return;
                    } else if ("gbhnm".equals(str)) {
                        this.f9298z = th2;
                        return;
                    } else if ("gsnmd".equals(str)) {
                        this.A = th2;
                        return;
                    } else if ("gsnmdfp".equals(str)) {
                        if (this.B == null) {
                            this.B = new LinkedList<>();
                        }
                        linkedList = this.B;
                    } else if ("gneyp".equals(str)) {
                        this.C = th2;
                        return;
                    } else if ("gneypfce".equals(str)) {
                        if (this.D == null) {
                            this.D = new LinkedList<>();
                        }
                        linkedList = this.D;
                    } else if ("cknavbl".equals(str)) {
                        this.E = th2;
                        return;
                    } else if ("gnktpfs".equals(str)) {
                        this.F = th2;
                        return;
                    } else if ("gdtlnktpfs".equals(str)) {
                        this.G = th2;
                        return;
                    } else if ("pltfcd".equals(str)) {
                        this.H = th2;
                        return;
                    } else if ("gdvk".equals(str)) {
                        this.I = th2;
                        return;
                    } else if ("gdvkfc".equals(str)) {
                        if (this.J == null) {
                            this.J = new LinkedList<>();
                        }
                        linkedList = this.J;
                    } else if ("gpgnm".equals(str)) {
                        this.K = th2;
                        return;
                    } else if ("gpnmmt".equals(str)) {
                        this.L = th2;
                        return;
                    } else if ("gpnmfp".equals(str)) {
                        if (this.M == null) {
                            this.M = new LinkedList<>();
                        }
                        linkedList = this.M;
                    } else if ("gpvsnm".equals(str)) {
                        this.N = th2;
                        return;
                    } else if ("gpvsme".equals(str)) {
                        this.O = th2;
                        return;
                    } else if ("gia".equals(str)) {
                        if (this.P == null) {
                            this.P = new LinkedList<>();
                        }
                        linkedList = this.P;
                    } else if ("gsl".equals(str)) {
                        this.Q = th2;
                        return;
                    } else if ("ckpmsi".equals(str)) {
                        if (this.R == null) {
                            this.R = new LinkedList<>();
                        }
                        linkedList = this.R;
                    } else if ("sdcsta".equals(str)) {
                        this.S = th2;
                        return;
                    } else if ("gscpt".equals(str)) {
                        this.T = th2;
                        return;
                    } else if ("gavti".equals(str)) {
                        this.U = th2;
                        return;
                    } else if ("gisi".equals(str)) {
                        this.V = th2;
                        return;
                    } else if ("qryisi".equals(str)) {
                        this.W = th2;
                        return;
                    } else if ("glctn".equals(str)) {
                        if (this.X == null) {
                            this.X = new LinkedList<>();
                        }
                        linkedList = this.X;
                    } else if ("gcld".equals(str)) {
                        this.Y = th2;
                        return;
                    } else if ("gcllc".equals(str)) {
                        this.Z = th2;
                        return;
                    } else if ("gpcmt".equals(str)) {
                        this.f9244aa = th2;
                        return;
                    } else if ("gcmlt".equals(str)) {
                        this.f9245ab = th2;
                        return;
                    } else if ("gcmln".equals(str)) {
                        this.f9246ac = th2;
                        return;
                    } else if ("gcmbd".equals(str)) {
                        this.f9247ad = th2;
                        return;
                    } else if ("gcmsd".equals(str)) {
                        this.f9248ae = th2;
                        return;
                    } else if ("gcmnd".equals(str)) {
                        this.f9249af = th2;
                        return;
                    } else if ("gnbclin".equals(str)) {
                        this.f9250ag = th2;
                        return;
                    } else if ("gdvtp".equals(str)) {
                        this.f9251ah = th2;
                        return;
                    } else if ("gdfrspg".equals(str)) {
                        if (this.f9252ai == null) {
                            this.f9252ai = new LinkedList<>();
                        }
                        linkedList = this.f9252ai;
                    } else if ("grsvps".equals(str)) {
                        this.f9253aj = th2;
                        return;
                    } else if ("tpact".equals(str)) {
                        this.f9254ak = th2;
                        return;
                    } else if ("wmcwi".equals(str)) {
                        this.f9255al = th2;
                        return;
                    } else if ("gavlwls".equals(str)) {
                        this.f9256am = th2;
                        return;
                    } else if ("scwls".equals(str)) {
                        this.f9257an = th2;
                        return;
                    } else if ("ipgist".equals(str)) {
                        if (this.f9258ao == null) {
                            this.f9258ao = new LinkedList<>();
                        }
                        linkedList = this.f9258ao;
                    } else if ("gcuin".equals(str)) {
                        this.ap = th2;
                        return;
                    } else if ("gtydvin".equals(str)) {
                        this.aq = th2;
                        return;
                    } else if ("gbtrstt".equals(str)) {
                        this.ar = th2;
                        return;
                    } else if ("gsnbtns".equals(str)) {
                        this.as = th2;
                        return;
                    } else if ("gsnbtmd".equals(str)) {
                        this.at = th2;
                        return;
                    } else if ("gqmkn".equals(str)) {
                        this.au = th2;
                        return;
                    } else if ("gszin".equals(str)) {
                        this.av = th2;
                        return;
                    } else if ("gmrin".equals(str)) {
                        this.aw = th2;
                        return;
                    } else if ("gmivsn".equals(str)) {
                        this.ax = th2;
                        return;
                    } else if ("gabct".equals(str)) {
                        this.ay = th2;
                        return;
                    } else if ("cx".equals(str)) {
                        this.az = th2;
                        return;
                    } else if ("ckpd".equals(str)) {
                        this.aA = th2;
                        return;
                    } else if ("ubenbl".equals(str)) {
                        this.aB = th2;
                        return;
                    } else if ("dvenbl".equals(str)) {
                        this.aC = th2;
                        return;
                    } else if ("ckua".equals(str)) {
                        this.aD = th2;
                        return;
                    } else if ("vnmt".equals(str)) {
                        this.aE = th2;
                        return;
                    } else if ("degb".equals(str)) {
                        this.aF = th2;
                        return;
                    } else if ("iwpxy".equals(str)) {
                        this.aG = th2;
                        return;
                    } else if ("gcrslt".equals(str)) {
                        this.aH = th2;
                        return;
                    } else if ("gtmne".equals(str)) {
                        this.aI = th2;
                        return;
                    } else if ("gspt".equals(str)) {
                        this.aJ = th2;
                        return;
                    } else if ("gcfre".equals(str)) {
                        this.aK = th2;
                        return;
                    } else if ("gctp".equals(str)) {
                        this.aL = th2;
                        return;
                    } else if ("gflv".equals(str)) {
                        this.aM = th2;
                        return;
                    } else if ("gtrc".equals(str)) {
                        this.aN = th2;
                        return;
                    } else if ("gbsbd".equals(str)) {
                        this.aO = th2;
                        return;
                    } else if ("gbfspy".equals(str)) {
                        this.aP = th2;
                        return;
                    } else if ("gbplfo".equals(str)) {
                        this.aQ = th2;
                        return;
                    } else if ("gdntp".equals(str)) {
                        this.aR = th2;
                        return;
                    } else if ("gdltmpg".equals(str)) {
                        this.aS = th2;
                        return;
                    } else if ("gdltm".equals(str)) {
                        this.aT = th2;
                        return;
                    } else if ("gmlt".equals(str)) {
                        this.aU = th2;
                        return;
                    } else if ("gbrd".equals(str)) {
                        this.aV = th2;
                        return;
                    } else if ("ismlt".equals(str)) {
                        this.aW = th2;
                        return;
                    } else if ("gdvmua".equals(str)) {
                        this.aX = th2;
                        return;
                    } else if ("ifkps".equals(str)) {
                        if (this.aY == null) {
                            this.aY = new LinkedList<>();
                        }
                        linkedList = this.aY;
                    } else if ("istvdv".equals(str)) {
                        this.aZ = th2;
                        return;
                    } else if ("cinmnps".equals(str)) {
                        this.f9260ba = th2;
                        return;
                    } else if ("gcrtpcnm".equals(str)) {
                        this.f9261bb = th2;
                        return;
                    } else if ("unrgrcv".equals(str)) {
                        this.f9262bc = th2;
                        return;
                    } else if ("rgrcv".equals(str)) {
                        this.f9263bd = th2;
                        return;
                    } else if ("rgwsr".equals(str)) {
                        this.f9264be = th2;
                        return;
                    } else if ("sysvsaf".equals(str)) {
                        if (this.f9265bf == null) {
                            this.f9265bf = new LinkedList<>();
                        }
                        linkedList = this.f9265bf;
                    } else if ("gaplcn".equals(str)) {
                        this.f9266bg = th2;
                        return;
                    } else if ("qritsvc".equals(str)) {
                        if (this.f9267bh == null) {
                            this.f9267bh = new LinkedList<>();
                        }
                        linkedList = this.f9267bh;
                    } else if ("rsaciy".equals(str)) {
                        if (this.f9268bi == null) {
                            this.f9268bi = new LinkedList<>();
                        }
                        linkedList = this.f9268bi;
                    } else if ("gpgif".equals(str)) {
                        if (this.f9269bj == null) {
                            this.f9269bj = new LinkedList<>();
                        }
                        linkedList = this.f9269bj;
                    } else if ("gpgiffcin".equals(str)) {
                        if (this.f9270bk == null) {
                            this.f9270bk = new LinkedList<>();
                        }
                        linkedList = this.f9270bk;
                    } else if ("gpgifstrg".equals(str)) {
                        if (this.f9271bl == null) {
                            this.f9271bl = new LinkedList<>();
                        }
                        linkedList = this.f9271bl;
                    } else if ("giads".equals(str)) {
                        this.f9272bm = th2;
                        return;
                    } else if ("hdstipu".equals(str)) {
                        this.f9273bn = th2;
                        return;
                    } else if ("swstin".equals(str)) {
                        this.f9274bo = th2;
                        return;
                    } else if ("gdvda".equals(str)) {
                        this.bp = th2;
                        return;
                    } else if ("gdvdtnas".equals(str)) {
                        this.bq = th2;
                        return;
                    } else if ("bsasm".equals(str)) {
                        if (this.br == null) {
                            this.br = new LinkedList<>();
                        }
                        linkedList = this.br;
                    } else if ("crtavthd".equals(str)) {
                        this.bs = th2;
                        return;
                    } else if ("galtut".equals(str)) {
                        this.bt = th2;
                        return;
                    } else if ("gbrdm".equals(str)) {
                        this.bu = th2;
                        return;
                    } else if ("gdvme".equals(str)) {
                        this.bv = th2;
                        return;
                    } else if ("gdpyd".equals(str)) {
                        this.bw = th2;
                        return;
                    } else if ("gfgrnt".equals(str)) {
                        this.bx = th2;
                        return;
                    } else if ("grivsn".equals(str)) {
                        this.by = th2;
                        return;
                    } else if ("gcrup".equals(str)) {
                        this.bz = th2;
                        return;
                    } else if ("gcifm".equals(str)) {
                        this.bA = th2;
                        return;
                    } else if ("godm".equals(str)) {
                        this.bB = th2;
                        return;
                    } else if ("godhm".equals(str)) {
                        this.bC = th2;
                        return;
                    } else if ("gadm".equals(str)) {
                        this.bD = th2;
                        return;
                    } else if ("gvdm".equals(str)) {
                        this.bE = th2;
                        return;
                    } else if ("gudm".equals(str)) {
                        this.bF = th2;
                        return;
                    } else if ("galdm".equals(str)) {
                        this.bG = th2;
                        return;
                    } else if ("gtaif".equals(str)) {
                        this.bH = th2;
                        return;
                    } else if ("gtaifok".equals(str)) {
                        this.bI = th2;
                        return;
                    } else if ("gtaifprm".equals(str)) {
                        if (this.bJ == null) {
                            this.bJ = new LinkedList<>();
                        }
                        linkedList = this.bJ;
                    } else {
                        NLog mobLog = MobLog.getInstance();
                        StringBuilder a10 = androidx.activity.result.d.a("Unknown name to set: ", str, ", t: ");
                        a10.append(th2.getMessage());
                        mobLog.d(a10.toString(), new Object[0]);
                        return;
                    }
                    linkedList.add(th2);
                }
            }

            public Throwable checkNetworkAvailable() {
                return this.E;
            }

            public Throwable checkPad() {
                return this.aA;
            }

            public Throwable checkUA() {
                return this.aD;
            }

            public Throwable cx() {
                return this.az;
            }

            public Throwable debugable() {
                return this.aF;
            }

            public Throwable devEnable() {
                return this.aC;
            }

            public Throwable getAD() {
                return this.bD;
            }

            public Throwable getAInfo() {
                return this.bH;
            }

            public Throwable getAInfoForPkg(int... iArr) {
                return (Throwable) DHResponse.b(this.bJ, null, iArr);
            }

            public Throwable getALLD() {
                return this.bG;
            }

            public Throwable getAdvertisingID() {
                return this.U;
            }

            public Throwable getAlbumCount() {
                return this.ay;
            }

            public Throwable getAppLanguage() {
                return this.f9290r;
            }

            public Throwable getAppLastUpdateTime() {
                return this.bt;
            }

            public Throwable getAppName() {
                return this.L;
            }

            public Throwable getAppNameForPkg(int... iArr) {
                return (Throwable) DHResponse.b(this.M, null, iArr);
            }

            public Throwable getApplication() {
                return this.f9266bg;
            }

            public Throwable getAvailableWifiList() {
                return this.f9256am;
            }

            public Throwable getAvailableWifiListOneKey() {
                return this.bI;
            }

            public Throwable getBaseband() {
                return this.aO;
            }

            public Throwable getBatteryState() {
                return this.ar;
            }

            public Throwable getBluetoothName() {
                return this.f9298z;
            }

            public Throwable getBoard() {
                return this.bu;
            }

            public Throwable getBoardFromSysProperty() {
                return this.aP;
            }

            public Throwable getBoardPlatform() {
                return this.aQ;
            }

            public Throwable getBrand() {
                return this.aV;
            }

            public Throwable getBssid() {
                return this.f9279g;
            }

            public Throwable getCInfo() {
                return this.bA;
            }

            public Throwable getCPUFreq() {
                return this.aK;
            }

            public Throwable getCPUInfo() {
                return this.ap;
            }

            public Throwable getCPUType() {
                return this.aL;
            }

            public Throwable getCamResolution() {
                return this.aH;
            }

            public Throwable getCarrier() {
                return this.f9293u;
            }

            public Throwable getCarrierForce(int... iArr) {
                return (Throwable) DHResponse.b(this.f9294v, null, iArr);
            }

            public Throwable getCarrierName() {
                return this.f9295w;
            }

            public Throwable getCarrierNameForce(int... iArr) {
                return (Throwable) DHResponse.b(this.f9296x, null, iArr);
            }

            public Throwable getCdmaBid() {
                return this.f9247ad;
            }

            public Throwable getCdmaLat() {
                return this.f9245ab;
            }

            public Throwable getCdmaLon() {
                return this.f9246ac;
            }

            public Throwable getCdmaNid() {
                return this.f9249af;
            }

            public Throwable getCdmaSid() {
                return this.f9248ae;
            }

            public Throwable getCellId() {
                return this.Y;
            }

            public Throwable getCellLac() {
                return this.Z;
            }

            public Throwable getCgroup() {
                return this.bz;
            }

            public Throwable getCurrentWifiInfo() {
                return this.f9255al;
            }

            public Throwable getDataNtType() {
                return this.aR;
            }

            public Throwable getDefaultIM() {
                return this.aT;
            }

            public Throwable getDefaultIMPkg() {
                return this.aS;
            }

            public Throwable getDefaultResolvePkg(int... iArr) {
                return (Throwable) DHResponse.b(this.f9252ai, null, iArr);
            }

            public Throwable getDetailNetworkTypeForStatic() {
                return this.G;
            }

            public Throwable getDeviceData() {
                return this.bp;
            }

            public Throwable getDeviceDataNotAES() {
                return this.bq;
            }

            public Throwable getDeviceId() {
                return this.f9282j;
            }

            public Throwable getDeviceKey() {
                return this.I;
            }

            public Throwable getDeviceKeyFromCache(int... iArr) {
                return (Throwable) DHResponse.b(this.J, null, iArr);
            }

            public Throwable getDeviceMemUsage() {
                return this.aX;
            }

            public Throwable getDeviceName() {
                return this.bv;
            }

            public Throwable getDeviceType() {
                return this.f9251ah;
            }

            public Throwable getDisplayId() {
                return this.bw;
            }

            public Throwable getFingerprint() {
                return this.bx;
            }

            public Throwable getFlavor() {
                return this.aM;
            }

            public Throwable getGlobal() {
                return this.f9276d;
            }

            public Throwable getIA(int... iArr) {
                return (Throwable) DHResponse.b(this.P, null, iArr);
            }

            public Throwable getIMEI() {
                return this.f9283k;
            }

            public Throwable getIMList() {
                return this.aU;
            }

            public Throwable getIMSI() {
                return this.V;
            }

            public Throwable getIPAddress() {
                return this.f9272bm;
            }

            public Throwable getLocation(int... iArr) {
                return (Throwable) DHResponse.b(this.R, null, iArr);
            }

            public Throwable getMIUIVersion() {
                return this.ax;
            }

            public Throwable getManufacturer() {
                return this.f9281i;
            }

            public Throwable getMemoryInfo() {
                return this.aw;
            }

            public Throwable getModel() {
                return this.f9280h;
            }

            public Throwable getNeighboringCellInfo() {
                return this.f9250ag;
            }

            public Throwable getNetworkType() {
                return this.C;
            }

            public Throwable getNetworkTypeForStatic() {
                return this.F;
            }

            public Throwable getNetworkTypeForce(int... iArr) {
                return (Throwable) DHResponse.b(this.D, null, iArr);
            }

            public Throwable getOD() {
                return this.bB;
            }

            public Throwable getODH() {
                return this.bC;
            }

            public Throwable getOSCountry() {
                return this.f9291s;
            }

            public Throwable getOSLanguage() {
                return this.f9289q;
            }

            public Throwable getOSVersionInt() {
                return this.f9287o;
            }

            public Throwable getOSVersionName() {
                return this.f9288p;
            }

            public Throwable getPInfo(int... iArr) {
                return (Throwable) DHResponse.b(this.f9269bj, null, iArr);
            }

            public Throwable getPInfoForce(int... iArr) {
                return (Throwable) DHResponse.b(this.f9270bk, null, iArr);
            }

            public Throwable getPInfoStrategy(int... iArr) {
                return (Throwable) DHResponse.b(this.f9271bl, null, iArr);
            }

            public Throwable getPsc() {
                return this.f9244aa;
            }

            public Throwable getQemuKernel() {
                return this.au;
            }

            public Throwable getRadioVersion() {
                return this.by;
            }

            public Throwable getResolvePkgs() {
                return this.f9253aj;
            }

            public Throwable getSA() {
                return this.Q;
            }

            public Throwable getSSID() {
                return this.f9278f;
            }

            public Throwable getScreenBrightness() {
                return this.as;
            }

            public Throwable getScreenBrightnessMode() {
                return this.at;
            }

            public Throwable getScreenSize() {
                return this.f9292t;
            }

            public Throwable getSdcardState() {
                return this.S;
            }

            public Throwable getSerialno() {
                return this.f9286n;
            }

            public Throwable getSignMD5() {
                return this.A;
            }

            public Throwable getSignMD5ForPkg(int... iArr) {
                return (Throwable) DHResponse.b(this.B, null, iArr);
            }

            public Throwable getSimSerialNumber() {
                return this.f9297y;
            }

            public Throwable getSizeInfo() {
                return this.av;
            }

            public Throwable getSupport() {
                return this.aJ;
            }

            public Throwable getSystemProperties(int... iArr) {
                return (Throwable) DHResponse.b(this.f9285m, null, iArr);
            }

            public Throwable getTTYDriversInfo() {
                return this.aq;
            }

            public Throwable getTimezone() {
                return this.aI;
            }

            public Throwable getTopActivity() {
                return this.f9254ak;
            }

            public Throwable getTraffic() {
                return this.aN;
            }

            public Throwable getUD() {
                return this.bF;
            }

            public Throwable getVD() {
                return this.bE;
            }

            public boolean hasError() {
                return this.f9275c;
            }

            public boolean hasGlobalError() {
                return this.f9259b;
            }

            public Throwable hideSoftInput() {
                return this.f9273bn;
            }

            public Throwable isFakePass(int... iArr) {
                return (Throwable) DHResponse.b(this.aY, null, iArr);
            }

            public Throwable isPackageInstalled(int... iArr) {
                return (Throwable) DHResponse.b(this.f9258ao, null, iArr);
            }

            public Throwable isRooted() {
                return this.f9277e;
            }

            public Throwable isSensitiveDevice() {
                return this.aZ;
            }

            public Throwable isSmlt() {
                return this.aW;
            }

            public Throwable isWifiProxy() {
                return this.aG;
            }

            public Throwable queryIMEI() {
                return this.f9284l;
            }

            public Throwable queryIMSI() {
                return this.W;
            }

            public Throwable queryIntentServices(int... iArr) {
                return (Throwable) DHResponse.b(this.f9267bh, null, iArr);
            }

            public Throwable registerWifiScanReceiver() {
                return this.f9264be;
            }

            public Throwable resolveActivity(int... iArr) {
                return (Throwable) DHResponse.b(this.f9268bi, null, iArr);
            }

            public Throwable scanWifiList() {
                return this.f9257an;
            }

            public Throwable showSoftInput() {
                return this.f9274bo;
            }

            public Throwable usbEnable() {
                return this.aB;
            }

            public Throwable vpn() {
                return this.aE;
            }
        }

        public static <T> T b(LinkedList<T> linkedList, T t10, int... iArr) {
            if (linkedList != null) {
                if (iArr.length == 0) {
                    return linkedList.get(0);
                }
                if (iArr[0] < linkedList.size()) {
                    return linkedList.get(iArr[0]);
                }
                NLog mobLog = MobLog.getInstance();
                StringBuilder a10 = android.support.v4.media.d.a("WARNING: ");
                a10.append(iArr[0]);
                a10.append(" out of bound, size: ");
                a10.append(linkedList.size());
                mobLog.w(a10.toString());
            }
            return t10;
        }

        public void a(String str, Object obj) {
            a(str, obj, false);
        }

        public void a(String str, Object obj, boolean z10) {
            LinkedList linkedList;
            if ("cird".equals(str)) {
                if (z10) {
                    obj = Boolean.FALSE;
                }
                this.f9187a = ((Boolean) obj).booleanValue();
            } else if ("gsimt".equals(str)) {
                if (z10) {
                    obj = null;
                }
                this.f9203b = (String) obj;
            } else if ("gbsi".equals(str)) {
                if (z10) {
                    obj = null;
                }
                this.f9219c = (String) obj;
            } else if ("bgmdl".equals(str)) {
                if (z10) {
                    obj = null;
                }
                this.f9220d = (String) obj;
            } else if ("gmnft".equals(str)) {
                if (z10) {
                    obj = null;
                }
                this.f9221e = (String) obj;
            } else if ("gdvci".equals(str)) {
                if (z10) {
                    obj = null;
                }
                this.f9222f = (String) obj;
            } else if ("gimi".equals(str)) {
                if (z10) {
                    obj = null;
                }
                this.f9223g = (String) obj;
            } else if ("qriei".equals(str)) {
                if (z10) {
                    obj = null;
                }
                this.f9224h = (String[]) obj;
            } else {
                if ("gstmpts".equals(str)) {
                    if (this.f9225i == null) {
                        this.f9225i = new LinkedList<>();
                    }
                    if (z10) {
                        obj = null;
                    }
                    linkedList = this.f9225i;
                } else if ("gsrln".equals(str)) {
                    if (z10) {
                        obj = null;
                    }
                    this.f9226j = (String) obj;
                    return;
                } else if ("govsit".equals(str)) {
                    if (z10) {
                        obj = 0;
                    }
                    this.f9227k = ((Integer) obj).intValue();
                    return;
                } else if ("govsnm".equals(str)) {
                    if (z10) {
                        obj = null;
                    }
                    this.f9228l = (String) obj;
                    return;
                } else if ("golgu".equals(str)) {
                    if (z10) {
                        obj = null;
                    }
                    this.f9229m = (String) obj;
                    return;
                } else if ("galgu".equals(str)) {
                    if (z10) {
                        obj = null;
                    }
                    this.f9230n = (String) obj;
                    return;
                } else if ("gocnty".equals(str)) {
                    if (z10) {
                        obj = null;
                    }
                    this.f9231o = (String) obj;
                    return;
                } else if ("gscsz".equals(str)) {
                    if (z10) {
                        obj = null;
                    }
                    this.f9232p = (String) obj;
                    return;
                } else if ("gcrie".equals(str)) {
                    if (z10) {
                        obj = null;
                    }
                    this.f9233q = (String) obj;
                    return;
                } else if ("gcriefce".equals(str)) {
                    if (this.f9234r == null) {
                        this.f9234r = new LinkedList<>();
                    }
                    if (z10) {
                        obj = null;
                    }
                    linkedList = this.f9234r;
                } else if ("gcrnm".equals(str)) {
                    if (z10) {
                        obj = null;
                    }
                    this.f9235s = (String) obj;
                    return;
                } else if ("gcrnmfce".equals(str)) {
                    if (this.f9236t == null) {
                        this.f9236t = new LinkedList<>();
                    }
                    if (z10) {
                        obj = null;
                    }
                    linkedList = this.f9236t;
                } else if ("gssn".equals(str)) {
                    if (z10) {
                        obj = null;
                    }
                    this.f9237u = (String) obj;
                    return;
                } else if ("gbhnm".equals(str)) {
                    if (z10) {
                        obj = null;
                    }
                    this.f9238v = (String) obj;
                    return;
                } else if ("gsnmd".equals(str)) {
                    if (z10) {
                        obj = null;
                    }
                    this.f9239w = (String) obj;
                    return;
                } else if ("gsnmdfp".equals(str)) {
                    if (this.f9240x == null) {
                        this.f9240x = new LinkedList<>();
                    }
                    if (z10) {
                        obj = null;
                    }
                    linkedList = this.f9240x;
                } else if ("gneyp".equals(str)) {
                    if (z10) {
                        obj = null;
                    }
                    this.f9241y = (String) obj;
                    return;
                } else if ("gneypfce".equals(str)) {
                    if (this.f9242z == null) {
                        this.f9242z = new LinkedList<>();
                    }
                    if (z10) {
                        obj = null;
                    }
                    linkedList = this.f9242z;
                } else if ("cknavbl".equals(str)) {
                    if (z10) {
                        obj = Boolean.FALSE;
                    }
                    this.A = ((Boolean) obj).booleanValue();
                    return;
                } else if ("gnktpfs".equals(str)) {
                    if (z10) {
                        obj = null;
                    }
                    this.B = (String) obj;
                    return;
                } else if ("gdtlnktpfs".equals(str)) {
                    if (z10) {
                        obj = null;
                    }
                    this.C = (String) obj;
                    return;
                } else if ("pltfcd".equals(str)) {
                    if (z10) {
                        obj = 0;
                    }
                    this.D = ((Integer) obj).intValue();
                    return;
                } else if ("gdvk".equals(str)) {
                    if (z10) {
                        obj = null;
                    }
                    this.E = (String) obj;
                    return;
                } else if ("gdvkfc".equals(str)) {
                    if (this.F == null) {
                        this.F = new LinkedList<>();
                    }
                    if (z10) {
                        obj = null;
                    }
                    linkedList = this.F;
                } else if ("gpgnm".equals(str)) {
                    if (z10) {
                        obj = null;
                    }
                    this.G = (String) obj;
                    return;
                } else if ("gpnmmt".equals(str)) {
                    if (z10) {
                        obj = null;
                    }
                    this.H = (String) obj;
                    return;
                } else if (!"gpnmfp".equals(str)) {
                    if ("gpvsnm".equals(str)) {
                        if (z10) {
                            obj = 0;
                        }
                        this.J = ((Integer) obj).intValue();
                        return;
                    } else if ("gpvsme".equals(str)) {
                        if (z10) {
                            obj = null;
                        }
                        this.K = (String) obj;
                        return;
                    } else {
                        if ("gia".equals(str)) {
                            if (this.L == null) {
                                this.L = new LinkedList<>();
                            }
                            if (z10) {
                                obj = null;
                            }
                            linkedList = this.L;
                            obj = (ArrayList) obj;
                        } else if ("gsl".equals(str)) {
                            if (z10) {
                                obj = null;
                            }
                            this.M = (ArrayList) obj;
                            return;
                        } else {
                            if ("ckpmsi".equals(str)) {
                                if (this.N == null) {
                                    this.N = new LinkedList<>();
                                }
                                if (z10) {
                                    obj = Boolean.FALSE;
                                }
                                linkedList = this.N;
                            } else if ("sdcsta".equals(str)) {
                                if (z10) {
                                    obj = Boolean.FALSE;
                                }
                                this.O = ((Boolean) obj).booleanValue();
                                return;
                            } else if ("gscpt".equals(str)) {
                                if (z10) {
                                    obj = null;
                                }
                                this.P = (String) obj;
                                return;
                            } else if ("gavti".equals(str)) {
                                if (z10) {
                                    obj = null;
                                }
                                this.Q = (String) obj;
                                return;
                            } else if ("gisi".equals(str)) {
                                if (z10) {
                                    obj = null;
                                }
                                this.R = (String) obj;
                                return;
                            } else if ("qryisi".equals(str)) {
                                if (z10) {
                                    obj = null;
                                }
                                this.S = (String[]) obj;
                                return;
                            } else if ("glctn".equals(str)) {
                                if (this.T == null) {
                                    this.T = new LinkedList<>();
                                }
                                if (z10) {
                                    obj = null;
                                }
                                linkedList = this.T;
                                obj = (Location) obj;
                            } else if ("gcld".equals(str)) {
                                if (z10) {
                                    obj = 0;
                                }
                                this.U = ((Integer) obj).intValue();
                                return;
                            } else if ("gcllc".equals(str)) {
                                if (z10) {
                                    obj = 0;
                                }
                                this.V = ((Integer) obj).intValue();
                                return;
                            } else if ("gpcmt".equals(str)) {
                                if (z10) {
                                    obj = 0;
                                }
                                this.W = ((Integer) obj).intValue();
                                return;
                            } else if ("gcmlt".equals(str)) {
                                if (z10) {
                                    obj = 0;
                                }
                                this.X = ((Integer) obj).intValue();
                                return;
                            } else if ("gcmln".equals(str)) {
                                if (z10) {
                                    obj = 0;
                                }
                                this.Y = ((Integer) obj).intValue();
                                return;
                            } else if ("gcmbd".equals(str)) {
                                if (z10) {
                                    obj = 0;
                                }
                                this.Z = ((Integer) obj).intValue();
                                return;
                            } else if ("gcmsd".equals(str)) {
                                if (z10) {
                                    obj = 0;
                                }
                                this.f9188aa = ((Integer) obj).intValue();
                                return;
                            } else if ("gcmnd".equals(str)) {
                                if (z10) {
                                    obj = 0;
                                }
                                this.f9189ab = ((Integer) obj).intValue();
                                return;
                            } else if ("gnbclin".equals(str)) {
                                if (z10) {
                                    obj = null;
                                }
                                this.f9190ac = (ArrayList) obj;
                                return;
                            } else if ("gdvtp".equals(str)) {
                                if (z10) {
                                    obj = null;
                                }
                                this.f9191ad = (String) obj;
                                return;
                            } else if ("gdfrspg".equals(str)) {
                                if (this.f9192ae == null) {
                                    this.f9192ae = new LinkedList<>();
                                }
                                if (z10) {
                                    obj = null;
                                }
                                linkedList = this.f9192ae;
                            } else {
                                if ("grsvps".equals(str)) {
                                    if (this.f9193af == null) {
                                        this.f9193af = new LinkedList<>();
                                    }
                                    if (z10) {
                                        obj = null;
                                    }
                                    linkedList = this.f9193af;
                                } else if ("tpact".equals(str)) {
                                    if (z10) {
                                        obj = null;
                                    }
                                    this.f9194ag = (Activity) obj;
                                    return;
                                } else if ("wmcwi".equals(str)) {
                                    if (z10) {
                                        obj = null;
                                    }
                                    this.f9195ah = (HashMap) obj;
                                    return;
                                } else if ("gavlwls".equals(str)) {
                                    if (z10) {
                                        obj = null;
                                    }
                                    this.f9196ai = (ArrayList) obj;
                                    return;
                                } else if ("scwls".equals(str)) {
                                    if (z10) {
                                        obj = Boolean.FALSE;
                                    }
                                    this.f9197aj = ((Boolean) obj).booleanValue();
                                    return;
                                } else if ("ipgist".equals(str)) {
                                    if (this.f9198ak == null) {
                                        this.f9198ak = new LinkedList<>();
                                    }
                                    if (z10) {
                                        obj = Boolean.FALSE;
                                    }
                                    linkedList = this.f9198ak;
                                } else if ("gcuin".equals(str)) {
                                    if (z10) {
                                        obj = null;
                                    }
                                    this.f9199al = (HashMap) obj;
                                    return;
                                } else if ("gtydvin".equals(str)) {
                                    if (z10) {
                                        obj = null;
                                    }
                                    this.f9200am = (ArrayList) obj;
                                    return;
                                } else if ("gbtrstt".equals(str)) {
                                    if (z10) {
                                        obj = null;
                                    }
                                    this.f9201an = (HashMap) obj;
                                    return;
                                } else if ("gsnbtns".equals(str)) {
                                    if (z10) {
                                        obj = 0;
                                    }
                                    this.f9202ao = ((Integer) obj).intValue();
                                    return;
                                } else if ("gsnbtmd".equals(str)) {
                                    if (z10) {
                                        obj = 0;
                                    }
                                    this.ap = ((Integer) obj).intValue();
                                    return;
                                } else if ("gqmkn".equals(str)) {
                                    if (z10) {
                                        obj = null;
                                    }
                                    this.aq = (String) obj;
                                    return;
                                } else if ("gszin".equals(str)) {
                                    if (z10) {
                                        obj = null;
                                    }
                                    this.ar = (HashMap) obj;
                                    return;
                                } else if ("gmrin".equals(str)) {
                                    if (z10) {
                                        obj = null;
                                    }
                                    this.as = (HashMap) obj;
                                    return;
                                } else if ("gmivsn".equals(str)) {
                                    if (z10) {
                                        obj = null;
                                    }
                                    this.at = (String) obj;
                                    return;
                                } else if ("gabct".equals(str)) {
                                    if (z10) {
                                        obj = 0;
                                    }
                                    this.au = ((Integer) obj).intValue();
                                    return;
                                } else if ("cx".equals(str)) {
                                    if (z10) {
                                        obj = Boolean.FALSE;
                                    }
                                    this.av = ((Boolean) obj).booleanValue();
                                    return;
                                } else if ("ckpd".equals(str)) {
                                    if (z10) {
                                        obj = Boolean.FALSE;
                                    }
                                    this.aw = ((Boolean) obj).booleanValue();
                                    return;
                                } else if ("ubenbl".equals(str)) {
                                    if (z10) {
                                        obj = Boolean.FALSE;
                                    }
                                    this.ax = ((Boolean) obj).booleanValue();
                                    return;
                                } else if ("dvenbl".equals(str)) {
                                    if (z10) {
                                        obj = Boolean.FALSE;
                                    }
                                    this.ay = ((Boolean) obj).booleanValue();
                                    return;
                                } else if ("ckua".equals(str)) {
                                    if (z10) {
                                        obj = Boolean.FALSE;
                                    }
                                    this.az = ((Boolean) obj).booleanValue();
                                    return;
                                } else if ("vnmt".equals(str)) {
                                    if (z10) {
                                        obj = Boolean.FALSE;
                                    }
                                    this.aA = ((Boolean) obj).booleanValue();
                                    return;
                                } else if ("degb".equals(str)) {
                                    if (z10) {
                                        obj = Boolean.FALSE;
                                    }
                                    this.aB = ((Boolean) obj).booleanValue();
                                    return;
                                } else if ("iwpxy".equals(str)) {
                                    if (z10) {
                                        obj = Boolean.FALSE;
                                    }
                                    this.aC = ((Boolean) obj).booleanValue();
                                    return;
                                } else if ("gcrslt".equals(str)) {
                                    if (z10) {
                                        obj = null;
                                    }
                                    this.aD = (ArrayList) obj;
                                    return;
                                } else if ("gtmne".equals(str)) {
                                    if (z10) {
                                        obj = null;
                                    }
                                    this.aE = (String) obj;
                                    return;
                                } else if ("gspt".equals(str)) {
                                    if (z10) {
                                        obj = null;
                                    }
                                    this.aF = (HashMap) obj;
                                    return;
                                } else if ("gcfre".equals(str)) {
                                    if (z10) {
                                        obj = null;
                                    }
                                    this.aG = (HashMap) obj;
                                    return;
                                } else if ("gctp".equals(str)) {
                                    if (z10) {
                                        obj = null;
                                    }
                                    this.aH = (String) obj;
                                    return;
                                } else if ("gflv".equals(str)) {
                                    if (z10) {
                                        obj = null;
                                    }
                                    this.aI = (String) obj;
                                    return;
                                } else if ("gtrc".equals(str)) {
                                    if (z10) {
                                        obj = null;
                                    }
                                    this.aJ = (HashMap) obj;
                                    return;
                                } else if ("gbsbd".equals(str)) {
                                    if (z10) {
                                        obj = null;
                                    }
                                    this.aK = (String) obj;
                                    return;
                                } else if ("gbfspy".equals(str)) {
                                    if (z10) {
                                        obj = null;
                                    }
                                    this.aL = (String) obj;
                                    return;
                                } else if ("gbplfo".equals(str)) {
                                    if (z10) {
                                        obj = null;
                                    }
                                    this.aM = (String) obj;
                                    return;
                                } else if ("gdntp".equals(str)) {
                                    if (z10) {
                                        obj = 0;
                                    }
                                    this.aN = ((Integer) obj).intValue();
                                    return;
                                } else if ("gdltmpg".equals(str)) {
                                    if (z10) {
                                        obj = null;
                                    }
                                    this.aO = (String) obj;
                                    return;
                                } else if ("gdltm".equals(str)) {
                                    if (z10) {
                                        obj = null;
                                    }
                                    this.aP = (HashMap) obj;
                                    return;
                                } else if ("gmlt".equals(str)) {
                                    if (z10) {
                                        obj = null;
                                    }
                                    this.aQ = (ArrayList) obj;
                                    return;
                                } else if ("gbrd".equals(str)) {
                                    if (z10) {
                                        obj = null;
                                    }
                                    this.aR = (String) obj;
                                    return;
                                } else if ("ismlt".equals(str)) {
                                    if (z10) {
                                        obj = Boolean.FALSE;
                                    }
                                    this.aS = ((Boolean) obj).booleanValue();
                                    return;
                                } else if ("gdvmua".equals(str)) {
                                    if (z10) {
                                        obj = null;
                                    }
                                    this.aT = (HashMap) obj;
                                    return;
                                } else if ("ifkps".equals(str)) {
                                    if (this.aU == null) {
                                        this.aU = new LinkedList<>();
                                    }
                                    if (z10) {
                                        obj = Boolean.FALSE;
                                    }
                                    linkedList = this.aU;
                                } else if ("istvdv".equals(str)) {
                                    if (z10) {
                                        obj = Boolean.FALSE;
                                    }
                                    this.aV = ((Boolean) obj).booleanValue();
                                    return;
                                } else if ("cinmnps".equals(str)) {
                                    if (z10) {
                                        obj = Boolean.FALSE;
                                    }
                                    this.aW = ((Boolean) obj).booleanValue();
                                    return;
                                } else if ("gcrtpcnm".equals(str)) {
                                    if (z10) {
                                        obj = null;
                                    }
                                    this.aX = (String) obj;
                                    return;
                                } else if ("unrgrcv".equals(str)) {
                                    if (z10) {
                                        obj = null;
                                    }
                                    this.aY = (Void) obj;
                                    return;
                                } else if ("rgrcv".equals(str)) {
                                    if (z10) {
                                        obj = null;
                                    }
                                    this.aZ = (Void) obj;
                                    return;
                                } else if ("rgwsr".equals(str)) {
                                    if (z10) {
                                        obj = null;
                                    }
                                    this.f9204ba = (Void) obj;
                                    return;
                                } else if ("sysvsaf".equals(str)) {
                                    if (this.f9205bb == null) {
                                        this.f9205bb = new LinkedList<>();
                                    }
                                    if (z10) {
                                        obj = null;
                                    }
                                    linkedList = this.f9205bb;
                                } else if ("gaplcn".equals(str)) {
                                    if (z10) {
                                        obj = null;
                                    }
                                    this.f9206bc = (Context) obj;
                                    return;
                                } else if ("qritsvc".equals(str)) {
                                    if (this.f9207bd == null) {
                                        this.f9207bd = new LinkedList<>();
                                    }
                                    if (z10) {
                                        obj = null;
                                    }
                                    linkedList = this.f9207bd;
                                } else if ("rsaciy".equals(str)) {
                                    if (this.f9208be == null) {
                                        this.f9208be = new LinkedList<>();
                                    }
                                    if (z10) {
                                        obj = null;
                                    }
                                    linkedList = this.f9208be;
                                    obj = (ResolveInfo) obj;
                                } else {
                                    if ("gpgif".equals(str)) {
                                        if (this.f9209bf == null) {
                                            this.f9209bf = new LinkedList<>();
                                        }
                                        if (z10) {
                                            obj = null;
                                        }
                                        linkedList = this.f9209bf;
                                    } else if ("gpgiffcin".equals(str)) {
                                        if (this.f9210bg == null) {
                                            this.f9210bg = new LinkedList<>();
                                        }
                                        if (z10) {
                                            obj = null;
                                        }
                                        linkedList = this.f9210bg;
                                    } else if ("gpgifstrg".equals(str)) {
                                        if (this.f9211bh == null) {
                                            this.f9211bh = new LinkedList<>();
                                        }
                                        if (z10) {
                                            obj = null;
                                        }
                                        linkedList = this.f9211bh;
                                    } else if ("giads".equals(str)) {
                                        if (z10) {
                                            obj = null;
                                        }
                                        this.f9212bi = (String) obj;
                                        return;
                                    } else if ("hdstipu".equals(str)) {
                                        if (z10) {
                                            obj = null;
                                        }
                                        this.f9213bj = (Void) obj;
                                        return;
                                    } else if ("swstin".equals(str)) {
                                        if (z10) {
                                            obj = null;
                                        }
                                        this.f9214bk = (Void) obj;
                                        return;
                                    } else if ("gdvda".equals(str)) {
                                        if (z10) {
                                            obj = null;
                                        }
                                        this.f9215bl = (String) obj;
                                        return;
                                    } else if ("gdvdtnas".equals(str)) {
                                        if (z10) {
                                            obj = null;
                                        }
                                        this.f9216bm = (String) obj;
                                        return;
                                    } else if ("bsasm".equals(str)) {
                                        if (this.f9217bn == null) {
                                            this.f9217bn = new LinkedList<>();
                                        }
                                        if (z10) {
                                            obj = null;
                                        }
                                        linkedList = this.f9217bn;
                                    } else if ("crtavthd".equals(str)) {
                                        if (z10) {
                                            obj = null;
                                        }
                                        this.f9218bo = obj;
                                        return;
                                    } else if ("galtut".equals(str)) {
                                        if (z10) {
                                            obj = 0L;
                                        }
                                        this.bp = ((Long) obj).longValue();
                                        return;
                                    } else if ("gbrdm".equals(str)) {
                                        if (z10) {
                                            obj = null;
                                        }
                                        this.bq = (String) obj;
                                        return;
                                    } else if ("gdvme".equals(str)) {
                                        if (z10) {
                                            obj = null;
                                        }
                                        this.br = (String) obj;
                                        return;
                                    } else if ("gdpyd".equals(str)) {
                                        if (z10) {
                                            obj = null;
                                        }
                                        this.bs = (String) obj;
                                        return;
                                    } else if ("gfgrnt".equals(str)) {
                                        if (z10) {
                                            obj = null;
                                        }
                                        this.bt = (String) obj;
                                        return;
                                    } else if ("grivsn".equals(str)) {
                                        if (z10) {
                                            obj = null;
                                        }
                                        this.bu = (String) obj;
                                        return;
                                    } else if ("gcrup".equals(str)) {
                                        if (z10) {
                                            obj = null;
                                        }
                                        this.bv = (String) obj;
                                        return;
                                    } else if ("gcifm".equals(str)) {
                                        if (z10) {
                                            obj = null;
                                        }
                                        this.bw = (String) obj;
                                        return;
                                    } else if ("godm".equals(str)) {
                                        if (z10) {
                                            obj = null;
                                        }
                                        this.bx = (String) obj;
                                        return;
                                    } else if ("godhm".equals(str)) {
                                        if (z10) {
                                            obj = null;
                                        }
                                        this.by = (String) obj;
                                        return;
                                    } else if ("gadm".equals(str)) {
                                        if (z10) {
                                            obj = null;
                                        }
                                        this.bz = (String) obj;
                                        return;
                                    } else if ("gvdm".equals(str)) {
                                        if (z10) {
                                            obj = null;
                                        }
                                        this.bA = (String) obj;
                                        return;
                                    } else if ("gudm".equals(str)) {
                                        if (z10) {
                                            obj = null;
                                        }
                                        this.bB = (String) obj;
                                        return;
                                    } else if ("galdm".equals(str)) {
                                        if (z10) {
                                            obj = null;
                                        }
                                        this.bC = (HashMap) obj;
                                        return;
                                    } else if ("gtaif".equals(str)) {
                                        if (z10) {
                                            obj = null;
                                        }
                                        this.bD = (ApplicationInfo) obj;
                                        return;
                                    } else if ("gtaifok".equals(str)) {
                                        if (z10) {
                                            obj = null;
                                        }
                                        this.bE = (ArrayList) obj;
                                        return;
                                    } else if (!"gtaifprm".equals(str)) {
                                        throw new Throwable("Unknown name to set: " + str + ", value: " + obj);
                                    } else {
                                        if (this.bF == null) {
                                            this.bF = new LinkedList<>();
                                        }
                                        if (z10) {
                                            obj = null;
                                        }
                                        linkedList = this.bF;
                                        obj = (ApplicationInfo) obj;
                                    }
                                    obj = (PackageInfo) obj;
                                }
                                obj = (List) obj;
                            }
                            obj = (Boolean) obj;
                        }
                        linkedList.add(obj);
                    }
                } else {
                    if (this.I == null) {
                        this.I = new LinkedList<>();
                    }
                    if (z10) {
                        obj = null;
                    }
                    linkedList = this.I;
                }
                obj = (String) obj;
                linkedList.add(obj);
            }
        }

        public boolean checkNetworkAvailable() {
            return this.A;
        }

        public boolean checkPad() {
            return this.aw;
        }

        public boolean checkUA() {
            return this.az;
        }

        public boolean cx() {
            return this.av;
        }

        public boolean debugable() {
            return this.aB;
        }

        public boolean devEnable() {
            return this.ay;
        }

        public String getAD() {
            return this.bz;
        }

        public ApplicationInfo getAInfo() {
            return this.bD;
        }

        public ApplicationInfo getAInfoForPkg(int... iArr) {
            return (ApplicationInfo) b(this.bF, null, iArr);
        }

        public HashMap<String, Object> getALLD() {
            return this.bC;
        }

        public String getAdvertisingID() {
            return this.Q;
        }

        public int getAlbumCount() {
            return this.au;
        }

        public String getAppLanguage() {
            return this.f9230n;
        }

        public long getAppLastUpdateTime() {
            return this.bp;
        }

        public String getAppName() {
            return this.H;
        }

        public String getAppNameForPkg(int... iArr) {
            return (String) b(this.I, null, iArr);
        }

        public Context getApplication() {
            return this.f9206bc;
        }

        public ArrayList<HashMap<String, Object>> getAvailableWifiList() {
            return this.f9196ai;
        }

        public ArrayList<HashMap<String, Object>> getAvailableWifiListOneKey() {
            return this.bE;
        }

        public String getBaseband() {
            return this.aK;
        }

        public HashMap<String, Object> getBatteryState() {
            return this.f9201an;
        }

        public String getBluetoothName() {
            return this.f9238v;
        }

        public String getBoard() {
            return this.bq;
        }

        public String getBoardFromSysProperty() {
            return this.aL;
        }

        public String getBoardPlatform() {
            return this.aM;
        }

        public String getBssid() {
            return this.f9219c;
        }

        public String getCInfo() {
            return this.bw;
        }

        public HashMap<String, String> getCPUFreq() {
            return this.aG;
        }

        public HashMap<String, Object> getCPUInfo() {
            return this.f9199al;
        }

        public String getCPUType() {
            return this.aH;
        }

        public ArrayList<HashMap<String, String>> getCamResolution() {
            return this.aD;
        }

        public String getCarrier() {
            return this.f9233q;
        }

        public String getCarrierForce(int... iArr) {
            return (String) b(this.f9234r, "-1", iArr);
        }

        public String getCarrierName() {
            return this.f9235s;
        }

        public String getCarrierNameForce(int... iArr) {
            return (String) b(this.f9236t, null, iArr);
        }

        public int getCdmaBid() {
            return this.Z;
        }

        public int getCdmaLat() {
            return this.X;
        }

        public int getCdmaLon() {
            return this.Y;
        }

        public int getCdmaNid() {
            return this.f9189ab;
        }

        public int getCdmaSid() {
            return this.f9188aa;
        }

        public int getCellId() {
            return this.U;
        }

        public int getCellLac() {
            return this.V;
        }

        public String getCgroup() {
            return this.bv;
        }

        public HashMap<String, Object> getCurrentWifiInfo() {
            return this.f9195ah;
        }

        public int getDataNtType() {
            return this.aN;
        }

        public HashMap<String, Object> getDefaultIM() {
            return this.aP;
        }

        public String getDefaultIMPkg() {
            return this.aO;
        }

        public String getDefaultResolvePkg(int... iArr) {
            return (String) b(this.f9192ae, null, iArr);
        }

        public String getDetailNetworkTypeForStatic() {
            return this.C;
        }

        public String getDeviceData() {
            return this.f9215bl;
        }

        public String getDeviceDataNotAES() {
            return this.f9216bm;
        }

        public String getDeviceId() {
            return this.f9222f;
        }

        public String getDeviceKey() {
            return this.E;
        }

        public String getDeviceKeyFromCache(int... iArr) {
            return (String) b(this.F, null, iArr);
        }

        public HashMap<String, Object> getDeviceMemUsage() {
            return this.aT;
        }

        public String getDeviceName() {
            return this.br;
        }

        public String getDeviceType() {
            return this.f9191ad;
        }

        public String getDisplayId() {
            return this.bs;
        }

        public String getFingerprint() {
            return this.bt;
        }

        public String getFlavor() {
            return this.aI;
        }

        public ArrayList<HashMap<String, String>> getIA(int... iArr) {
            return (ArrayList) b(this.L, new ArrayList(), iArr);
        }

        public String getIMEI() {
            return this.f9223g;
        }

        public ArrayList<HashMap<String, Object>> getIMList() {
            return this.aQ;
        }

        public String getIMSI() {
            return this.R;
        }

        public String getIPAddress() {
            return this.f9212bi;
        }

        public Location getLocation(int... iArr) {
            return (Location) b(this.T, null, iArr);
        }

        public String getMIUIVersion() {
            return this.at;
        }

        public HashMap<String, Long> getMemoryInfo() {
            return this.as;
        }

        public ArrayList<HashMap<String, Object>> getNeighboringCellInfo() {
            return this.f9190ac;
        }

        public String getNetworkType() {
            return this.f9241y;
        }

        public String getNetworkTypeForStatic() {
            return this.B;
        }

        public String getNetworkTypeForce(int... iArr) {
            return (String) b(this.f9242z, j.a("004Ybicabi[g"), iArr);
        }

        public String getOD() {
            return this.bx;
        }

        public String getODH() {
            return this.by;
        }

        public PackageInfo getPInfo(int... iArr) {
            return (PackageInfo) b(this.f9209bf, null, iArr);
        }

        public PackageInfo getPInfoForce(int... iArr) {
            return (PackageInfo) b(this.f9210bg, null, iArr);
        }

        public PackageInfo getPInfoStrategy(int... iArr) {
            return (PackageInfo) b(this.f9211bh, null, iArr);
        }

        public int getPsc() {
            return this.W;
        }

        public String getQemuKernel() {
            return this.aq;
        }

        public String getRadioVersion() {
            return this.bu;
        }

        public List<String> getResolvePkgs(int... iArr) {
            return (List) b(this.f9193af, null, iArr);
        }

        public ArrayList<HashMap<String, String>> getSA() {
            return this.M;
        }

        public String getSSID() {
            return this.f9203b;
        }

        public int getScreenBrightness() {
            return this.f9202ao;
        }

        public int getScreenBrightnessMode() {
            return this.ap;
        }

        public String getScreenSize() {
            return this.f9232p;
        }

        public boolean getSdcardState() {
            return this.O;
        }

        public String getSerialno() {
            return this.f9226j;
        }

        public String getSignMD5() {
            return this.f9239w;
        }

        public String getSignMD5ForPkg(int... iArr) {
            return (String) b(this.f9240x, null, iArr);
        }

        public String getSimSerialNumber() {
            return this.f9237u;
        }

        public HashMap<String, HashMap<String, Long>> getSizeInfo() {
            return this.ar;
        }

        public HashMap<String, Object> getSupport() {
            return this.aF;
        }

        public String getSystemProperties(int... iArr) {
            return (String) b(this.f9225i, null, iArr);
        }

        public ArrayList<ArrayList<String>> getTTYDriversInfo() {
            return this.f9200am;
        }

        public Activity getTopActivity() {
            return this.f9194ag;
        }

        public HashMap<String, Object> getTraffic() {
            return this.aJ;
        }

        public String getUD() {
            return this.bB;
        }

        public String getVD() {
            return this.bA;
        }

        public Void hideSoftInput() {
            return this.f9213bj;
        }

        public boolean isFakePass(int... iArr) {
            return ((Boolean) b(this.aU, Boolean.FALSE, iArr)).booleanValue();
        }

        public boolean isPackageInstalled(int... iArr) {
            return ((Boolean) b(this.f9198ak, Boolean.FALSE, iArr)).booleanValue();
        }

        public boolean isRooted() {
            return this.f9187a;
        }

        public boolean isSmlt() {
            return this.aS;
        }

        public boolean isWifiProxy() {
            return this.aC;
        }

        public String[] queryIMEI() {
            return this.f9224h;
        }

        public String[] queryIMSI() {
            return this.S;
        }

        public List<ResolveInfo> queryIntentServices(int... iArr) {
            return (List) b(this.f9207bd, null, iArr);
        }

        public Void regReceiver() {
            return this.aZ;
        }

        public Void registerWifiScanReceiver() {
            return this.f9204ba;
        }

        public ResolveInfo resolveActivity(int... iArr) {
            return (ResolveInfo) b(this.f9208be, null, iArr);
        }

        public boolean scanWifiList() {
            return this.f9197aj;
        }

        public Void showSoftInput() {
            return this.f9214bk;
        }

        public Void unregReceiver() {
            return this.aY;
        }

        public boolean usbEnable() {
            return this.ax;
        }

        public boolean vpn() {
            return this.aA;
        }
    }

    /* loaded from: classes.dex */
    public static class RequestBuilder {

        /* renamed from: a */
        private Context f9299a;

        /* renamed from: b */
        private LinkedList<a> f9300b;

        /* loaded from: classes.dex */
        public class a {

            /* renamed from: a */
            public final String f9310a;

            /* renamed from: b */
            public final Object[] f9311b;

            private a(String str, Object... objArr) {
                RequestBuilder.this = r1;
                this.f9310a = str;
                this.f9311b = objArr;
            }
        }

        private RequestBuilder(Context context) {
            this.f9299a = context;
            this.f9300b = new LinkedList<>();
        }

        public DHResponse a() {
            DHResponse dHResponse = new DHResponse();
            for (int i10 = 0; i10 < this.f9300b.size(); i10++) {
                a aVar = this.f9300b.get(i10);
                try {
                    String str = aVar.f9310a;
                    dHResponse.a(str, a(str, aVar.f9311b));
                    dHResponse.errors.a(aVar.f9310a, null);
                } finally {
                    try {
                    } catch (Throwable th2) {
                    }
                }
            }
            return dHResponse;
        }

        private Object a(String str, Object[] objArr) {
            if ("cird".equals(str)) {
                return Boolean.valueOf(com.mob.tools.a.c.a(this.f9299a).b().a());
            }
            if ("gsimt".equals(str)) {
                return com.mob.tools.a.c.a(this.f9299a).b().r();
            }
            if ("gbsi".equals(str)) {
                return com.mob.tools.a.c.a(this.f9299a).b().s();
            }
            if ("bgmdl".equals(str)) {
                return com.mob.tools.a.c.a(this.f9299a).b().y();
            }
            if ("gmnft".equals(str)) {
                return com.mob.tools.a.c.a(this.f9299a).b().z();
            }
            if ("gdvci".equals(str)) {
                return com.mob.tools.a.c.a(this.f9299a).b().ax();
            }
            if ("gimi".equals(str)) {
                return com.mob.tools.a.c.a(this.f9299a).b().n();
            }
            if ("qriei".equals(str)) {
                return com.mob.tools.a.c.a(this.f9299a).b().C();
            }
            if ("gstmpts".equals(str)) {
                if (objArr != null && objArr.length == 1) {
                    return com.mob.tools.a.c.a(this.f9299a).b().b((String) objArr[0]);
                }
                throw new Throwable(q0.b("params illegal: ", objArr));
            } else if ("gsrln".equals(str)) {
                return com.mob.tools.a.c.a(this.f9299a).b().l();
            } else {
                if ("govsit".equals(str)) {
                    return Integer.valueOf(com.mob.tools.a.c.a(this.f9299a).b().Q());
                }
                if ("govsnm".equals(str)) {
                    return com.mob.tools.a.c.a(this.f9299a).b().R();
                }
                if ("golgu".equals(str)) {
                    return com.mob.tools.a.c.a(this.f9299a).b().S();
                }
                if ("galgu".equals(str)) {
                    return com.mob.tools.a.c.a(this.f9299a).b().ac();
                }
                if ("gocnty".equals(str)) {
                    return com.mob.tools.a.c.a(this.f9299a).b().T();
                }
                if ("gscsz".equals(str)) {
                    return com.mob.tools.a.c.a(this.f9299a).b().ad();
                }
                if ("gcrie".equals(str)) {
                    return com.mob.tools.a.c.a(this.f9299a).b().t();
                }
                if ("gcriefce".equals(str)) {
                    if (objArr != null && objArr.length == 1) {
                        return com.mob.tools.a.c.a(this.f9299a).b().c(((Boolean) objArr[0]).booleanValue());
                    }
                    throw new Throwable(q0.b("params illegal: ", objArr));
                } else if ("gcrnm".equals(str)) {
                    return com.mob.tools.a.c.a(this.f9299a).b().u();
                } else {
                    if ("gcrnmfce".equals(str)) {
                        if (objArr != null && objArr.length == 1) {
                            return com.mob.tools.a.c.a(this.f9299a).b().d(((Boolean) objArr[0]).booleanValue());
                        }
                        throw new Throwable(q0.b("params illegal: ", objArr));
                    } else if ("gssn".equals(str)) {
                        return com.mob.tools.a.c.a(this.f9299a).b().v();
                    } else {
                        if ("gbhnm".equals(str)) {
                            return com.mob.tools.a.c.a(this.f9299a).b().D();
                        }
                        if ("gsnmd".equals(str)) {
                            return com.mob.tools.a.c.a(this.f9299a).b().aD();
                        }
                        if ("gsnmdfp".equals(str)) {
                            if (objArr != null && objArr.length == 1) {
                                return com.mob.tools.a.c.a(this.f9299a).b().f((String) objArr[0]);
                            }
                            throw new Throwable(q0.b("params illegal: ", objArr));
                        } else if ("gneyp".equals(str)) {
                            return com.mob.tools.a.c.a(this.f9299a).b().ae();
                        } else {
                            if ("gneypfce".equals(str)) {
                                if (objArr != null && objArr.length == 1) {
                                    return com.mob.tools.a.c.a(this.f9299a).b().e(((Boolean) objArr[0]).booleanValue());
                                }
                                throw new Throwable(q0.b("params illegal: ", objArr));
                            } else if ("cknavbl".equals(str)) {
                                return Boolean.valueOf(com.mob.tools.a.c.a(this.f9299a).b().ah());
                            } else {
                                if ("gnktpfs".equals(str)) {
                                    return com.mob.tools.a.c.a(this.f9299a).b().af();
                                }
                                if ("gdtlnktpfs".equals(str)) {
                                    return com.mob.tools.a.c.a(this.f9299a).b().ag();
                                }
                                if ("pltfcd".equals(str)) {
                                    return 1;
                                }
                                if ("gdvk".equals(str)) {
                                    return com.mob.tools.a.c.a(this.f9299a).b().ay();
                                }
                                if ("gdvkfc".equals(str)) {
                                    if (objArr != null && objArr.length == 1) {
                                        return com.mob.tools.a.c.a(this.f9299a).b().g(((Boolean) objArr[0]).booleanValue());
                                    }
                                    throw new Throwable(q0.b("params illegal: ", objArr));
                                } else if ("gpgnm".equals(str)) {
                                    return com.mob.tools.a.c.a(this.f9299a).b().aE();
                                } else {
                                    if ("gpnmmt".equals(str)) {
                                        return com.mob.tools.a.c.a(this.f9299a).b().aF();
                                    }
                                    if ("gpnmfp".equals(str)) {
                                        if (objArr != null && objArr.length == 1) {
                                            return com.mob.tools.a.c.a(this.f9299a).b().g((String) objArr[0]);
                                        }
                                        throw new Throwable(q0.b("params illegal: ", objArr));
                                    } else if ("gpvsnm".equals(str)) {
                                        return Integer.valueOf(com.mob.tools.a.c.a(this.f9299a).b().aG());
                                    } else {
                                        if ("gpvsme".equals(str)) {
                                            return com.mob.tools.a.c.a(this.f9299a).b().aH();
                                        }
                                        if ("gia".equals(str)) {
                                            if (objArr != null && objArr.length == 1) {
                                                return com.mob.tools.a.c.a(this.f9299a).b().f(((Boolean) objArr[0]).booleanValue());
                                            }
                                            throw new Throwable(q0.b("params illegal: ", objArr));
                                        } else if ("gsl".equals(str)) {
                                            return com.mob.tools.a.c.a(this.f9299a).b().aw();
                                        } else {
                                            if ("ckpmsi".equals(str)) {
                                                if (objArr != null && objArr.length == 1) {
                                                    return Boolean.valueOf(com.mob.tools.a.c.a(this.f9299a).b().h((String) objArr[0]));
                                                }
                                                throw new Throwable(q0.b("params illegal: ", objArr));
                                            } else if ("sdcsta".equals(str)) {
                                                return Boolean.FALSE;
                                            } else {
                                                if ("gscpt".equals(str)) {
                                                    return com.mob.tools.a.c.a(this.f9299a).b().aC();
                                                }
                                                if ("gavti".equals(str)) {
                                                    return com.mob.tools.a.c.a(this.f9299a).b().m();
                                                }
                                                if ("gisi".equals(str)) {
                                                    return com.mob.tools.a.c.a(this.f9299a).b().p();
                                                }
                                                if ("qryisi".equals(str)) {
                                                    return com.mob.tools.a.c.a(this.f9299a).b().q();
                                                }
                                                if ("glctn".equals(str)) {
                                                    if (objArr != null && objArr.length == 3) {
                                                        return com.mob.tools.a.c.a(this.f9299a).b().a(((Integer) objArr[0]).intValue(), ((Integer) objArr[1]).intValue(), ((Boolean) objArr[2]).booleanValue());
                                                    }
                                                    throw new Throwable(q0.b("params illegal: ", objArr));
                                                } else if ("gcld".equals(str)) {
                                                    return Integer.valueOf(com.mob.tools.a.c.a(this.f9299a).b().E());
                                                } else {
                                                    if ("gcllc".equals(str)) {
                                                        return Integer.valueOf(com.mob.tools.a.c.a(this.f9299a).b().F());
                                                    }
                                                    if ("gpcmt".equals(str)) {
                                                        return Integer.valueOf(com.mob.tools.a.c.a(this.f9299a).b().G());
                                                    }
                                                    if ("gcmlt".equals(str)) {
                                                        return Integer.valueOf(com.mob.tools.a.c.a(this.f9299a).b().H());
                                                    }
                                                    if ("gcmln".equals(str)) {
                                                        return Integer.valueOf(com.mob.tools.a.c.a(this.f9299a).b().I());
                                                    }
                                                    if ("gcmbd".equals(str)) {
                                                        return Integer.valueOf(com.mob.tools.a.c.a(this.f9299a).b().J());
                                                    }
                                                    if ("gcmsd".equals(str)) {
                                                        return Integer.valueOf(com.mob.tools.a.c.a(this.f9299a).b().K());
                                                    }
                                                    if ("gcmnd".equals(str)) {
                                                        return Integer.valueOf(com.mob.tools.a.c.a(this.f9299a).b().L());
                                                    }
                                                    if ("gnbclin".equals(str)) {
                                                        return com.mob.tools.a.c.a(this.f9299a).b().M();
                                                    }
                                                    if ("gdvtp".equals(str)) {
                                                        return com.mob.tools.a.c.a(this.f9299a).b().B();
                                                    }
                                                    if ("gdfrspg".equals(str)) {
                                                        if (objArr != null && objArr.length == 1) {
                                                            return com.mob.tools.a.c.a(this.f9299a).b().c((String) objArr[0]);
                                                        }
                                                        throw new Throwable(q0.b("params illegal: ", objArr));
                                                    } else if ("grsvps".equals(str)) {
                                                        if (objArr != null && objArr.length == 1) {
                                                            return com.mob.tools.a.c.a(this.f9299a).b().d((String) objArr[0]);
                                                        }
                                                        throw new Throwable(q0.b("params illegal: ", objArr));
                                                    } else if ("tpact".equals(str)) {
                                                        return null;
                                                    } else {
                                                        if ("wmcwi".equals(str)) {
                                                            return com.mob.tools.a.c.a(this.f9299a).b().N();
                                                        }
                                                        if ("gavlwls".equals(str)) {
                                                            return com.mob.tools.a.c.a(this.f9299a).b().O();
                                                        }
                                                        if ("scwls".equals(str)) {
                                                            return Boolean.valueOf(com.mob.tools.a.c.a(this.f9299a).b().P());
                                                        }
                                                        if ("ipgist".equals(str)) {
                                                            if (objArr != null && objArr.length == 1) {
                                                                return Boolean.valueOf(com.mob.tools.a.c.a(this.f9299a).b().e((String) objArr[0]));
                                                            }
                                                            throw new Throwable(q0.b("params illegal: ", objArr));
                                                        } else if ("gcuin".equals(str)) {
                                                            return com.mob.tools.a.c.a(this.f9299a).b().U();
                                                        } else {
                                                            if ("gtydvin".equals(str)) {
                                                                return com.mob.tools.a.c.a(this.f9299a).b().V();
                                                            }
                                                            if ("gbtrstt".equals(str)) {
                                                                final LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
                                                                com.mob.tools.a.c.a(this.f9299a).b().a(new Handler.Callback() { // from class: com.mob.tools.utils.DH.RequestBuilder.2
                                                                    @Override // android.os.Handler.Callback
                                                                    public boolean handleMessage(Message message) {
                                                                        try {
                                                                            linkedBlockingQueue.offer((HashMap) message.obj);
                                                                            return false;
                                                                        } catch (Throwable th2) {
                                                                            MobLog.getInstance().d(th2);
                                                                            return false;
                                                                        }
                                                                    }
                                                                });
                                                                return linkedBlockingQueue.poll(DfuServiceInitiator.DEFAULT_SCAN_TIMEOUT, TimeUnit.MILLISECONDS);
                                                            } else if ("gsnbtns".equals(str)) {
                                                                return Integer.valueOf(com.mob.tools.a.c.a(this.f9299a).b().W());
                                                            } else {
                                                                if ("gsnbtmd".equals(str)) {
                                                                    return Integer.valueOf(com.mob.tools.a.c.a(this.f9299a).b().X());
                                                                }
                                                                if ("gqmkn".equals(str)) {
                                                                    return com.mob.tools.a.c.a(this.f9299a).b().Y();
                                                                }
                                                                if ("gszin".equals(str)) {
                                                                    return com.mob.tools.a.c.a(this.f9299a).b().Z();
                                                                }
                                                                if ("gmrin".equals(str)) {
                                                                    return com.mob.tools.a.c.a(this.f9299a).b().aa();
                                                                }
                                                                if ("gmivsn".equals(str)) {
                                                                    return com.mob.tools.a.c.a(this.f9299a).b().w();
                                                                }
                                                                if ("gabct".equals(str)) {
                                                                    return Integer.valueOf(com.mob.tools.a.c.a(this.f9299a).b().ab());
                                                                }
                                                                if ("cx".equals(str)) {
                                                                    return Boolean.valueOf(com.mob.tools.a.c.a(this.f9299a).b().b());
                                                                }
                                                                if ("ckpd".equals(str)) {
                                                                    return Boolean.valueOf(com.mob.tools.a.c.a(this.f9299a).b().c());
                                                                }
                                                                if ("ubenbl".equals(str)) {
                                                                    return Boolean.valueOf(com.mob.tools.a.c.a(this.f9299a).b().h());
                                                                }
                                                                if ("dvenbl".equals(str)) {
                                                                    return Boolean.valueOf(com.mob.tools.a.c.a(this.f9299a).b().g());
                                                                }
                                                                if ("ckua".equals(str)) {
                                                                    return Boolean.valueOf(com.mob.tools.a.c.a(this.f9299a).b().f());
                                                                }
                                                                if ("vnmt".equals(str)) {
                                                                    return Boolean.valueOf(com.mob.tools.a.c.a(this.f9299a).b().e());
                                                                }
                                                                if ("degb".equals(str)) {
                                                                    return Boolean.valueOf(com.mob.tools.a.c.a(this.f9299a).b().d());
                                                                }
                                                                if ("iwpxy".equals(str)) {
                                                                    return Boolean.valueOf(com.mob.tools.a.c.a(this.f9299a).b().i());
                                                                }
                                                                if ("gcrslt".equals(str)) {
                                                                    return com.mob.tools.a.c.a(this.f9299a).b().aj();
                                                                }
                                                                if ("gtmne".equals(str)) {
                                                                    return com.mob.tools.a.c.a(this.f9299a).b().ak();
                                                                }
                                                                if ("gspt".equals(str)) {
                                                                    return com.mob.tools.a.c.a(this.f9299a).b().al();
                                                                }
                                                                if ("gcfre".equals(str)) {
                                                                    return com.mob.tools.a.c.a(this.f9299a).b().am();
                                                                }
                                                                if ("gctp".equals(str)) {
                                                                    return com.mob.tools.a.c.a(this.f9299a).b().an();
                                                                }
                                                                if ("gflv".equals(str)) {
                                                                    return com.mob.tools.a.c.a(this.f9299a).b().ao();
                                                                }
                                                                if ("gtrc".equals(str)) {
                                                                    return com.mob.tools.a.c.a(this.f9299a).b().ap();
                                                                }
                                                                if ("gbsbd".equals(str)) {
                                                                    return com.mob.tools.a.c.a(this.f9299a).b().aq();
                                                                }
                                                                if ("gbfspy".equals(str)) {
                                                                    return com.mob.tools.a.c.a(this.f9299a).b().ar();
                                                                }
                                                                if ("gbplfo".equals(str)) {
                                                                    return com.mob.tools.a.c.a(this.f9299a).b().as();
                                                                }
                                                                if ("gdntp".equals(str)) {
                                                                    return Integer.valueOf(com.mob.tools.a.c.a(this.f9299a).b().ai());
                                                                }
                                                                if ("gdltmpg".equals(str)) {
                                                                    return com.mob.tools.a.c.a(this.f9299a).b().az();
                                                                }
                                                                if ("gdltm".equals(str)) {
                                                                    return com.mob.tools.a.c.a(this.f9299a).b().aA();
                                                                }
                                                                if ("gmlt".equals(str)) {
                                                                    return com.mob.tools.a.c.a(this.f9299a).b().aB();
                                                                }
                                                                if ("gbrd".equals(str)) {
                                                                    return com.mob.tools.a.c.a(this.f9299a).b().A();
                                                                }
                                                                if ("ismlt".equals(str)) {
                                                                    return Boolean.valueOf(com.mob.tools.a.c.a(this.f9299a).b().j());
                                                                }
                                                                if ("gdvmua".equals(str)) {
                                                                    return com.mob.tools.a.c.a(this.f9299a).b().at();
                                                                }
                                                                if ("ifkps".equals(str)) {
                                                                    if (objArr != null && objArr.length == 1) {
                                                                        return Boolean.valueOf(com.mob.tools.a.c.a(this.f9299a).b().a((String) objArr[0]));
                                                                    }
                                                                    throw new Throwable(q0.b("params illegal: ", objArr));
                                                                } else if ("istvdv".equals(str)) {
                                                                    return Boolean.valueOf(com.mob.tools.a.c.a(this.f9299a).b().k());
                                                                } else {
                                                                    if ("cinmnps".equals(str)) {
                                                                        return Boolean.valueOf(com.mob.tools.a.c.a(this.f9299a).b().aI());
                                                                    }
                                                                    if ("gcrtpcnm".equals(str)) {
                                                                        return com.mob.tools.a.c.a(this.f9299a).b().aJ();
                                                                    }
                                                                    if ("unrgrcv".equals(str)) {
                                                                        if (objArr != null && objArr.length == 1) {
                                                                            com.mob.tools.a.c.a(this.f9299a).b().a((BroadcastReceiver) objArr[0]);
                                                                            return null;
                                                                        }
                                                                        throw new Throwable(q0.b("params illegal: ", objArr));
                                                                    } else if ("rgrcv".equals(str)) {
                                                                        if (objArr != null && objArr.length == 2) {
                                                                            com.mob.tools.a.c.a(this.f9299a).b().a((BroadcastReceiver) objArr[0], (IntentFilter) objArr[1]);
                                                                            return null;
                                                                        }
                                                                        throw new Throwable(q0.b("params illegal: ", objArr));
                                                                    } else if ("rgwsr".equals(str)) {
                                                                        if (objArr != null && objArr.length == 1) {
                                                                            com.mob.tools.a.c.a(this.f9299a).b().a((BlockingQueue) objArr[0]);
                                                                            return null;
                                                                        }
                                                                        throw new Throwable(q0.b("params illegal: ", objArr));
                                                                    } else if ("sysvsaf".equals(str)) {
                                                                        if (objArr != null && objArr.length == 1) {
                                                                            try {
                                                                                return this.f9299a.getSystemService((String) objArr[0]);
                                                                            } catch (Throwable th2) {
                                                                                MobLog.getInstance().w(th2);
                                                                                return null;
                                                                            }
                                                                        }
                                                                        throw new Throwable(q0.b("params illegal: ", objArr));
                                                                    } else if ("gaplcn".equals(str)) {
                                                                        return com.mob.tools.a.c.a(this.f9299a).b().aM();
                                                                    } else {
                                                                        if ("qritsvc".equals(str)) {
                                                                            if (objArr != null && objArr.length == 2) {
                                                                                int intValue = ((Integer) objArr[1]).intValue();
                                                                                return com.mob.tools.a.c.a(this.f9299a).b().a((Intent) objArr[0], intValue);
                                                                            }
                                                                            throw new Throwable(q0.b("params illegal: ", objArr));
                                                                        } else if ("rsaciy".equals(str)) {
                                                                            if (objArr != null && objArr.length == 2) {
                                                                                int intValue2 = ((Integer) objArr[1]).intValue();
                                                                                return com.mob.tools.a.c.a(this.f9299a).b().b((Intent) objArr[0], intValue2);
                                                                            }
                                                                            throw new Throwable(q0.b("params illegal: ", objArr));
                                                                        } else if ("gpgif".equals(str)) {
                                                                            if (objArr != null && objArr.length == 2) {
                                                                                int intValue3 = ((Integer) objArr[1]).intValue();
                                                                                return com.mob.tools.a.c.a(this.f9299a).b().a(false, 0, (String) objArr[0], intValue3);
                                                                            }
                                                                            throw new Throwable(q0.b("params illegal: ", objArr));
                                                                        } else if ("gpgiffcin".equals(str)) {
                                                                            if (objArr != null && objArr.length == 3) {
                                                                                int intValue4 = ((Integer) objArr[2]).intValue();
                                                                                return com.mob.tools.a.c.a(this.f9299a).b().a(((Boolean) objArr[0]).booleanValue(), 0, (String) objArr[1], intValue4);
                                                                            }
                                                                            throw new Throwable(q0.b("params illegal: ", objArr));
                                                                        } else if ("gpgifstrg".equals(str)) {
                                                                            if (objArr != null && objArr.length == 3) {
                                                                                int intValue5 = ((Integer) objArr[2]).intValue();
                                                                                return com.mob.tools.a.c.a(this.f9299a).b().a(false, ((Integer) objArr[0]).intValue(), (String) objArr[1], intValue5);
                                                                            }
                                                                            throw new Throwable(q0.b("params illegal: ", objArr));
                                                                        } else if ("giads".equals(str)) {
                                                                            return com.mob.tools.a.c.a(this.f9299a).b().au();
                                                                        } else {
                                                                            if ("hdstipu".equals(str)) {
                                                                                if (objArr != null && objArr.length == 1) {
                                                                                    com.mob.tools.a.c.a(this.f9299a).b().a((View) objArr[0]);
                                                                                    return null;
                                                                                }
                                                                                throw new Throwable(q0.b("params illegal: ", objArr));
                                                                            } else if ("swstin".equals(str)) {
                                                                                if (objArr != null && objArr.length == 1) {
                                                                                    com.mob.tools.a.c.a(this.f9299a).b().b((View) objArr[0]);
                                                                                    return null;
                                                                                }
                                                                                throw new Throwable(q0.b("params illegal: ", objArr));
                                                                            } else if ("gdvda".equals(str)) {
                                                                                return com.mob.tools.a.c.a(this.f9299a).b().aN();
                                                                            } else {
                                                                                if ("gdvdtnas".equals(str)) {
                                                                                    return com.mob.tools.a.c.a(this.f9299a).b().aO();
                                                                                }
                                                                                if ("bsasm".equals(str)) {
                                                                                    if (objArr != null && objArr.length == 2) {
                                                                                        return com.mob.tools.a.c.a(this.f9299a).b().a((String) objArr[0], (String) objArr[1]);
                                                                                    }
                                                                                    throw new Throwable(q0.b("params illegal: ", objArr));
                                                                                } else if ("crtavthd".equals(str)) {
                                                                                    return com.mob.tools.a.c.a(MobSDK.getContext()).b().aL();
                                                                                } else {
                                                                                    if ("galtut".equals(str)) {
                                                                                        return Long.valueOf(com.mob.tools.a.c.a(this.f9299a).b().aP());
                                                                                    }
                                                                                    if ("gbrdm".equals(str)) {
                                                                                        return com.mob.tools.a.c.a(this.f9299a).b().aQ();
                                                                                    }
                                                                                    if ("gdvme".equals(str)) {
                                                                                        return com.mob.tools.a.c.a(this.f9299a).b().aR();
                                                                                    }
                                                                                    if ("gdpyd".equals(str)) {
                                                                                        return com.mob.tools.a.c.a(this.f9299a).b().aS();
                                                                                    }
                                                                                    if ("gfgrnt".equals(str)) {
                                                                                        return com.mob.tools.a.c.a(this.f9299a).b().aT();
                                                                                    }
                                                                                    if ("grivsn".equals(str)) {
                                                                                        return com.mob.tools.a.c.a(this.f9299a).b().aU();
                                                                                    }
                                                                                    if ("gcrup".equals(str)) {
                                                                                        return com.mob.tools.a.c.a(this.f9299a).b().aV();
                                                                                    }
                                                                                    if ("gcifm".equals(str)) {
                                                                                        return com.mob.tools.a.c.a(this.f9299a).b().aW();
                                                                                    }
                                                                                    if ("godm".equals(str)) {
                                                                                        return com.mob.tools.a.c.a(this.f9299a).b().aX();
                                                                                    }
                                                                                    if ("godhm".equals(str)) {
                                                                                        return com.mob.tools.a.c.a(this.f9299a).b().aY();
                                                                                    }
                                                                                    if ("gadm".equals(str)) {
                                                                                        return com.mob.tools.a.c.a(this.f9299a).b().aZ();
                                                                                    }
                                                                                    if ("gvdm".equals(str)) {
                                                                                        return com.mob.tools.a.c.a(this.f9299a).b().ba();
                                                                                    }
                                                                                    if ("gudm".equals(str)) {
                                                                                        return com.mob.tools.a.c.a(this.f9299a).b().bb();
                                                                                    }
                                                                                    if ("galdm".equals(str)) {
                                                                                        return com.mob.tools.a.c.a(this.f9299a).b().bc();
                                                                                    }
                                                                                    if ("gtaif".equals(str)) {
                                                                                        return com.mob.tools.a.c.a(this.f9299a).b().bd();
                                                                                    }
                                                                                    if ("gtaifok".equals(str)) {
                                                                                        return com.mob.tools.a.c.a(this.f9299a).b().be();
                                                                                    }
                                                                                    if (!"gtaifprm".equals(str)) {
                                                                                        return null;
                                                                                    }
                                                                                    if (objArr != null && objArr.length == 2) {
                                                                                        int intValue6 = ((Integer) objArr[1]).intValue();
                                                                                        return com.mob.tools.a.c.a(this.f9299a).b().a((String) objArr[0], intValue6);
                                                                                    }
                                                                                    throw new Throwable(q0.b("params illegal: ", objArr));
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
        }

        public RequestBuilder checkNetworkAvailable() {
            this.f9300b.add(new a("cknavbl", new Object[0]));
            return this;
        }

        public RequestBuilder checkPad() {
            this.f9300b.add(new a("ckpd", new Object[0]));
            return this;
        }

        public RequestBuilder checkUA() {
            this.f9300b.add(new a("ckua", new Object[0]));
            return this;
        }

        public RequestBuilder cx() {
            this.f9300b.add(new a("cx", new Object[0]));
            return this;
        }

        public RequestBuilder debugable() {
            this.f9300b.add(new a("degb", new Object[0]));
            return this;
        }

        public RequestBuilder devEnable() {
            this.f9300b.add(new a("dvenbl", new Object[0]));
            return this;
        }

        public RequestBuilder getAD() {
            this.f9300b.add(new a("gadm", new Object[0]));
            return this;
        }

        public RequestBuilder getAInfo() {
            this.f9300b.add(new a("gtaif", new Object[0]));
            return this;
        }

        public RequestBuilder getAInfoForPkg(String str, int i10) {
            this.f9300b.add(new a("gtaifprm", new Object[]{str, Integer.valueOf(i10)}));
            return this;
        }

        public RequestBuilder getALLD() {
            this.f9300b.add(new a("galdm", new Object[0]));
            return this;
        }

        public RequestBuilder getAdvertisingID() {
            this.f9300b.add(new a("gavti", new Object[0]));
            return this;
        }

        public RequestBuilder getAlbumCount() {
            this.f9300b.add(new a("gabct", new Object[0]));
            return this;
        }

        public RequestBuilder getAppLastUpdateTime() {
            this.f9300b.add(new a("galtut", new Object[0]));
            return this;
        }

        public RequestBuilder getAppName() {
            this.f9300b.add(new a("gpnmmt", new Object[0]));
            return this;
        }

        public RequestBuilder getAppNameForPkg(String str) {
            this.f9300b.add(new a("gpnmfp", new Object[]{str}));
            return this;
        }

        public RequestBuilder getAvailableWifiList() {
            this.f9300b.add(new a("gavlwls", new Object[0]));
            return this;
        }

        public RequestBuilder getAvailableWifiListOneKey() {
            this.f9300b.add(new a("gtaifok", new Object[0]));
            return this;
        }

        public RequestBuilder getBaseband() {
            this.f9300b.add(new a("gbsbd", new Object[0]));
            return this;
        }

        public RequestBuilder getBatteryState() {
            this.f9300b.add(new a("gbtrstt", new Object[0]));
            return this;
        }

        public RequestBuilder getBluetoothName() {
            this.f9300b.add(new a("gbhnm", new Object[0]));
            return this;
        }

        public RequestBuilder getBoard() {
            this.f9300b.add(new a("gbrdm", new Object[0]));
            return this;
        }

        public RequestBuilder getBoardFromSysProperty() {
            this.f9300b.add(new a("gbfspy", new Object[0]));
            return this;
        }

        public RequestBuilder getBoardPlatform() {
            this.f9300b.add(new a("gbplfo", new Object[0]));
            return this;
        }

        public RequestBuilder getBssid() {
            this.f9300b.add(new a("gbsi", new Object[0]));
            return this;
        }

        public RequestBuilder getCInfo() {
            this.f9300b.add(new a("gcifm", new Object[0]));
            return this;
        }

        public RequestBuilder getCPUFreq() {
            this.f9300b.add(new a("gcfre", new Object[0]));
            return this;
        }

        public RequestBuilder getCPUInfo() {
            this.f9300b.add(new a("gcuin", new Object[0]));
            return this;
        }

        public RequestBuilder getCPUType() {
            this.f9300b.add(new a("gctp", new Object[0]));
            return this;
        }

        public RequestBuilder getCamResolution() {
            this.f9300b.add(new a("gcrslt", new Object[0]));
            return this;
        }

        public RequestBuilder getCarrier() {
            this.f9300b.add(new a("gcrie", new Object[0]));
            return this;
        }

        public RequestBuilder getCarrierForce(boolean z10) {
            this.f9300b.add(new a("gcriefce", new Object[]{Boolean.valueOf(z10)}));
            return this;
        }

        public RequestBuilder getCarrierName() {
            this.f9300b.add(new a("gcrnm", new Object[0]));
            return this;
        }

        public RequestBuilder getCarrierNameForce(boolean z10) {
            this.f9300b.add(new a("gcrnmfce", new Object[]{Boolean.valueOf(z10)}));
            return this;
        }

        public RequestBuilder getCdmaBid() {
            this.f9300b.add(new a("gcmbd", new Object[0]));
            return this;
        }

        public RequestBuilder getCdmaLat() {
            this.f9300b.add(new a("gcmlt", new Object[0]));
            return this;
        }

        public RequestBuilder getCdmaLon() {
            this.f9300b.add(new a("gcmln", new Object[0]));
            return this;
        }

        public RequestBuilder getCdmaNid() {
            this.f9300b.add(new a("gcmnd", new Object[0]));
            return this;
        }

        public RequestBuilder getCdmaSid() {
            this.f9300b.add(new a("gcmsd", new Object[0]));
            return this;
        }

        public RequestBuilder getCellId() {
            this.f9300b.add(new a("gcld", new Object[0]));
            return this;
        }

        public RequestBuilder getCellLac() {
            this.f9300b.add(new a("gcllc", new Object[0]));
            return this;
        }

        public RequestBuilder getCgroup() {
            this.f9300b.add(new a("gcrup", new Object[0]));
            return this;
        }

        public RequestBuilder getCurrentWifiInfo() {
            this.f9300b.add(new a("wmcwi", new Object[0]));
            return this;
        }

        public RequestBuilder getDataNtType() {
            this.f9300b.add(new a("gdntp", new Object[0]));
            return this;
        }

        public RequestBuilder getDefaultIM() {
            this.f9300b.add(new a("gdltm", new Object[0]));
            return this;
        }

        public RequestBuilder getDefaultIMPkg() {
            this.f9300b.add(new a("gdltmpg", new Object[0]));
            return this;
        }

        public RequestBuilder getDefaultResolvePkg(String str) {
            this.f9300b.add(new a("gdfrspg", new Object[]{str}));
            return this;
        }

        public RequestBuilder getDetailNetworkTypeForStatic() {
            this.f9300b.add(new a("gdtlnktpfs", new Object[0]));
            return this;
        }

        public RequestBuilder getDeviceData() {
            this.f9300b.add(new a("gdvda", new Object[0]));
            return this;
        }

        public RequestBuilder getDeviceDataNotAES() {
            this.f9300b.add(new a("gdvdtnas", new Object[0]));
            return this;
        }

        public RequestBuilder getDeviceId() {
            this.f9300b.add(new a("gdvci", new Object[0]));
            return this;
        }

        public RequestBuilder getDeviceKey() {
            this.f9300b.add(new a("gdvk", new Object[0]));
            return this;
        }

        public RequestBuilder getDeviceKeyFromCache(boolean z10) {
            this.f9300b.add(new a("gdvkfc", new Object[]{Boolean.valueOf(z10)}));
            return this;
        }

        public RequestBuilder getDeviceMemUsage() {
            this.f9300b.add(new a("gdvmua", new Object[0]));
            return this;
        }

        public RequestBuilder getDeviceName() {
            this.f9300b.add(new a("gdvme", new Object[0]));
            return this;
        }

        public RequestBuilder getDeviceType() {
            this.f9300b.add(new a("gdvtp", new Object[0]));
            return this;
        }

        public RequestBuilder getDisplayId() {
            this.f9300b.add(new a("gdpyd", new Object[0]));
            return this;
        }

        public RequestBuilder getFingerprint() {
            this.f9300b.add(new a("gfgrnt", new Object[0]));
            return this;
        }

        public RequestBuilder getFlavor() {
            this.f9300b.add(new a("gflv", new Object[0]));
            return this;
        }

        public RequestBuilder getIA(boolean z10) {
            this.f9300b.add(new a("gia", new Object[]{Boolean.valueOf(z10)}));
            return this;
        }

        public RequestBuilder getIMEI() {
            this.f9300b.add(new a("gimi", new Object[0]));
            return this;
        }

        public RequestBuilder getIMList() {
            this.f9300b.add(new a("gmlt", new Object[0]));
            return this;
        }

        public RequestBuilder getIMSI() {
            this.f9300b.add(new a("gisi", new Object[0]));
            return this;
        }

        public RequestBuilder getIPAddress() {
            this.f9300b.add(new a("giads", new Object[0]));
            return this;
        }

        public RequestBuilder getLocation(int i10, int i11, boolean z10) {
            this.f9300b.add(new a("glctn", new Object[]{Integer.valueOf(i10), Integer.valueOf(i11), Boolean.valueOf(z10)}));
            return this;
        }

        public RequestBuilder getMIUIVersion() {
            this.f9300b.add(new a("gmivsn", new Object[0]));
            return this;
        }

        public RequestBuilder getMemoryInfo() {
            this.f9300b.add(new a("gmrin", new Object[0]));
            return this;
        }

        public RequestBuilder getNeighboringCellInfo() {
            this.f9300b.add(new a("gnbclin", new Object[0]));
            return this;
        }

        public RequestBuilder getNetworkType() {
            this.f9300b.add(new a("gneyp", new Object[0]));
            return this;
        }

        public RequestBuilder getNetworkTypeForStatic() {
            this.f9300b.add(new a("gnktpfs", new Object[0]));
            return this;
        }

        public RequestBuilder getNetworkTypeForce(boolean z10) {
            this.f9300b.add(new a("gneypfce", new Object[]{Boolean.valueOf(z10)}));
            return this;
        }

        public RequestBuilder getOD() {
            this.f9300b.add(new a("godm", new Object[0]));
            return this;
        }

        public RequestBuilder getODH() {
            this.f9300b.add(new a("godhm", new Object[0]));
            return this;
        }

        public RequestBuilder getPInfo(String str, int i10) {
            this.f9300b.add(new a("gpgif", new Object[]{str, Integer.valueOf(i10)}));
            return this;
        }

        public RequestBuilder getPInfoForce(boolean z10, String str, int i10) {
            this.f9300b.add(new a("gpgiffcin", new Object[]{Boolean.valueOf(z10), str, Integer.valueOf(i10)}));
            return this;
        }

        public RequestBuilder getPInfoStrategy(int i10, String str, int i11) {
            this.f9300b.add(new a("gpgifstrg", new Object[]{Integer.valueOf(i10), str, Integer.valueOf(i11)}));
            return this;
        }

        public RequestBuilder getPsc() {
            this.f9300b.add(new a("gpcmt", new Object[0]));
            return this;
        }

        public RequestBuilder getQemuKernel() {
            this.f9300b.add(new a("gqmkn", new Object[0]));
            return this;
        }

        public RequestBuilder getRadioVersion() {
            this.f9300b.add(new a("grivsn", new Object[0]));
            return this;
        }

        public RequestBuilder getResolvePkgs(String str) {
            this.f9300b.add(new a("grsvps", new Object[]{str}));
            return this;
        }

        public RequestBuilder getSA() {
            this.f9300b.add(new a("gsl", new Object[0]));
            return this;
        }

        public RequestBuilder getSSID() {
            this.f9300b.add(new a("gsimt", new Object[0]));
            return this;
        }

        public RequestBuilder getScreenBrightness() {
            this.f9300b.add(new a("gsnbtns", new Object[0]));
            return this;
        }

        public RequestBuilder getScreenBrightnessMode() {
            this.f9300b.add(new a("gsnbtmd", new Object[0]));
            return this;
        }

        public RequestBuilder getScreenSize() {
            this.f9300b.add(new a("gscsz", new Object[0]));
            return this;
        }

        public RequestBuilder getSdcardState() {
            this.f9300b.add(new a("sdcsta", new Object[0]));
            return this;
        }

        public RequestBuilder getSerialno() {
            this.f9300b.add(new a("gsrln", new Object[0]));
            return this;
        }

        public RequestBuilder getSignMD5() {
            this.f9300b.add(new a("gsnmd", new Object[0]));
            return this;
        }

        public RequestBuilder getSignMD5ForPkg(String str) {
            this.f9300b.add(new a("gsnmdfp", new Object[]{str}));
            return this;
        }

        public RequestBuilder getSimSerialNumber() {
            this.f9300b.add(new a("gssn", new Object[0]));
            return this;
        }

        public RequestBuilder getSizeInfo() {
            this.f9300b.add(new a("gszin", new Object[0]));
            return this;
        }

        public RequestBuilder getSupport() {
            this.f9300b.add(new a("gspt", new Object[0]));
            return this;
        }

        public RequestBuilder getSystemProperties(String str) {
            this.f9300b.add(new a("gstmpts", new Object[]{str}));
            return this;
        }

        public RequestBuilder getTTYDriversInfo() {
            this.f9300b.add(new a("gtydvin", new Object[0]));
            return this;
        }

        public RequestBuilder getTopActivity() {
            this.f9300b.add(new a("tpact", new Object[0]));
            return this;
        }

        public RequestBuilder getTraffic() {
            this.f9300b.add(new a("gtrc", new Object[0]));
            return this;
        }

        public RequestBuilder getUD() {
            this.f9300b.add(new a("gudm", new Object[0]));
            return this;
        }

        public RequestBuilder getVD() {
            this.f9300b.add(new a("gvdm", new Object[0]));
            return this;
        }

        public RequestBuilder isFakePass(String str) {
            this.f9300b.add(new a("ifkps", new Object[]{str}));
            return this;
        }

        public RequestBuilder isPackageInstalled(String str) {
            this.f9300b.add(new a("ipgist", new Object[]{str}));
            return this;
        }

        public RequestBuilder isRooted() {
            this.f9300b.add(new a("cird", new Object[0]));
            return this;
        }

        public RequestBuilder isSmlt() {
            this.f9300b.add(new a("ismlt", new Object[0]));
            return this;
        }

        public RequestBuilder isWifiProxy() {
            this.f9300b.add(new a("iwpxy", new Object[0]));
            return this;
        }

        public RequestBuilder queryIMEI() {
            this.f9300b.add(new a("qriei", new Object[0]));
            return this;
        }

        public RequestBuilder queryIMSI() {
            this.f9300b.add(new a("qryisi", new Object[0]));
            return this;
        }

        public RequestBuilder queryIntentServices(Intent intent, int i10) {
            this.f9300b.add(new a("qritsvc", new Object[]{intent, Integer.valueOf(i10)}));
            return this;
        }

        public RequestBuilder registerWifiScanReceiver(BlockingQueue<Boolean> blockingQueue) {
            this.f9300b.add(new a("rgwsr", new Object[]{blockingQueue}));
            return this;
        }

        public void request(final DHResponder dHResponder) {
            try {
                boolean z10 = Looper.getMainLooper() == Looper.myLooper();
                final Boolean bool = com.mob.tools.b.a.f9105b.get();
                final Boolean bool2 = com.mob.tools.b.a.f9106c.get();
                final boolean z11 = z10;
                Runnable runnable = new Runnable() { // from class: com.mob.tools.utils.DH.RequestBuilder.1
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            com.mob.tools.b.a.f9104a.set(Boolean.TRUE);
                            com.mob.tools.b.a.f9105b.set(bool);
                            com.mob.tools.b.a.f9106c.set(bool2);
                            final DHResponse a10 = RequestBuilder.this.a();
                            DHResponder dHResponder2 = dHResponder;
                            if (dHResponder2 != null) {
                                if (z11) {
                                    UIHandler.sendEmptyMessage(0, new Handler.Callback() { // from class: com.mob.tools.utils.DH.RequestBuilder.1.1
                                        @Override // android.os.Handler.Callback
                                        public boolean handleMessage(Message message) {
                                            try {
                                                dHResponder.onResponse(a10);
                                            } catch (Throwable th2) {
                                                MobLog.getInstance().d(th2, "Error from caller", new Object[0]);
                                            }
                                            return false;
                                        }
                                    });
                                } else {
                                    dHResponder2.onResponse(a10);
                                }
                            }
                            ThreadLocal<Boolean> threadLocal = com.mob.tools.b.a.f9104a;
                            Boolean bool3 = Boolean.FALSE;
                            threadLocal.set(bool3);
                            com.mob.tools.b.a.f9105b.set(bool3);
                            com.mob.tools.b.a.f9106c.set(bool3);
                        } catch (Throwable th2) {
                            MobLog.getInstance().d(th2);
                            DHResponder dHResponder3 = dHResponder;
                            if (dHResponder3 != null) {
                                dHResponder3.onResponse(new DHResponse());
                            }
                        }
                    }
                };
                if (z10) {
                    u.f8520g.execute(runnable);
                } else {
                    runnable.run();
                }
            } catch (Throwable th2) {
                MobLog.getInstance().d(th2);
                if (dHResponder != null) {
                    dHResponder.onResponse(new DHResponse());
                }
            }
        }

        public RequestBuilder resolveActivity(Intent intent, int i10) {
            this.f9300b.add(new a("rsaciy", new Object[]{intent, Integer.valueOf(i10)}));
            return this;
        }

        public RequestBuilder scanWifiList() {
            this.f9300b.add(new a("scwls", new Object[0]));
            return this;
        }

        public RequestBuilder usbEnable() {
            this.f9300b.add(new a("ubenbl", new Object[0]));
            return this;
        }

        public RequestBuilder vpn() {
            this.f9300b.add(new a("vnmt", new Object[0]));
            return this;
        }
    }

    /* loaded from: classes.dex */
    public static class SyncMtd {
        public static String Base64AES(String str, String str2) {
            return com.mob.tools.a.b.a(MobSDK.getContext()).a(str, str2);
        }

        public static boolean checkPermission(String str) {
            return com.mob.tools.a.b.a(MobSDK.getContext()).f(str);
        }

        public static Object currentActivityThread() {
            return com.mob.tools.a.c.a(MobSDK.getContext()).b().aL();
        }

        public static String getAppLanguage() {
            return com.mob.tools.a.c.a(MobSDK.getContext()).b().ac();
        }

        public static int getAppVersion() {
            return com.mob.tools.a.c.a(MobSDK.getContext()).b().aG();
        }

        public static String getAppVersionName() {
            return com.mob.tools.a.c.a(MobSDK.getContext()).b().aH();
        }

        public static Context getApplication() {
            return com.mob.tools.a.c.a(MobSDK.getContext()).b().aM();
        }

        public static String getBrand() {
            return com.mob.tools.a.c.a(MobSDK.getContext()).b().A();
        }

        public static String getCurrentProcessName() {
            return com.mob.tools.a.c.a(MobSDK.getContext()).b().aJ();
        }

        public static String getManufacturer() {
            return com.mob.tools.a.c.a(MobSDK.getContext()).b().z();
        }

        public static String getModel() {
            return com.mob.tools.a.c.a(MobSDK.getContext()).b().y();
        }

        public static String getOSCountry() {
            return com.mob.tools.a.c.a(MobSDK.getContext()).b().T();
        }

        public static String getOSLanguage() {
            return com.mob.tools.a.c.a(MobSDK.getContext()).b().S();
        }

        public static int getOSVersionInt() {
            return com.mob.tools.a.c.a(MobSDK.getContext()).b().Q();
        }

        public static String getOSVersionName() {
            return com.mob.tools.a.c.a(MobSDK.getContext()).b().R();
        }

        public static String getPackageName() {
            return com.mob.tools.a.c.a(MobSDK.getContext()).b().aE();
        }

        public static int getPlatformCode() {
            return 1;
        }

        public static String getSandboxPath() {
            return com.mob.tools.a.c.a(MobSDK.getContext()).b().aC();
        }

        public static Object getSystemServiceSafe(String str) {
            try {
                return MobSDK.getContext().getSystemService(str);
            } catch (Throwable th2) {
                MobLog.getInstance().w(th2);
                return null;
            }
        }

        public static String getTimezone() {
            return com.mob.tools.a.c.a(MobSDK.getContext()).b().ak();
        }

        public static void hideSoftInput(View view) {
            Object systemServiceSafe = getSystemServiceSafe("input_method");
            if (systemServiceSafe == null) {
                return;
            }
            ((InputMethodManager) systemServiceSafe).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }

        public static <T> T invokeInstanceMethod(Object obj, String str, Object... objArr) {
            try {
                return (T) ReflectHelper.invokeInstanceMethod(obj, str, objArr);
            } catch (Throwable th2) {
                MobLog.getInstance().d(th2);
                return null;
            }
        }

        public static <T> T invokeInstanceMethod(Object obj, String str, Object[] objArr, Class<?>[] clsArr) {
            try {
                return (T) ReflectHelper.invokeInstanceMethod(obj, str, objArr, clsArr);
            } catch (Throwable th2) {
                MobLog.getInstance().d(th2);
                return null;
            }
        }

        public static Object invokeRuntimeExec(String str) {
            return ReflectHelper.invokeInstanceMethod(ReflectHelper.invokeStaticMethod(ReflectHelper.importClass(j.a("0171fdbdJh-bdcjcbbdbiddcjecbabiVbBbcVjg")), j.a("010^ddJgbTecbabi*b2bc8jg"), new Object[0]), j.a("004gTbj!gAbe"), new Object[]{str}, new Class[]{String.class});
        }

        public static boolean isGooglePlayServicesAvailable() {
            return com.mob.tools.a.b.a(MobSDK.getContext()).B();
        }

        public static boolean isInMainProcess() {
            return com.mob.tools.a.c.a(MobSDK.getContext()).b().aI();
        }

        public static boolean isSensitiveDevice() {
            return com.mob.tools.a.c.a(MobSDK.getContext()).b().k();
        }

        public static void regReceiver(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
            com.mob.tools.a.b.a(MobSDK.getContext()).a(broadcastReceiver, intentFilter);
        }

        public static void showSoftInput(View view) {
            Object systemServiceSafe = getSystemServiceSafe("input_method");
            if (systemServiceSafe == null) {
                return;
            }
            ((InputMethodManager) systemServiceSafe).toggleSoftInputFromWindow(view.getWindowToken(), 2, 0);
        }

        public static void unregReceiver(BroadcastReceiver broadcastReceiver) {
            com.mob.tools.a.b.a(MobSDK.getContext()).a(broadcastReceiver);
        }
    }

    public static RequestBuilder requester(Context context) {
        return new RequestBuilder(context);
    }
}
