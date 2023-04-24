package com.mob.tools;

import a0.q;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import com.mob.commons.a.d;
import com.mob.tools.proguard.EverythingKeeper;
import com.mob.tools.utils.DH;
import com.mob.tools.utils.ReflectHelper;
import com.mob.tools.utils.ResHelper;
import com.mob.tools.utils.UIHandler;
import java.lang.reflect.Method;
import java.util.HashMap;
import no.nordicsemi.android.dfu.DfuBaseService;

/* loaded from: classes.dex */
public class FakeActivity implements EverythingKeeper {
    private static Class<? extends Activity> shellClass;
    public Activity activity;
    private View contentView;
    private HashMap<String, Object> result;
    private FakeActivity resultReceiver;

    public static void registerExecutor(String str, Object obj) {
        Class<? extends Activity> cls = shellClass;
        if (cls == null) {
            MobUIShell.a(str, obj);
            return;
        }
        try {
            Method method = cls.getMethod(d.a("016-eiYjKggefghEejYeiheem$j=ehed8eTfdei"), String.class, Object.class);
            method.setAccessible(true);
            method.invoke(null, str, obj);
        } catch (Throwable th2) {
            MobLog.getInstance().w(th2);
        }
    }

    public static void setShell(Class<? extends Activity> cls) {
        shellClass = cls;
    }

    public void showActivity(final Context context, final Intent intent) {
        if (context instanceof Activity) {
            context.startActivity(intent);
        } else {
            DH.requester(context).getTopActivity().request(new DH.DHResponder() { // from class: com.mob.tools.FakeActivity.2
                @Override // com.mob.tools.utils.DH.DHResponder
                public void onResponse(DH.DHResponse dHResponse) {
                    Activity topActivity = dHResponse.getTopActivity();
                    if (topActivity != null) {
                        topActivity.startActivity(intent);
                        return;
                    }
                    intent.addFlags(268435456);
                    context.startActivity(intent);
                }
            });
        }
    }

    public void beforeStartActivityForResult(Intent intent, int i10, Bundle bundle) {
    }

    public boolean disableScreenCapture() {
        Activity activity = this.activity;
        if (activity != null) {
            activity.getWindow().setFlags(DfuBaseService.ERROR_REMOTE_MASK, DfuBaseService.ERROR_REMOTE_MASK);
            return true;
        }
        return false;
    }

    public <T extends View> T findViewById(int i10) {
        Activity activity = this.activity;
        if (activity == null) {
            return null;
        }
        return (T) activity.findViewById(i10);
    }

    public <T extends View> T findViewByResName(View view, String str) {
        int idRes;
        Activity activity = this.activity;
        if (activity != null && (idRes = ResHelper.getIdRes(activity, str)) > 0) {
            return (T) view.findViewById(idRes);
        }
        return null;
    }

    public <T extends View> T findViewByResName(String str) {
        int idRes;
        Activity activity = this.activity;
        if (activity != null && (idRes = ResHelper.getIdRes(activity, str)) > 0) {
            return (T) findViewById(idRes);
        }
        return null;
    }

    public final void finish() {
        Activity activity = this.activity;
        if (activity != null) {
            activity.finish();
        }
    }

    public View getContentView() {
        return this.contentView;
    }

    public Context getContext() {
        return this.activity;
    }

    public int getOrientation() {
        return this.activity.getResources().getConfiguration().orientation;
    }

    public FakeActivity getParent() {
        return this.resultReceiver;
    }

    public void onActivityResult(int i10, int i11, Intent intent) {
    }

    public void onConfigurationChanged(Configuration configuration) {
    }

    public void onCreate() {
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        return true;
    }

    public void onDestroy() {
    }

    public boolean onFinish() {
        return false;
    }

    public boolean onKeyEvent(int i10, KeyEvent keyEvent) {
        return false;
    }

    public void onNewIntent(Intent intent) {
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        return false;
    }

