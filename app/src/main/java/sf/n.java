package sf;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import com.topstep.fitcloudpro.R;
import java.io.IOException;
import p000do.a;
import pm.e0;
import pm.z1;

/* loaded from: classes2.dex */
public final class n {

    /* renamed from: a */
    public final Context f26955a;

    /* renamed from: b */
    public final e0 f26956b;

    /* renamed from: c */
    public final og.t f26957c;

    /* renamed from: d */
    public z1 f26958d;

    /* renamed from: e */
    public w.d f26959e;

    /* renamed from: f */
    public Integer f26960f;

    public n(Context context, e0 e0Var, og.t tVar) {
        gm.l.f(e0Var, "applicationScope");
        gm.l.f(tVar, "deviceManager");
        this.f26955a = context;
        this.f26956b = e0Var;
        this.f26957c = tVar;
    }

    public static final void a(n nVar, boolean z10) {
        String str;
        int i10;
        nVar.getClass();
        a.b bVar = p000do.a.f13275a;
        bVar.t("FindPhone");
        bVar.h("doStart:%b", Boolean.valueOf(z10));
        Object systemService = nVar.f26955a.getSystemService("audio");
        gm.l.d(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        AudioManager audioManager = (AudioManager) systemService;
        int streamMaxVolume = audioManager.getStreamMaxVolume(3);
        int streamVolume = audioManager.getStreamVolume(3);
        int i11 = streamMaxVolume - 2;
        if (streamVolume < i11) {
            nVar.f26960f = Integer.valueOf(streamVolume);
            audioManager.setStreamVolume(3, i11, 0);
        } else {
            nVar.f26960f = null;
        }
        try {
            audioManager.setMode(3);
            audioManager.stopBluetoothSco();
            audioManager.setBluetoothScoOn(false);
            audioManager.setSpeakerphoneOn(true);
        } catch (Exception e10) {
            a.b bVar2 = p000do.a.f13275a;
            bVar2.t("FindPhone");
            bVar2.q(e10);
        }
        w.d dVar = new w.d(9);
        Context context = nVar.f26955a;
        if (z10) {
            str = "custom_find_phone.mp3";
        } else {
            str = "find_phone.mp3";
        }
        gm.l.f(context, "context");
        MediaPlayer mediaPlayer = (MediaPlayer) dVar.f29489a;
        if (mediaPlayer == null) {
            mediaPlayer = new MediaPlayer();
            mediaPlayer.setAudioStreamType(3);
            mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: qi.j
                @Override // android.media.MediaPlayer.OnPreparedListener
                public final void onPrepared(MediaPlayer mediaPlayer2) {
                    try {
                        mediaPlayer2.start();
                    } catch (Exception e11) {
                        p000do.a.f13275a.q(e11);
                    }
                }
            });
            dVar.f29489a = mediaPlayer;
        }
        if (mediaPlayer.isPlaying()) {
            mediaPlayer.stop();
        }
        mediaPlayer.reset();
        try {
            AssetFileDescriptor openFd = context.getResources().getAssets().openFd(str);
            gm.l.e(openFd, "context.resources.assets.openFd(fileName)");
            mediaPlayer.setDataSource(openFd.getFileDescriptor(), openFd.getStartOffset(), openFd.getLength());
            mediaPlayer.prepareAsync();
        } catch (IOException e11) {
            p000do.a.f13275a.q(e11);
        }
        nVar.f26959e = dVar;
        Object systemService2 = nVar.f26955a.getSystemService("vibrator");
        gm.l.d(systemService2, "null cannot be cast to non-null type android.os.Vibrator");
        Vibrator vibrator = (Vibrator) systemService2;
        long[] jArr = {0, 300, 500, 300};
        AudioAttributes build = new AudioAttributes.Builder().setContentType(2).setUsage(4).build();
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 26) {
            vibrator.vibrate(VibrationEffect.createWaveform(jArr, 2), build);
        } else {
            vibrator.vibrate(jArr, 2, build);
        }
        Object systemService3 = nVar.f26955a.getSystemService("notification");
        gm.l.d(systemService3, "null cannot be cast to non-null type android.app.NotificationManager");
        NotificationManager notificationManager = (NotificationManager) systemService3;
        Context context2 = nVar.f26955a;
        gm.l.f(context2, "context");
        if (i12 >= 26) {
            NotificationChannel notificationChannel = new NotificationChannel("Core", context2.getString(R.string.notification_channel_core_name), 4);
            notificationChannel.setDescription(context2.getString(R.string.notification_channel_core_des));
            notificationManager.createNotificationChannel(notificationChannel);
        }
        Intent intent = new Intent("com.topstep.fitcloudpro.action.StopFindPhone");
        Context context3 = nVar.f26955a;
        if (i12 >= 31) {
            i10 = 201326592;
        } else {
            i10 = 134217728;
        }
        PendingIntent broadcast = PendingIntent.getBroadcast(context3, 0, intent, i10);
        Context context4 = nVar.f26955a;
        gm.l.f(context4, "context");
        x0.s sVar = new x0.s(context4, "Core");
        sVar.d(nVar.f26955a.getString(R.string.ds_find_phone_found));
        sVar.c(nVar.f26955a.getString(R.string.ds_find_phone_stop));
        Notification notification = sVar.f30158t;
        notification.icon = R.mipmap.ic_launcher;
        sVar.f30145g = broadcast;
        notification.deleteIntent = broadcast;
        notification.defaults = -1;
        notification.flags |= 1;
        sVar.e(16, true);
        sVar.f30147i = 1;
        notificationManager.notify(10001, sVar.a());
    }
}
