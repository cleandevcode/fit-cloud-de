package com.mob.tools;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.media.d;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import com.mob.commons.i;
import com.mob.tools.log.NLog;
import com.mob.tools.utils.ReflectHelper;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;

/* loaded from: classes.dex */
public class MobUIShell extends Activity {

    /* renamed from: a */
    private static HashMap<String, FakeActivity> f8584a = new HashMap<>();

    /* renamed from: b */
    private FakeActivity f8585b;

    static {
        MobLog.getInstance().d("===============================", new Object[0]);
        MobLog.getInstance().d(a.b.b("MobTools ", "2023-03-22".replace("-0", "-").replace("-", ".")), new Object[0]);
        MobLog.getInstance().d("===============================", new Object[0]);
    }

    private FakeActivity a(String str) {
        Object newInstance;
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            if (str.startsWith(".")) {
                str = getPackageName() + str;
            }
            String importClass = ReflectHelper.importClass(str);
            if (TextUtils.isEmpty(importClass) || (newInstance = ReflectHelper.newInstance(importClass, new Object[0])) == null || !(newInstance instanceof FakeActivity)) {
                return null;
            }
            return (FakeActivity) newInstance;
        } catch (Throwable th2) {
            MobLog.getInstance().w(th2);
            return null;
        }
    }

    public static String a(Object obj) {
        return a(String.valueOf(System.currentTimeMillis()), obj);
    }

    public static String a(String str, Object obj) {
        f8584a.put(str, (FakeActivity) obj);
        return str;
    }

    private boolean b() {
        if (this.f8585b == null) {
            Intent intent = getIntent();
            Uri data = intent.getData();
            if (data != null && i.a("005nUgehefefg").equals(data.getScheme())) {
                FakeActivity a10 = a(data.getHost());
                this.f8585b = a10;
                if (a10 != null) {
                    NLog mobLog = MobLog.getInstance();
                    StringBuilder a11 = d.a("MobUIShell found executor: ");
                    a11.append(this.f8585b.getClass());
                    mobLog.i(a11.toString());
                    this.f8585b.setActivity(this);
                    return true;
                }
            }
            try {
                String stringExtra = intent.getStringExtra(i.a("011Ygffhfefmfi3eEffYfHfg[nk"));
                String stringExtra2 = intent.getStringExtra(i.a("013kOfn6kAfife>fUgefjfffmfh9nk"));
                FakeActivity remove = f8584a.remove(stringExtra);
                this.f8585b = remove;
                if (remove == null) {
                    FakeActivity remove2 = f8584a.remove(intent.getScheme());
                    this.f8585b = remove2;
                    if (remove2 == null) {
                        FakeActivity a12 = a();
                        this.f8585b = a12;
                        if (a12 == null) {
                            NLog mobLog2 = MobLog.getInstance();
                            mobLog2.w(new RuntimeException("Executor lost! launchTime = " + stringExtra + ", executorName: " + stringExtra2));
                            return false;
                        }
                    }
                }
                NLog mobLog3 = MobLog.getInstance();
                StringBuilder a13 = d.a("MobUIShell found executor: ");
                a13.append(this.f8585b.getClass());
                mobLog3.i(a13.toString());
                this.f8585b.setActivity(this);
            } catch (Throwable th2) {
                MobLog.getInstance().w(th2);
                return false;
            }
        }
        return true;
    }

    private boolean c() {
        if (Build.VERSION.SDK_INT > 27) {
            return false;
        }
        try {
            Field declaredField = Activity.class.getDeclaredField(i.a("013n+glfiCf;fgNl<fg*f5fkgifmhjge"));
            declaredField.setAccessible(true);
            ((ActivityInfo) declaredField.get(this)).screenOrientation = -1;
            declaredField.setAccessible(false);
            return true;
        } catch (Exception e10) {
            MobLog.getInstance().w(e10, "Fix orientation for 8.0 encountered exception", new Object[0]);
            return false;
        }
    }

    private boolean d() {
        Exception e10;
        boolean z10;
        if (Build.VERSION.SDK_INT > 27) {
            return false;
        }
        try {
            TypedArray obtainStyledAttributes = this.f8585b.activity.obtainStyledAttributes((int[]) Class.forName("com.android.internal.R$styleable").getField("Window").get(null));
            Method method = ActivityInfo.class.getMethod(i.a("023:fghigkfjfhfmhigffefi2k;fm1fGhnfjhmgfgefhCf1fgfmhh"), TypedArray.class);
            method.setAccessible(true);
            z10 = ((Boolean) method.invoke(null, obtainStyledAttributes)).booleanValue();
            try {
                method.setAccessible(false);
            } catch (Exception e11) {
                e10 = e11;
                MobLog.getInstance().w(e10);
                return z10;
            }
        } catch (Exception e12) {
            e10 = e12;
            z10 = false;
        }
        return z10;
    }

    public FakeActivity a() {
        String str;
        try {
            str = getPackageManager().getActivityInfo(getComponentName(), 128).metaData.getString(i.a("015jk8hjfhfegf'fBglfiJfPfg@l1fgTf?fk"));
        } catch (Throwable th2) {
            MobLog.getInstance().w(th2);
            str = null;
        }
        return a(str);
    }

    @Override // android.app.Activity
    public void finish() {
        FakeActivity fakeActivity = this.f8585b;
        if (fakeActivity == null || !fakeActivity.onFinish()) {
            super.finish();
        }
    }

    @Override // android.app.Activity
    public void onActivityResult(int i10, int i11, Intent intent) {
        FakeActivity fakeActivity = this.f8585b;
        if (fakeActivity != null) {
            fakeActivity.onActivityResult(i10, i11, intent);
        }
        super.onActivityResult(i10, i11, intent);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        FakeActivity fakeActivity = this.f8585b;
        if (fakeActivity != null) {
            fakeActivity.onConfigurationChanged(configuration);
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        if (!b()) {
            super.onCreate(bundle);
            finish();
            return;
        }
        NLog mobLog = MobLog.getInstance();
        mobLog.d(this.f8585b.getClass().getSimpleName() + " onCreate", new Object[0]);
        if (Build.VERSION.SDK_INT == 26 && d()) {
            c();
        }
        this.f8585b.activity.getWindow().addFlags(Integer.MIN_VALUE);
        this.f8585b.activity.getWindow().setStatusBarColor(0);
        super.onCreate(bundle);
        this.f8585b.onCreate();
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        boolean onCreateOptionsMenu = super.onCreateOptionsMenu(menu);
        FakeActivity fakeActivity = this.f8585b;
        return fakeActivity != null ? fakeActivity.onCreateOptionsMenu(menu) : onCreateOptionsMenu;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        FakeActivity fakeActivity = this.f8585b;
        if (fakeActivity != null) {
            fakeActivity.sendResult();
            NLog mobLog = MobLog.getInstance();
            mobLog.d(this.f8585b.getClass().getSimpleName() + " onDestroy", new Object[0]);
            this.f8585b.onDestroy();
        }
        super.onDestroy();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        try {
            FakeActivity fakeActivity = this.f8585b;
            if (fakeActivity != null ? fakeActivity.onKeyEvent(i10, keyEvent) : false) {
                return true;
            }
            return super.onKeyDown(i10, keyEvent);
        } catch (Throwable th2) {
            MobLog.getInstance().w(th2);
            return false;
        }
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i10, KeyEvent keyEvent) {
        try {
            FakeActivity fakeActivity = this.f8585b;
            if (fakeActivity != null ? fakeActivity.onKeyEvent(i10, keyEvent) : false) {
                return true;
            }
            return super.onKeyUp(i10, keyEvent);
        } catch (Throwable th2) {
            MobLog.getInstance().w(th2);
            return false;
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        FakeActivity fakeActivity = this.f8585b;
        if (fakeActivity == null) {
            super.onNewIntent(intent);
        } else {
            fakeActivity.onNewIntent(intent);
        }
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        boolean onOptionsItemSelected = super.onOptionsItemSelected(menuItem);
        FakeActivity fakeActivity = this.f8585b;
        return fakeActivity != null ? fakeActivity.onOptionsItemSelected(menuItem) : onOptionsItemSelected;
    }

    @Override // android.app.Activity
    public void onPause() {
        if (this.f8585b != null) {
            NLog mobLog = MobLog.getInstance();
            mobLog.d(this.f8585b.getClass().getSimpleName() + " onPause", new Object[0]);
            this.f8585b.onPause();
        }
        super.onPause();
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        FakeActivity fakeActivity = this.f8585b;
        if (fakeActivity != null) {
            fakeActivity.onRequestPermissionsResult(i10, strArr, iArr);
        }
    }

    @Override // android.app.Activity
    public void onRestart() {
        if (this.f8585b != null) {
            NLog mobLog = MobLog.getInstance();
            mobLog.d(this.f8585b.getClass().getSimpleName() + " onRestart", new Object[0]);
            this.f8585b.onRestart();
        }
        super.onRestart();
    }

    @Override // android.app.Activity
    public void onResume() {
        if (this.f8585b != null) {
            NLog mobLog = MobLog.getInstance();
            mobLog.d(this.f8585b.getClass().getSimpleName() + " onResume", new Object[0]);
            this.f8585b.onResume();
        }
        super.onResume();
    }

    @Override // android.app.Activity
    public void onStart() {
        if (this.f8585b != null) {
            NLog mobLog = MobLog.getInstance();
            mobLog.d(this.f8585b.getClass().getSimpleName() + " onStart", new Object[0]);
            this.f8585b.onStart();
        }
        super.onStart();
    }

    @Override // android.app.Activity
    public void onStop() {
        if (this.f8585b != null) {
            NLog mobLog = MobLog.getInstance();
            mobLog.d(this.f8585b.getClass().getSimpleName() + " onStop", new Object[0]);
            this.f8585b.onStop();
        }
        super.onStop();
    }

    @Override // android.app.Activity
    public void setContentView(int i10) {
        setContentView(LayoutInflater.from(this).inflate(i10, (ViewGroup) null));
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        if (view == null) {
            return;
        }
        super.setContentView(view);
        FakeActivity fakeActivity = this.f8585b;
        if (fakeActivity != null) {
            fakeActivity.setContentView(view);
        }
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        if (view == null) {
            return;
        }
        if (layoutParams == null) {
            super.setContentView(view);
        } else {
            super.setContentView(view, layoutParams);
        }
        FakeActivity fakeActivity = this.f8585b;
        if (fakeActivity != null) {
            fakeActivity.setContentView(view);
        }
    }

    @Override // android.app.Activity
    public void setRequestedOrientation(int i10) {
        if (Build.VERSION.SDK_INT == 26 && d()) {
            return;
        }
        super.setRequestedOrientation(i10);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i10) {
        if (b()) {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            int i11 = 0;
            while (i11 < stackTrace.length) {
                if (stackTrace[i11].toString().startsWith(i.a("030Bjhfh8lWfhgngffhfmhhgngk-e!fj@k6fh)j;gnhh@kf gjMf1fhfiflgkfjfhfiMk")) && (i11 = i11 + 2) < stackTrace.length) {
                    int onSetTheme = this.f8585b.onSetTheme(i10, stackTrace[i11].toString().startsWith(i.a("048Ffhfm3jHfjgefg%j_gnfh%ggFgnglfi,f1fgNl*fg8f)fkgkNeHfj'k$fh!j_gn7gk2fjhjgefj-n?gmfhfefmfiWe<glfiSf;fgClRfg3f1fk")));
                    if (onSetTheme > 0) {
                        super.setTheme(onSetTheme);
                        return;
                    }
                    return;
                }
                i11++;
            }
        }
        super.setTheme(i10);
    }

    @Override // android.app.Activity
    public void startActivityForResult(Intent intent, int i10) {
        FakeActivity fakeActivity = this.f8585b;
        if (fakeActivity != null) {
            fakeActivity.beforeStartActivityForResult(intent, i10, null);
        }
        super.startActivityForResult(intent, i10);
    }

    @Override // android.app.Activity
    public void startActivityForResult(Intent intent, int i10, Bundle bundle) {
        FakeActivity fakeActivity = this.f8585b;
        if (fakeActivity != null) {
            fakeActivity.beforeStartActivityForResult(intent, i10, bundle);
        }
        super.startActivityForResult(intent, i10, bundle);
    }
}
