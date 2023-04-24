package com.topstep.fitcloud.pro.ui.widget;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.SoundPool;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.topstep.fitcloudpro.R;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public class CountDownView extends FrameLayout {

    /* renamed from: a */
    public final TextView f12249a;

    /* renamed from: b */
    public final Animation f12250b;

    /* renamed from: c */
    public final SoundPool f12251c;

    /* renamed from: d */
    public final int f12252d;

    /* renamed from: e */
    public final int f12253e;

    /* renamed from: f */
    public final int f12254f;

    /* renamed from: g */
    public final a f12255g;

    /* renamed from: h */
    public int f12256h;

    /* renamed from: i */
    public b f12257i;

    /* renamed from: j */
    public boolean f12258j;

    /* loaded from: classes2.dex */
    public static class a extends Handler {

        /* renamed from: a */
        public final WeakReference<CountDownView> f12259a;

        public a(CountDownView countDownView) {
            super(Looper.getMainLooper());
            this.f12259a = new WeakReference<>(countDownView);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            CountDownView countDownView;
            if (message.what == 1 && (countDownView = this.f12259a.get()) != null) {
                countDownView.a(countDownView.f12256h - 1);
            }
        }
    }

    /* loaded from: classes2.dex */
    public interface b {
    }

    public CountDownView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f12256h = 0;
        this.f12250b = AnimationUtils.loadAnimation(context, R.anim.count_down_exit);
        SoundPool build = new SoundPool.Builder().setMaxStreams(3).setAudioAttributes(new AudioAttributes.Builder().setUsage(5).build()).build();
        this.f12251c = build;
        this.f12253e = build.load(context, R.raw.beep_once, 1);
        this.f12252d = build.load(context, R.raw.beep_twice, 1);
        this.f12254f = build.load(context, R.raw.beep_shutter, 1);
        this.f12255g = new a(this);
        LayoutInflater.from(getContext()).inflate(R.layout.count_down_view, this);
        this.f12249a = (TextView) findViewById(R.id.remaining_seconds);
    }

    /* JADX WARN: Removed duplicated region for block: B:79:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0143  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(int r15) {
        /*
            Method dump skipped, instructions count: 443
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.topstep.fitcloud.pro.ui.widget.CountDownView.a(int):void");
    }

    public final void finalize() {
        super.finalize();
        this.f12251c.release();
    }

    public void setCountDownFinishedListener(b bVar) {
        this.f12257i = bVar;
    }
}
