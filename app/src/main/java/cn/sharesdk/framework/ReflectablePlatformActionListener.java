package cn.sharesdk.framework;

import android.os.Handler;
import android.os.Message;
import com.mob.tools.utils.UIHandler;
import java.util.HashMap;

/* loaded from: classes.dex */
public class ReflectablePlatformActionListener implements PlatformActionListener {

    /* renamed from: a */
    private int f5064a;

    /* renamed from: b */
    private Handler.Callback f5065b;

    /* renamed from: c */
    private int f5066c;

    /* renamed from: d */
    private Handler.Callback f5067d;

    /* renamed from: e */
    private int f5068e;

    /* renamed from: f */
    private Handler.Callback f5069f;

    @Override // cn.sharesdk.framework.PlatformActionListener
    public void onCancel(Platform platform, int i10) {
        if (this.f5069f != null) {
            Message message = new Message();
            message.what = this.f5068e;
            message.obj = new Object[]{platform, Integer.valueOf(i10)};
            UIHandler.sendMessage(message, this.f5069f);
        }
    }

    @Override // cn.sharesdk.framework.PlatformActionListener
    public void onComplete(Platform platform, int i10, HashMap<String, Object> hashMap) {
        if (this.f5065b != null) {
            Message message = new Message();
            message.what = this.f5064a;
            message.obj = new Object[]{platform, Integer.valueOf(i10), hashMap};
            UIHandler.sendMessage(message, this.f5065b);
        }
    }

    @Override // cn.sharesdk.framework.PlatformActionListener
    public void onError(Platform platform, int i10, Throwable th2) {
        if (this.f5067d != null) {
            Message message = new Message();
            message.what = this.f5066c;
            message.obj = new Object[]{platform, Integer.valueOf(i10), th2};
            UIHandler.sendMessage(message, this.f5067d);
        }
    }

    public void setOnCancelCallback(int i10, Handler.Callback callback) {
        this.f5068e = i10;
        this.f5069f = callback;
    }

    public void setOnCompleteCallback(int i10, Handler.Callback callback) {
        this.f5064a = i10;
        this.f5065b = callback;
    }

    public void setOnErrorCallback(int i10, Handler.Callback callback) {
        this.f5066c = i10;
        this.f5067d = callback;
    }
}