    public void onPause() {
    }

    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
    }

    public void onRestart() {
    }

    public void onResult(HashMap<String, Object> hashMap) {
    }

    public void onResume() {
    }

    public int onSetTheme(int i10, boolean z10) {
        return i10;
    }

    public void onStart() {
    }

    public void onStop() {
    }

    public void requestFullScreen(boolean z10) {
        Activity activity = this.activity;
        if (activity == null) {
            return;
        }
        if (z10) {
            activity.getWindow().addFlags(DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED);
            this.activity.getWindow().clearFlags(2048);
        } else {
            activity.getWindow().addFlags(2048);
            this.activity.getWindow().clearFlags(DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED);
        }
        this.activity.getWindow().getDecorView().requestLayout();
    }

    public void requestLandscapeOrientation() {
        setRequestedOrientation(0);
    }

    public void requestPermissions(String[] strArr, int i10) {
        Activity activity = this.activity;
        if (activity != null && Build.VERSION.SDK_INT >= 23) {
            try {
                ReflectHelper.invokeInstanceMethod(activity, d.a("018ReiLjlWed>jHghBe*hi(j+ei<m2efghgheffdelgh"), new Object[]{strArr, Integer.valueOf(i10)}, new Class[]{String.class, Integer.TYPE});
            } catch (Throwable th2) {
                MobLog.getInstance().d(th2);
            }
        }
    }

    public void requestPortraitOrientation() {
        setRequestedOrientation(1);
    }

    public void requestSensorLandscapeOrientation() {
        setRequestedOrientation(6);
    }

    public void requestSensorPortraitOrientation() {
        setRequestedOrientation(7);
    }

    public void runOnUIThread(final Runnable runnable) {
        UIHandler.sendEmptyMessage(0, new Handler.Callback() { // from class: com.mob.tools.FakeActivity.3
            @Override // android.os.Handler.Callback
            public boolean handleMessage(Message message) {
                runnable.run();
                return false;
            }
        });
    }

    public void runOnUIThread(final Runnable runnable, long j10) {
        UIHandler.sendEmptyMessageDelayed(0, j10, new Handler.Callback() { // from class: com.mob.tools.FakeActivity.4
            @Override // android.os.Handler.Callback
            public boolean handleMessage(Message message) {
                runnable.run();
                return false;
            }
        });
    }

    public void sendResult() {
        FakeActivity fakeActivity = this.resultReceiver;
        if (fakeActivity != null) {
            fakeActivity.onResult(this.result);
        }
    }

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public void setContentView(View view) {
        this.contentView = view;
    }

    public void setContentViewLayoutResName(String str) {
        int layoutRes;
        Activity activity = this.activity;
        if (activity != null && (layoutRes = ResHelper.getLayoutRes(activity, str)) > 0) {
            this.activity.setContentView(layoutRes);
        }
    }

    public void setRequestedOrientation(int i10) {
        if (this.activity == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 26 || getContext().getApplicationInfo().targetSdkVersion < 27) {
            this.activity.setRequestedOrientation(i10);
        }
    }

    public final void setResult(HashMap<String, Object> hashMap) {
        this.result = hashMap;
    }

    public void show(Context context, Intent intent) {
        showForResult(context, intent, null);
    }

    public void showForResult(final Context context, Intent intent, FakeActivity fakeActivity) {
        final Intent intent2;
        this.resultReceiver = fakeActivity;
        String str = null;
        if (shellClass != null) {
            intent2 = new Intent(context, shellClass);
            try {
                Method method = shellClass.getMethod(d.a("016@ei4j=ggefgh8ejGeiheemXj,ehed]eGfdei"), Object.class);
                method.setAccessible(true);
                str = (String) method.invoke(null, this);
            } catch (Throwable th2) {
                MobLog.getInstance().w(th2);
            }
        } else {
            intent2 = new Intent(context, MobUIShell.class);
            str = MobUIShell.a(this);
        }
        intent2.putExtra(d.a("011YfeegedelehBd9ee$e)efGmj"), str);
        intent2.putExtra(d.a("013j,emRj9ehed>e3fdeieeelegRmj"), getClass().getName());
        if (intent != null) {
            intent2.putExtras(intent);
        }
        if (Thread.currentThread().getId() == q.a()) {
            showActivity(context, intent2);
        } else {
            UIHandler.sendEmptyMessage(0, new Handler.Callback() { // from class: com.mob.tools.FakeActivity.1
                @Override // android.os.Handler.Callback
                public boolean handleMessage(Message message) {
                    FakeActivity.this.showActivity(context, intent2);
                    return false;
                }
            });
        }
    }

    public void startActivity(Intent intent) {
        startActivityForResult(intent, -1);
    }

    public void startActivityForResult(Intent intent, int i10) {
        Activity activity = this.activity;
        if (activity == null) {
            return;
        }
        activity.startActivityForResult(intent, i10);
    }
}
