package d6;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class e0 {

    /* renamed from: a */
    public static final e0 f12668a;

    /* renamed from: b */
    public static final String f12669b;

    /* renamed from: c */
    public static final ArrayList f12670c;

    /* renamed from: d */
    public static final HashMap f12671d;

    /* renamed from: e */
    public static final AtomicBoolean f12672e;

    /* renamed from: f */
    public static final Integer[] f12673f;

    /* loaded from: classes.dex */
    public static final class a extends e {
        @Override // d6.e0.e
        public final /* bridge */ /* synthetic */ String b() {
            return null;
        }

        @Override // d6.e0.e
        public final String c() {
            return "com.facebook.arstudio.player";
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends e {
        @Override // d6.e0.e
        public final String b() {
            return "com.instagram.platform.AppAuthorizeActivity";
        }

        @Override // d6.e0.e
        public final String c() {
            return "com.instagram.android";
        }

        @Override // d6.e0.e
        public final String d() {
            return "token,signed_request,graph_domain,granted_scopes";
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends e {
        @Override // d6.e0.e
        public final String b() {
            return "com.facebook.katana.ProxyAuth";
        }

        @Override // d6.e0.e
        public final String c() {
            return "com.facebook.katana";
        }

        @Override // d6.e0.e
        public final void e() {
            boolean z10;
            if (o5.v.a().getApplicationInfo().targetSdkVersion >= 30) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                String str = null;
                if (!i6.a.b(e0.class)) {
                    try {
                        str = e0.f12669b;
                    } catch (Throwable th2) {
                        i6.a.a(e0.class, th2);
                    }
                }
                Log.w(str, "Apps that target Android API 30+ (Android 11+) cannot call Facebook native apps unless the package visibility needs are declared. Please follow https://developers.facebook.com/docs/android/troubleshooting/#faq_267321845055988 to make the declaration.");
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends e {
        @Override // d6.e0.e
        public final /* bridge */ /* synthetic */ String b() {
            return null;
        }

        @Override // d6.e0.e
        public final String c() {
            return "com.facebook.orca";
        }
    }

    /* loaded from: classes.dex */
    public static abstract class e {

        /* renamed from: a */
        public TreeSet<Integer> f12674a;

        /* JADX WARN: Code restructure failed: missing block: B:47:0x001a, code lost:
            if (gm.l.a(r4, java.lang.Boolean.FALSE) == false) goto L4;
         */
        /* JADX WARN: Removed duplicated region for block: B:64:0x0042 A[Catch: all -> 0x0047, TRY_LEAVE, TryCatch #2 {, blocks: (B:41:0x0004, B:46:0x0014, B:56:0x0032, B:58:0x0036, B:64:0x0042, B:45:0x000c, B:48:0x001c, B:55:0x0030, B:51:0x0027), top: B:70:0x0004 }] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final synchronized void a(boolean r4) {
            /*
                r3 = this;
                monitor-enter(r3)
                r0 = 0
                if (r4 != 0) goto L1c
                java.util.TreeSet<java.lang.Integer> r4 = r3.f12674a     // Catch: java.lang.Throwable -> L47
                if (r4 == 0) goto L1c
                if (r4 != 0) goto Lc
                r4 = r0
                goto L14
            Lc:
                boolean r4 = r4.isEmpty()     // Catch: java.lang.Throwable -> L47
                java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)     // Catch: java.lang.Throwable -> L47
            L14:
                java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L47
                boolean r4 = gm.l.a(r4, r1)     // Catch: java.lang.Throwable -> L47
                if (r4 != 0) goto L32
            L1c:
                d6.e0 r4 = d6.e0.f12668a     // Catch: java.lang.Throwable -> L47
                java.lang.Class<d6.e0> r1 = d6.e0.class
                boolean r2 = i6.a.b(r1)     // Catch: java.lang.Throwable -> L47
                if (r2 == 0) goto L27
                goto L30
            L27:
                java.util.TreeSet r0 = r4.g(r3)     // Catch: java.lang.Throwable -> L2c
                goto L30
            L2c:
                r4 = move-exception
                i6.a.a(r1, r4)     // Catch: java.lang.Throwable -> L47
            L30:
                r3.f12674a = r0     // Catch: java.lang.Throwable -> L47
            L32:
                java.util.TreeSet<java.lang.Integer> r4 = r3.f12674a     // Catch: java.lang.Throwable -> L47
                if (r4 == 0) goto L3f
                boolean r4 = r4.isEmpty()     // Catch: java.lang.Throwable -> L47
                if (r4 == 0) goto L3d
                goto L3f
            L3d:
                r4 = 0
                goto L40
            L3f:
                r4 = 1
            L40:
                if (r4 == 0) goto L45
                r3.e()     // Catch: java.lang.Throwable -> L47
            L45:
                monitor-exit(r3)
                return
            L47:
                r4 = move-exception
                monitor-exit(r3)
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: d6.e0.e.a(boolean):void");
        }

        public abstract String b();

        public abstract String c();

        public String d() {
            return "id_token,token,signed_request,graph_domain";
        }

        public void e() {
        }
    }

    /* loaded from: classes.dex */
    public static final class f {

        /* renamed from: a */
        public e f12675a;

        /* renamed from: b */
        public int f12676b;
    }

    /* loaded from: classes.dex */
    public static final class g extends e {
        @Override // d6.e0.e
        public final String b() {
            return "com.facebook.katana.ProxyAuth";
        }

        @Override // d6.e0.e
        public final String c() {
            return "com.facebook.wakizashi";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0045 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    static {
        /*
            Method dump skipped, instructions count: 383
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: d6.e0.<clinit>():void");
    }

    public static final int b(TreeSet<Integer> treeSet, int i10, int[] iArr) {
        if (i6.a.b(e0.class)) {
            return 0;
        }
        if (treeSet == null) {
            return -1;
        }
        try {
            int length = iArr.length - 1;
            Iterator<Integer> descendingIterator = treeSet.descendingIterator();
            int i11 = -1;
            while (descendingIterator.hasNext()) {
                Integer next = descendingIterator.next();
                gm.l.e(next, "fbAppVersion");
                i11 = Math.max(i11, next.intValue());
                while (length >= 0 && iArr[length] > next.intValue()) {
                    length--;
                }
                if (length < 0) {
                    return -1;
                }
                if (iArr[length] == next.intValue()) {
                    if (length % 2 == 0) {
                        return Math.min(i11, i10);
                    }
                    return -1;
                }
            }
            return -1;
        } catch (Throwable th2) {
            i6.a.a(e0.class, th2);
            return 0;
        }
    }

    public static final Bundle c(o5.p pVar) {
        if (i6.a.b(e0.class) || pVar == null) {
            return null;
        }
        try {
            Bundle bundle = new Bundle();
            bundle.putString("error_description", pVar.toString());
            if (pVar instanceof o5.r) {
                bundle.putString("error_type", "UserCanceled");
            }
            return bundle;
        } catch (Throwable th2) {
            i6.a.a(e0.class, th2);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x0065 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final android.content.Intent e(android.content.Context r6) {
        /*
            java.lang.Class<d6.e0> r0 = d6.e0.class
            boolean r1 = i6.a.b(r0)
            r2 = 0
            if (r1 == 0) goto La
            return r2
        La:
            java.lang.String r1 = "context"
            gm.l.f(r6, r1)     // Catch: java.lang.Throwable -> L67
            java.util.ArrayList r1 = d6.e0.f12670c     // Catch: java.lang.Throwable -> L67
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L67
        L15:
            boolean r3 = r1.hasNext()     // Catch: java.lang.Throwable -> L67
            if (r3 == 0) goto L66
            java.lang.Object r3 = r1.next()     // Catch: java.lang.Throwable -> L67
            d6.e0$e r3 = (d6.e0.e) r3     // Catch: java.lang.Throwable -> L67
            android.content.Intent r4 = new android.content.Intent     // Catch: java.lang.Throwable -> L67
            java.lang.String r5 = "com.facebook.platform.PLATFORM_SERVICE"
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L67
            java.lang.String r3 = r3.c()     // Catch: java.lang.Throwable -> L67
            android.content.Intent r3 = r4.setPackage(r3)     // Catch: java.lang.Throwable -> L67
            java.lang.String r4 = "android.intent.category.DEFAULT"
            android.content.Intent r3 = r3.addCategory(r4)     // Catch: java.lang.Throwable -> L67
            boolean r4 = i6.a.b(r0)     // Catch: java.lang.Throwable -> L67
            if (r4 == 0) goto L3d
            goto L62
        L3d:
            if (r3 != 0) goto L40
            goto L62
        L40:
            android.content.pm.PackageManager r4 = r6.getPackageManager()     // Catch: java.lang.Throwable -> L5e
            r5 = 0
            android.content.pm.ResolveInfo r4 = r4.resolveService(r3, r5)     // Catch: java.lang.Throwable -> L5e
            if (r4 != 0) goto L4c
            goto L62
        L4c:
            java.util.HashSet<java.lang.String> r5 = d6.q.f12726a     // Catch: java.lang.Throwable -> L5e
            android.content.pm.ServiceInfo r4 = r4.serviceInfo     // Catch: java.lang.Throwable -> L5e
            java.lang.String r4 = r4.packageName     // Catch: java.lang.Throwable -> L5e
            java.lang.String r5 = "resolveInfo.serviceInfo.packageName"
            gm.l.e(r4, r5)     // Catch: java.lang.Throwable -> L5e
            boolean r4 = d6.q.a(r6, r4)     // Catch: java.lang.Throwable -> L5e
            if (r4 != 0) goto L63
            goto L62
        L5e:
            r3 = move-exception
            i6.a.a(r0, r3)     // Catch: java.lang.Throwable -> L67
        L62:
            r3 = r2
        L63:
            if (r3 == 0) goto L15
            return r3
        L66:
            return r2
        L67:
            r6 = move-exception
            i6.a.a(r0, r6)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: d6.e0.e(android.content.Context):android.content.Intent");
    }

    public static final Intent f(Intent intent, Bundle bundle, o5.p pVar) {
        if (i6.a.b(e0.class)) {
            return null;
        }
        try {
            UUID i10 = i(intent);
            if (i10 == null) {
                return null;
            }
            Intent intent2 = new Intent();
            intent2.putExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", n(intent));
            Bundle bundle2 = new Bundle();
            bundle2.putString("action_id", i10.toString());
            if (pVar != null) {
                bundle2.putBundle("error", c(pVar));
            }
            intent2.putExtra("com.facebook.platform.protocol.BRIDGE_ARGS", bundle2);
            if (bundle != null) {
                intent2.putExtra("com.facebook.platform.protocol.RESULT_ARGS", bundle);
            }
            return intent2;
        } catch (Throwable th2) {
            i6.a.a(e0.class, th2);
            return null;
        }
    }

    public static final Bundle h(Intent intent) {
        if (i6.a.b(e0.class)) {
            return null;
        }
        try {
            gm.l.f(intent, "intent");
            if (o(n(intent))) {
                return intent.getBundleExtra("com.facebook.platform.protocol.BRIDGE_ARGS");
            }
            return null;
        } catch (Throwable th2) {
            i6.a.a(e0.class, th2);
            return null;
        }
    }

    public static final UUID i(Intent intent) {
        String stringExtra;
        if (i6.a.b(e0.class) || intent == null) {
            return null;
        }
        try {
            if (o(n(intent))) {
                Bundle bundleExtra = intent.getBundleExtra("com.facebook.platform.protocol.BRIDGE_ARGS");
                stringExtra = bundleExtra != null ? bundleExtra.getString("action_id") : null;
            } else {
                stringExtra = intent.getStringExtra("com.facebook.platform.protocol.CALL_ID");
            }
            if (stringExtra != null) {
                try {
                    return UUID.fromString(stringExtra);
                } catch (IllegalArgumentException unused) {
                    return null;
                }
            }
            return null;
        } catch (Throwable th2) {
            i6.a.a(e0.class, th2);
            return null;
        }
    }

    public static final o5.p j(Bundle bundle) {
        if (i6.a.b(e0.class) || bundle == null) {
            return null;
        }
        try {
            String string = bundle.getString("error_type");
            if (string == null) {
                string = bundle.getString("com.facebook.platform.status.ERROR_TYPE");
            }
            String string2 = bundle.getString("error_description");
            if (string2 == null) {
                string2 = bundle.getString("com.facebook.platform.status.ERROR_DESCRIPTION");
            }
            return (string == null || !om.h.V(string, "UserCanceled")) ? new o5.p(string2) : new o5.r(string2);
        } catch (Throwable th2) {
            i6.a.a(e0.class, th2);
            return null;
        }
    }

    public static final int l() {
        if (i6.a.b(e0.class)) {
            return 0;
        }
        try {
            return f12673f[0].intValue();
        } catch (Throwable th2) {
            i6.a.a(e0.class, th2);
            return 0;
        }
    }

    public static final Bundle m(Intent intent) {
        if (i6.a.b(e0.class)) {
            return null;
        }
        try {
            return !o(n(intent)) ? intent.getExtras() : intent.getBundleExtra("com.facebook.platform.protocol.METHOD_ARGS");
        } catch (Throwable th2) {
            i6.a.a(e0.class, th2);
            return null;
        }
    }

    public static final int n(Intent intent) {
        if (i6.a.b(e0.class)) {
            return 0;
        }
        try {
            gm.l.f(intent, "intent");
            return intent.getIntExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", 0);
        } catch (Throwable th2) {
            i6.a.a(e0.class, th2);
            return 0;
        }
    }

    public static final boolean o(int i10) {
        if (i6.a.b(e0.class)) {
            return false;
        }
        try {
            return ul.i.u(Integer.valueOf(i10), f12673f) && i10 >= 20140701;
        } catch (Throwable th2) {
            i6.a.a(e0.class, th2);
            return false;
        }
    }

    public static final void p(Intent intent, String str, String str2, int i10, Bundle bundle) {
        if (i6.a.b(e0.class)) {
            return;
        }
        try {
            String b10 = o5.v.b();
            n0.g();
            String str3 = o5.v.f22841e;
            intent.putExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", i10).putExtra("com.facebook.platform.protocol.PROTOCOL_ACTION", str2).putExtra("com.facebook.platform.extra.APPLICATION_ID", b10);
            if (o(i10)) {
                Bundle bundle2 = new Bundle();
                bundle2.putString("action_id", str);
                m0.I(bundle2, "app_name", str3);
                intent.putExtra("com.facebook.platform.protocol.BRIDGE_ARGS", bundle2);
                if (bundle == null) {
                    bundle = new Bundle();
                }
                intent.putExtra("com.facebook.platform.protocol.METHOD_ARGS", bundle);
                return;
            }
            intent.putExtra("com.facebook.platform.protocol.CALL_ID", str);
            if (!m0.A(str3)) {
                intent.putExtra("com.facebook.platform.extra.APPLICATION_NAME", str3);
            }
            if (bundle != null) {
                intent.putExtras(bundle);
            }
        } catch (Throwable th2) {
            i6.a.a(e0.class, th2);
        }
    }

    public static final void q() {
        if (i6.a.b(e0.class)) {
            return;
        }
        try {
            if (f12672e.compareAndSet(false, true)) {
                o5.v.c().execute(new s.n(2));
            }
        } catch (Throwable th2) {
            i6.a.a(e0.class, th2);
        }
    }

    public static final Intent r(Context context, Intent intent) {
        if (i6.a.b(e0.class) || intent == null) {
            return null;
        }
        try {
            ResolveInfo resolveActivity = context.getPackageManager().resolveActivity(intent, 0);
            if (resolveActivity == null) {
                return null;
            }
            HashSet<String> hashSet = q.f12726a;
            String str = resolveActivity.activityInfo.packageName;
            gm.l.e(str, "resolveInfo.activityInfo.packageName");
            if (q.a(context, str)) {
                return intent;
            }
            return null;
        } catch (Throwable th2) {
            i6.a.a(e0.class, th2);
            return null;
        }
    }

    public final ArrayList a() {
        if (i6.a.b(this)) {
            return null;
        }
        try {
            return h7.a.f(new c(), new g());
        } catch (Throwable th2) {
            i6.a.a(this, th2);
            return null;
        }
    }

    public final Intent d(e eVar, String str, Set set, String str2, boolean z10, n6.d dVar, String str3, String str4, boolean z11, String str5, boolean z12, n6.y yVar, boolean z13, boolean z14, String str6) {
        if (i6.a.b(this)) {
            return null;
        }
        try {
            String b10 = eVar.b();
            if (b10 == null) {
                return null;
            }
            Intent putExtra = new Intent().setClassName(eVar.c(), b10).putExtra("client_id", str);
            gm.l.e(putExtra, "Intent()\n            .setClassName(appInfo.getPackage(), activityName)\n            .putExtra(FACEBOOK_PROXY_AUTH_APP_ID_KEY, applicationId)");
            o5.v vVar = o5.v.f22837a;
            putExtra.putExtra("facebook_sdk_version", "14.1.0");
            m0 m0Var = m0.f12709a;
            if (!(set.isEmpty())) {
                putExtra.putExtra("scope", TextUtils.join(",", set));
            }
            if (!m0.A(str2)) {
                putExtra.putExtra("e2e", str2);
            }
            putExtra.putExtra("state", str3);
            putExtra.putExtra("response_type", eVar.d());
            putExtra.putExtra("nonce", str6);
            putExtra.putExtra("return_scopes", "true");
            if (z10) {
                putExtra.putExtra("default_audience", dVar.f22072a);
            }
            putExtra.putExtra("legacy_override", o5.v.d());
            putExtra.putExtra("auth_type", str4);
            if (z11) {
                putExtra.putExtra("fail_on_logged_out", true);
            }
            putExtra.putExtra("messenger_page_id", str5);
            putExtra.putExtra("reset_messenger_state", z12);
            if (z13) {
                putExtra.putExtra("fx_app", yVar.f22190a);
            }
            if (z14) {
                putExtra.putExtra("skip_dedupe", true);
            }
            return putExtra;
        } catch (Throwable th2) {
            i6.a.a(this, th2);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x00a6 A[Catch: all -> 0x00b3, TRY_ENTER, TryCatch #1 {all -> 0x00b3, blocks: (B:65:0x000c, B:107:0x00b2, B:106:0x00af, B:100:0x00a6, B:68:0x0025), top: B:111:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0087 A[EXC_TOP_SPLITTER, LOOP:0: B:113:0x0087->B:93:0x008d, LOOP_START, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.TreeSet<java.lang.Integer> g(d6.e0.e r13) {
        /*
            r12 = this;
            java.lang.String r0 = "version"
            java.lang.String r1 = "Failed to query content resolver."
            boolean r2 = i6.a.b(r12)
            r3 = 0
            if (r2 == 0) goto Lc
            return r3
        Lc:
            java.util.TreeSet r2 = new java.util.TreeSet     // Catch: java.lang.Throwable -> Lb3
            r2.<init>()     // Catch: java.lang.Throwable -> Lb3
            android.content.Context r4 = o5.v.a()     // Catch: java.lang.Throwable -> Lb3
            android.content.ContentResolver r5 = r4.getContentResolver()     // Catch: java.lang.Throwable -> Lb3
            java.lang.String[] r7 = new java.lang.String[]{r0}     // Catch: java.lang.Throwable -> Lb3
            boolean r4 = i6.a.b(r12)     // Catch: java.lang.Throwable -> Lb3
            if (r4 == 0) goto L25
        L23:
            r6 = r3
            goto L4f
        L25:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4a
            r4.<init>()     // Catch: java.lang.Throwable -> L4a
            java.lang.String r6 = "content://"
            r4.append(r6)     // Catch: java.lang.Throwable -> L4a
            java.lang.String r6 = r13.c()     // Catch: java.lang.Throwable -> L4a
            r4.append(r6)     // Catch: java.lang.Throwable -> L4a
            java.lang.String r6 = ".provider.PlatformProvider/versions"
            r4.append(r6)     // Catch: java.lang.Throwable -> L4a
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L4a
            android.net.Uri r4 = android.net.Uri.parse(r4)     // Catch: java.lang.Throwable -> L4a
            java.lang.String r6 = "parse(CONTENT_SCHEME + appInfo.getPackage() + PLATFORM_PROVIDER_VERSIONS)"
            gm.l.e(r4, r6)     // Catch: java.lang.Throwable -> L4a
            r6 = r4
            goto L4f
        L4a:
            r4 = move-exception
            i6.a.a(r12, r4)     // Catch: java.lang.Throwable -> Lb3
            goto L23
        L4f:
            android.content.Context r4 = o5.v.a()     // Catch: java.lang.Throwable -> Laa
            android.content.pm.PackageManager r4 = r4.getPackageManager()     // Catch: java.lang.Throwable -> Laa
            java.lang.String r13 = r13.c()     // Catch: java.lang.Throwable -> Laa
            java.lang.String r8 = ".provider.PlatformProvider"
            java.lang.String r13 = gm.l.k(r8, r13)     // Catch: java.lang.Throwable -> Laa
            r8 = 0
            android.content.pm.ProviderInfo r13 = r4.resolveContentProvider(r13, r8)     // Catch: java.lang.RuntimeException -> L67 java.lang.Throwable -> Laa
            goto L6e
        L67:
            r13 = move-exception
            java.lang.String r4 = d6.e0.f12669b     // Catch: java.lang.Throwable -> Laa
            android.util.Log.e(r4, r1, r13)     // Catch: java.lang.Throwable -> Laa
            r13 = r3
        L6e:
            if (r13 == 0) goto La2
            r8 = 0
            r9 = 0
            r10 = 0
            android.database.Cursor r13 = r5.query(r6, r7, r8, r9, r10)     // Catch: java.lang.IllegalArgumentException -> L78 java.lang.SecurityException -> L7b java.lang.NullPointerException -> L81 java.lang.Throwable -> Laa
            goto L85
        L78:
            java.lang.String r13 = d6.e0.f12669b     // Catch: java.lang.Throwable -> Laa
            goto L7d
        L7b:
            java.lang.String r13 = d6.e0.f12669b     // Catch: java.lang.Throwable -> Laa
        L7d:
            android.util.Log.e(r13, r1)     // Catch: java.lang.Throwable -> Laa
            goto L84
        L81:
            java.lang.String r13 = d6.e0.f12669b     // Catch: java.lang.Throwable -> Laa
            goto L7d
        L84:
            r13 = r3
        L85:
            if (r13 == 0) goto La3
        L87:
            boolean r1 = r13.moveToNext()     // Catch: java.lang.Throwable -> L9d
            if (r1 == 0) goto La3
            int r1 = r13.getColumnIndex(r0)     // Catch: java.lang.Throwable -> L9d
            int r1 = r13.getInt(r1)     // Catch: java.lang.Throwable -> L9d
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L9d
            r2.add(r1)     // Catch: java.lang.Throwable -> L9d
            goto L87
        L9d:
            r0 = move-exception
            r11 = r0
            r0 = r13
            r13 = r11
            goto Lac
        La2:
            r13 = r3
        La3:
            if (r13 != 0) goto La6
            goto La9
        La6:
            r13.close()     // Catch: java.lang.Throwable -> Lb3
        La9:
            return r2
        Laa:
            r13 = move-exception
            r0 = r3
        Lac:
            if (r0 != 0) goto Laf
            goto Lb2
        Laf:
            r0.close()     // Catch: java.lang.Throwable -> Lb3
        Lb2:
            throw r13     // Catch: java.lang.Throwable -> Lb3
        Lb3:
            r13 = move-exception
            i6.a.a(r12, r13)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: d6.e0.g(d6.e0$e):java.util.TreeSet");
    }

    public final f k(List<? extends e> list, int[] iArr) {
        if (i6.a.b(this)) {
            return null;
        }
        try {
            q();
            if (list == null) {
                f fVar = new f();
                fVar.f12676b = -1;
                return fVar;
            }
            for (e eVar : list) {
                TreeSet<Integer> treeSet = eVar.f12674a;
                if (treeSet == null || !gm.l.a(Boolean.valueOf(treeSet.isEmpty()), Boolean.FALSE)) {
                    eVar.a(false);
                }
                int b10 = b(eVar.f12674a, l(), iArr);
                if (b10 != -1) {
                    f fVar2 = new f();
                    fVar2.f12675a = eVar;
                    fVar2.f12676b = b10;
                    return fVar2;
                }
            }
            f fVar3 = new f();
            fVar3.f12676b = -1;
            return fVar3;
        } catch (Throwable th2) {
            i6.a.a(this, th2);
            return null;
        }
    }
}
