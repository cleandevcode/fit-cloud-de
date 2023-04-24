package d6;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.net.http.SslError;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.IBinder;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.SslErrorHandler;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import cn.sharesdk.framework.InnerShareParams;
import com.facebook.common.R;
import d6.r0;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CountDownLatch;
import java.util.regex.Pattern;
import o5.a;
import o5.y;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class r0 extends Dialog {

    /* renamed from: m */
    public static final int f12731m = R.style.com_facebook_activity_theme;

    /* renamed from: n */
    public static volatile int f12732n;

    /* renamed from: a */
    public String f12733a;

    /* renamed from: b */
    public String f12734b;

    /* renamed from: c */
    public c f12735c;

    /* renamed from: d */
    public f f12736d;

    /* renamed from: e */
    public ProgressDialog f12737e;

    /* renamed from: f */
    public ImageView f12738f;

    /* renamed from: g */
    public FrameLayout f12739g;

    /* renamed from: h */
    public d f12740h;

    /* renamed from: i */
    public boolean f12741i;

    /* renamed from: j */
    public boolean f12742j;

    /* renamed from: k */
    public boolean f12743k;

    /* renamed from: l */
    public WindowManager.LayoutParams f12744l;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        public Context f12745a;

        /* renamed from: b */
        public String f12746b;

        /* renamed from: c */
        public c f12747c;

        /* renamed from: d */
        public Bundle f12748d;

        public a(androidx.fragment.app.x xVar, String str, Bundle bundle, int i10) {
            str = str == null ? m0.q(xVar) : str;
            n0.f(str, "applicationId");
            this.f12746b = str;
            this.f12745a = xVar;
            this.f12748d = bundle;
        }
    }

    /* loaded from: classes.dex */
    public final class b extends WebViewClient {

        /* renamed from: a */
        public final /* synthetic */ r0 f12749a;

        public b(r0 r0Var) {
            gm.l.f(r0Var, "this$0");
            this.f12749a = r0Var;
        }

        @Override // android.webkit.WebViewClient
        public final void onPageFinished(WebView webView, String str) {
            ProgressDialog progressDialog;
            gm.l.f(webView, "view");
            gm.l.f(str, InnerShareParams.URL);
            super.onPageFinished(webView, str);
            r0 r0Var = this.f12749a;
            if (!r0Var.f12742j && (progressDialog = r0Var.f12737e) != null) {
                progressDialog.dismiss();
            }
            FrameLayout frameLayout = this.f12749a.f12739g;
            if (frameLayout != null) {
                frameLayout.setBackgroundColor(0);
            }
            f fVar = this.f12749a.f12736d;
            if (fVar != null) {
                fVar.setVisibility(0);
            }
            ImageView imageView = this.f12749a.f12738f;
            if (imageView != null) {
                imageView.setVisibility(0);
            }
            this.f12749a.f12743k = true;
        }

        @Override // android.webkit.WebViewClient
        public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            ProgressDialog progressDialog;
            gm.l.f(webView, "view");
            gm.l.f(str, InnerShareParams.URL);
            m0 m0Var = m0.f12709a;
            gm.l.k(str, "Webview loading URL: ");
            o5.v vVar = o5.v.f22837a;
            super.onPageStarted(webView, str, bitmap);
            r0 r0Var = this.f12749a;
            if (!r0Var.f12742j && (progressDialog = r0Var.f12737e) != null) {
                progressDialog.show();
            }
        }

        @Override // android.webkit.WebViewClient
        public final void onReceivedError(WebView webView, int i10, String str, String str2) {
            gm.l.f(webView, "view");
            gm.l.f(str, "description");
            gm.l.f(str2, "failingUrl");
            super.onReceivedError(webView, i10, str, str2);
            this.f12749a.d(new o5.o(str, i10, str2));
        }

        @Override // android.webkit.WebViewClient
        public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            gm.l.f(webView, "view");
            gm.l.f(sslErrorHandler, "handler");
            gm.l.f(sslError, "error");
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
            sslErrorHandler.cancel();
            this.f12749a.d(new o5.o(null, -11, null));
        }

        @Override // android.webkit.WebViewClient
        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            boolean z10;
            int i10;
            gm.l.f(webView, "view");
            gm.l.f(str, InnerShareParams.URL);
            m0 m0Var = m0.f12709a;
            gm.l.k(str, "Redirect URL: ");
            o5.v vVar = o5.v.f22837a;
            Uri parse = Uri.parse(str);
            if (parse.getPath() != null && Pattern.matches("^/(v\\d+\\.\\d+/)??dialog/.*", parse.getPath())) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (om.h.a0(str, this.f12749a.f12734b, false)) {
                Bundle b10 = this.f12749a.b(str);
                String string = b10.getString("error");
                if (string == null) {
                    string = b10.getString("error_type");
                }
                String string2 = b10.getString("error_msg");
                if (string2 == null) {
                    string2 = b10.getString("error_message");
                }
                if (string2 == null) {
                    string2 = b10.getString("error_description");
                }
                String string3 = b10.getString("error_code");
                if (string3 != null && !m0.A(string3)) {
                    try {
                        i10 = Integer.parseInt(string3);
                    } catch (NumberFormatException unused) {
                    }
                    if (!m0.A(string) && m0.A(string2) && i10 == -1) {
                        r0 r0Var = this.f12749a;
                        c cVar = r0Var.f12735c;
                        if (cVar != null && !r0Var.f12741i) {
                            r0Var.f12741i = true;
                            cVar.a(b10, null);
                            r0Var.dismiss();
                        }
                    } else if ((string == null && (gm.l.a(string, "access_denied") || gm.l.a(string, "OAuthAccessDeniedException"))) || i10 == 4201) {
                        this.f12749a.cancel();
                    } else {
                        this.f12749a.d(new o5.x(new o5.s(i10, string, string2), string2));
                    }
                    return true;
                }
                i10 = -1;
                if (!m0.A(string)) {
                }
                if (string == null) {
                }
                this.f12749a.d(new o5.x(new o5.s(i10, string, string2), string2));
                return true;
            } else if (om.h.a0(str, "fbconnect://cancel", false)) {
                this.f12749a.cancel();
                return true;
            } else if (z10 || om.l.c0(str, "touch", false)) {
                return false;
            } else {
                try {
                    this.f12749a.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                    return true;
                } catch (ActivityNotFoundException unused2) {
                    return false;
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        void a(Bundle bundle, o5.p pVar);
    }

    /* loaded from: classes.dex */
    public final class d extends AsyncTask<Void, Void, String[]> {

        /* renamed from: a */
        public final String f12750a;

        /* renamed from: b */
        public final Bundle f12751b;

        /* renamed from: c */
        public Exception[] f12752c;

        /* renamed from: d */
        public final /* synthetic */ r0 f12753d;

        public d(r0 r0Var, String str, Bundle bundle) {
            gm.l.f(r0Var, "this$0");
            gm.l.f(str, "action");
            this.f12753d = r0Var;
            this.f12750a = str;
            this.f12751b = bundle;
            this.f12752c = new Exception[0];
        }

        /* JADX WARN: Type inference failed for: r10v1, types: [d6.s0] */
        public final String[] a(Void... voidArr) {
            if (i6.a.b(this)) {
                return null;
            }
            try {
                gm.l.f(voidArr, "p0");
                String[] stringArray = this.f12751b.getStringArray("media");
                if (stringArray == null) {
                    return null;
                }
                final String[] strArr = new String[stringArray.length];
                this.f12752c = new Exception[stringArray.length];
                final CountDownLatch countDownLatch = new CountDownLatch(stringArray.length);
                ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
                Date date = o5.a.f22664l;
                o5.a b10 = a.c.b();
                final int i10 = 0;
                try {
                    int length = stringArray.length - 1;
                    if (length >= 0) {
                        while (true) {
                            int i11 = i10 + 1;
                            if (isCancelled()) {
                                Iterator it = concurrentLinkedQueue.iterator();
                                while (it.hasNext()) {
                                    ((o5.c0) it.next()).cancel(true);
                                }
                                return null;
                            }
                            Uri parse = Uri.parse(stringArray[i10]);
                            if (m0.B(parse)) {
                                strArr[i10] = parse.toString();
                                countDownLatch.countDown();
                            } else {
                                ?? r10 = new y.b() { // from class: d6.s0
                                    @Override // o5.y.b
                                    public final void b(o5.e0 e0Var) {
                                        o5.s sVar;
                                        String str;
                                        String[] strArr2 = strArr;
                                        int i12 = i10;
                                        r0.d dVar = this;
                                        CountDownLatch countDownLatch2 = countDownLatch;
                                        gm.l.f(strArr2, "$results");
                                        gm.l.f(dVar, "this$0");
                                        gm.l.f(countDownLatch2, "$latch");
                                        try {
                                            sVar = e0Var.f22704c;
                                            str = "Error staging photo.";
                                        } catch (Exception e10) {
                                            dVar.f12752c[i12] = e10;
                                        }
                                        if (sVar != null) {
                                            String a10 = sVar.a();
                                            if (a10 != null) {
                                                str = a10;
                                            }
                                            throw new o5.q(e0Var, str);
                                        }
                                        JSONObject jSONObject = e0Var.f22703b;
                                        if (jSONObject != null) {
                                            String optString = jSONObject.optString("uri");
                                            if (optString != null) {
                                                strArr2[i12] = optString;
                                                countDownLatch2.countDown();
                                                return;
                                            }
                                            throw new o5.p("Error staging photo.");
                                        }
                                        throw new o5.p("Error staging photo.");
                                    }
                                };
                                gm.l.e(parse, "uri");
                                concurrentLinkedQueue.add(ge.b.m(b10, parse, r10).d());
                            }
                            if (i11 > length) {
                                break;
                            }
                            i10 = i11;
                        }
                    }
                    countDownLatch.await();
                    return strArr;
                } catch (Exception unused) {
                    Iterator it2 = concurrentLinkedQueue.iterator();
                    while (it2.hasNext()) {
                        ((o5.c0) it2.next()).cancel(true);
                    }
                    return null;
                }
            } catch (Throwable th2) {
                i6.a.a(this, th2);
                return null;
            }
        }

        public final void b(String[] strArr) {
            if (i6.a.b(this)) {
                return;
            }
            try {
                ProgressDialog progressDialog = this.f12753d.f12737e;
                if (progressDialog != null) {
                    progressDialog.dismiss();
                }
                Exception[] excArr = this.f12752c;
                int i10 = 0;
                int length = excArr.length;
                while (i10 < length) {
                    Exception exc = excArr[i10];
                    i10++;
                    if (exc != null) {
                        this.f12753d.d(exc);
                        return;
                    }
                }
                if (strArr == null) {
                    this.f12753d.d(new o5.p("Failed to stage photos for web dialog"));
                    return;
                }
                List t10 = ul.i.t(strArr);
                if (t10.contains(null)) {
                    this.f12753d.d(new o5.p("Failed to stage photos for web dialog"));
                    return;
                }
                m0 m0Var = m0.f12709a;
                m0.H(this.f12751b, new JSONArray((Collection) t10));
                String a10 = i0.a();
                Uri b10 = m0.b(this.f12751b, a10, o5.v.d() + "/dialog/" + this.f12750a);
                this.f12753d.f12733a = b10.toString();
                ImageView imageView = this.f12753d.f12738f;
                if (imageView != null) {
                    this.f12753d.e((imageView.getDrawable().getIntrinsicWidth() / 2) + 1);
                    return;
                }
                throw new IllegalStateException("Required value was null.".toString());
            } catch (Throwable th2) {
                i6.a.a(this, th2);
            }
        }

        @Override // android.os.AsyncTask
        public final /* bridge */ /* synthetic */ String[] doInBackground(Void[] voidArr) {
            if (i6.a.b(this)) {
                return null;
            }
            try {
                return a(voidArr);
            } catch (Throwable th2) {
                i6.a.a(this, th2);
                return null;
            }
        }

        @Override // android.os.AsyncTask
        public final /* bridge */ /* synthetic */ void onPostExecute(String[] strArr) {
            if (i6.a.b(this)) {
                return;
            }
            try {
                b(strArr);
            } catch (Throwable th2) {
                i6.a.a(this, th2);
            }
        }
    }

    /* loaded from: classes.dex */
    public /* synthetic */ class e {

        /* renamed from: a */
        public static final /* synthetic */ int[] f12754a;

        static {
            int[] iArr = new int[n6.y.valuesCustom().length];
            iArr[1] = 1;
            f12754a = iArr;
        }
    }

    /* loaded from: classes.dex */
    public static final class f extends WebView {
        public f(Context context) {
            super(context);
        }

        @Override // android.webkit.WebView, android.view.View
        public final void onWindowFocusChanged(boolean z10) {
            try {
                super.onWindowFocusChanged(z10);
            } catch (NullPointerException unused) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(Context context, String str, Bundle bundle, n6.y yVar, c cVar) {
        super(context, f12732n);
        String a10;
        String str2;
        n0.g();
        this.f12734b = "fbconnect://success";
        bundle = bundle == null ? new Bundle() : bundle;
        String str3 = m0.x(context) ? "fbconnect://chrome_os_success" : "fbconnect://success";
        this.f12734b = str3;
        bundle.putString("redirect_uri", str3);
        bundle.putString("display", "touch");
        bundle.putString("client_id", o5.v.b());
        String format = String.format(Locale.ROOT, "android-%s", Arrays.copyOf(new Object[]{"14.1.0"}, 1));
        gm.l.e(format, "java.lang.String.format(locale, format, *args)");
        bundle.putString("sdk", format);
        this.f12735c = cVar;
        if (gm.l.a(str, "share") && bundle.containsKey("media")) {
            this.f12740h = new d(this, str, bundle);
            return;
        }
        if (e.f12754a[yVar.ordinal()] == 1) {
            a10 = i0.b();
            str2 = "oauth/authorize";
        } else {
            a10 = i0.a();
            str2 = o5.v.d() + "/dialog/" + ((Object) str);
        }
        this.f12733a = m0.b(bundle, a10, str2).toString();
    }

    public static final void a(Context context) {
        Bundle bundle;
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            if (applicationInfo == null) {
                bundle = null;
            } else {
                bundle = applicationInfo.metaData;
            }
            if (bundle != null && f12732n == 0) {
                int i10 = applicationInfo.metaData.getInt("com.facebook.sdk.WebDialogTheme");
                if (i10 == 0) {
                    i10 = f12731m;
                }
                f12732n = i10;
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    public Bundle b(String str) {
        Uri parse = Uri.parse(str);
        m0 m0Var = m0.f12709a;
        Bundle G = m0.G(parse.getQuery());
        G.putAll(m0.G(parse.getFragment()));
        return G;
    }

    public final void c() {
        Object systemService = getContext().getSystemService("window");
        if (systemService == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.WindowManager");
        }
        Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        int i10 = displayMetrics.widthPixels;
        int i11 = displayMetrics.heightPixels;
        int i12 = i10 < i11 ? i10 : i11;
        if (i10 >= i11) {
            i11 = i10;
        }
        int i13 = (int) (i12 / displayMetrics.density);
        int min = Math.min((int) (i12 * (i13 <= 480 ? 1.0d : i13 >= 800 ? 0.5d : (((800 - i13) / 320) * 0.5d) + 0.5d)), i10);
        int i14 = (int) (i11 / displayMetrics.density);
        int min2 = Math.min((int) (i11 * (i14 > 800 ? i14 >= 1280 ? 0.5d : (((1280 - i14) / 480) * 0.5d) + 0.5d : 1.0d)), displayMetrics.heightPixels);
        Window window = getWindow();
        if (window == null) {
            return;
        }
        window.setLayout(min, min2);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
        if (this.f12735c == null || this.f12741i) {
            return;
        }
        d(new o5.r());
    }

    public final void d(Exception exc) {
        if (this.f12735c == null || this.f12741i) {
            return;
        }
        this.f12741i = true;
        o5.p pVar = exc instanceof o5.p ? (o5.p) exc : new o5.p(exc);
        c cVar = this.f12735c;
        if (cVar != null) {
            cVar.a(null, pVar);
        }
        dismiss();
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        ProgressDialog progressDialog;
        f fVar = this.f12736d;
        if (fVar != null) {
            fVar.stopLoading();
        }
        if (!this.f12742j && (progressDialog = this.f12737e) != null && progressDialog.isShowing()) {
            progressDialog.dismiss();
        }
        super.dismiss();
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    public final void e(int i10) {
        LinearLayout linearLayout = new LinearLayout(getContext());
        f fVar = new f(getContext());
        this.f12736d = fVar;
        fVar.setVerticalScrollBarEnabled(false);
        f fVar2 = this.f12736d;
        if (fVar2 != null) {
            fVar2.setHorizontalScrollBarEnabled(false);
        }
        f fVar3 = this.f12736d;
        if (fVar3 != null) {
            fVar3.setWebViewClient(new b(this));
        }
        f fVar4 = this.f12736d;
        WebSettings settings = fVar4 == null ? null : fVar4.getSettings();
        if (settings != null) {
            settings.setJavaScriptEnabled(true);
        }
        f fVar5 = this.f12736d;
        if (fVar5 != null) {
            String str = this.f12733a;
            if (str == null) {
                throw new IllegalStateException("Required value was null.".toString());
            }
            fVar5.loadUrl(str);
        }
        f fVar6 = this.f12736d;
        if (fVar6 != null) {
            fVar6.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        }
        f fVar7 = this.f12736d;
        if (fVar7 != null) {
            fVar7.setVisibility(4);
        }
        f fVar8 = this.f12736d;
        WebSettings settings2 = fVar8 == null ? null : fVar8.getSettings();
        if (settings2 != null) {
            settings2.setSavePassword(false);
        }
        f fVar9 = this.f12736d;
        WebSettings settings3 = fVar9 != null ? fVar9.getSettings() : null;
        if (settings3 != null) {
            settings3.setSaveFormData(false);
        }
        f fVar10 = this.f12736d;
        if (fVar10 != null) {
            fVar10.setFocusable(true);
        }
        f fVar11 = this.f12736d;
        if (fVar11 != null) {
            fVar11.setFocusableInTouchMode(true);
        }
        f fVar12 = this.f12736d;
        if (fVar12 != null) {
            fVar12.setOnTouchListener(new View.OnTouchListener() { // from class: d6.p0
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    if (view.hasFocus()) {
                        return false;
                    }
                    view.requestFocus();
                    return false;
                }
            });
        }
        linearLayout.setPadding(i10, i10, i10, i10);
        linearLayout.addView(this.f12736d);
        linearLayout.setBackgroundColor(-872415232);
        FrameLayout frameLayout = this.f12739g;
        if (frameLayout == null) {
            return;
        }
        frameLayout.addView(linearLayout);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        WindowManager.LayoutParams layoutParams;
        IBinder iBinder;
        Window window;
        WindowManager.LayoutParams attributes;
        IBinder iBinder2;
        this.f12742j = false;
        m0 m0Var = m0.f12709a;
        Context context = getContext();
        gm.l.e(context, "context");
        if (m0.F(context) && (layoutParams = this.f12744l) != null) {
            IBinder iBinder3 = null;
            if (layoutParams == null) {
                iBinder = null;
            } else {
                iBinder = layoutParams.token;
            }
            if (iBinder == null) {
                if (layoutParams != null) {
                    Activity ownerActivity = getOwnerActivity();
                    if (ownerActivity == null) {
                        window = null;
                    } else {
                        window = ownerActivity.getWindow();
                    }
                    if (window == null || (attributes = window.getAttributes()) == null) {
                        iBinder2 = null;
                    } else {
                        iBinder2 = attributes.token;
                    }
                    layoutParams.token = iBinder2;
                }
                WindowManager.LayoutParams layoutParams2 = this.f12744l;
                if (layoutParams2 != null) {
                    iBinder3 = layoutParams2.token;
                }
                gm.l.k(iBinder3, "Set token on onAttachedToWindow(): ");
                o5.v vVar = o5.v.f22837a;
            }
        }
        super.onAttachedToWindow();
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ProgressDialog progressDialog = new ProgressDialog(getContext());
        this.f12737e = progressDialog;
        progressDialog.requestWindowFeature(1);
        ProgressDialog progressDialog2 = this.f12737e;
        if (progressDialog2 != null) {
            progressDialog2.setMessage(getContext().getString(R.string.com_facebook_loading));
        }
        ProgressDialog progressDialog3 = this.f12737e;
        if (progressDialog3 != null) {
            progressDialog3.setCanceledOnTouchOutside(false);
        }
        ProgressDialog progressDialog4 = this.f12737e;
        if (progressDialog4 != null) {
            progressDialog4.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: d6.o0
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    r0 r0Var = r0.this;
                    gm.l.f(r0Var, "this$0");
                    r0Var.cancel();
                }
            });
        }
        requestWindowFeature(1);
        this.f12739g = new FrameLayout(getContext());
        c();
        Window window = getWindow();
        if (window != null) {
            window.setGravity(17);
        }
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setSoftInputMode(16);
        }
        ImageView imageView = new ImageView(getContext());
        this.f12738f = imageView;
        imageView.setOnClickListener(new q0(0, this));
        Drawable drawable = getContext().getResources().getDrawable(R.drawable.com_facebook_close);
        ImageView imageView2 = this.f12738f;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
        ImageView imageView3 = this.f12738f;
        if (imageView3 != null) {
            imageView3.setVisibility(4);
        }
        if (this.f12733a != null) {
            ImageView imageView4 = this.f12738f;
            if (imageView4 != null) {
                e((imageView4.getDrawable().getIntrinsicWidth() / 2) + 1);
            } else {
                throw new IllegalStateException("Required value was null.".toString());
            }
        }
        FrameLayout frameLayout = this.f12739g;
        if (frameLayout != null) {
            frameLayout.addView(this.f12738f, new ViewGroup.LayoutParams(-2, -2));
        }
        FrameLayout frameLayout2 = this.f12739g;
        if (frameLayout2 != null) {
            setContentView(frameLayout2);
            return;
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.f12742j = true;
        super.onDetachedFromWindow();
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        gm.l.f(keyEvent, "event");
        if (i10 == 4) {
            f fVar = this.f12736d;
            if (fVar != null && gm.l.a(Boolean.valueOf(fVar.canGoBack()), Boolean.TRUE)) {
                f fVar2 = this.f12736d;
                if (fVar2 == null) {
                    return true;
                }
                fVar2.goBack();
                return true;
            }
            cancel();
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        d dVar = this.f12740h;
        if (dVar != null) {
            if ((dVar == null ? null : dVar.getStatus()) == AsyncTask.Status.PENDING) {
                d dVar2 = this.f12740h;
                if (dVar2 != null) {
                    dVar2.execute(new Void[0]);
                }
                ProgressDialog progressDialog = this.f12737e;
                if (progressDialog == null) {
                    return;
                }
                progressDialog.show();
                return;
            }
        }
        c();
    }

    @Override // android.app.Dialog
    public final void onStop() {
        d dVar = this.f12740h;
        if (dVar != null) {
            dVar.cancel(true);
            ProgressDialog progressDialog = this.f12737e;
            if (progressDialog != null) {
                progressDialog.dismiss();
            }
        }
        super.onStop();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        gm.l.f(layoutParams, "params");
        if (layoutParams.token == null) {
            this.f12744l = layoutParams;
        }
        super.onWindowAttributesChanged(layoutParams);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public r0(androidx.fragment.app.x r2, java.lang.String r3) {
        /*
            r1 = this;
            d6.n0.g()
            int r0 = d6.r0.f12732n
            if (r0 != 0) goto Lc
            d6.n0.g()
            int r0 = d6.r0.f12732n
        Lc:
            r1.<init>(r2, r0)
            java.lang.String r2 = "fbconnect://success"
            r1.f12734b = r2
            r1.f12733a = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: d6.r0.<init>(androidx.fragment.app.x, java.lang.String):void");
    }
}
