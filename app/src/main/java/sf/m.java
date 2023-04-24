package sf;

import android.app.NotificationManager;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Vibrator;
import mf.a0;
import og.b1;
import og.c1;
import p000do.a;

/* loaded from: classes2.dex */
public final class m extends gm.m implements fm.l<Throwable, tl.l> {

    /* renamed from: b */
    public final /* synthetic */ n f26954b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(n nVar) {
        super(1);
        this.f26954b = nVar;
    }

    @Override // fm.l
    public final tl.l k(Throwable th2) {
        MediaPlayer mediaPlayer;
        n nVar = this.f26954b;
        nVar.getClass();
        a.b bVar = p000do.a.f13275a;
        bVar.t("FindPhone");
        bVar.h("doStop", new Object[0]);
        Object systemService = nVar.f26955a.getSystemService("audio");
        gm.l.d(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        AudioManager audioManager = (AudioManager) systemService;
        Integer num = nVar.f26960f;
        if (num != null) {
            audioManager.setStreamVolume(3, num.intValue(), 0);
        }
        nVar.f26960f = null;
        w.d dVar = nVar.f26959e;
        if (dVar != null && (mediaPlayer = (MediaPlayer) dVar.f29489a) != null) {
            if (mediaPlayer.isPlaying()) {
                mediaPlayer.stop();
            }
            mediaPlayer.reset();
        }
        nVar.f26959e = null;
        Object systemService2 = nVar.f26955a.getSystemService("vibrator");
        gm.l.d(systemService2, "null cannot be cast to non-null type android.os.Vibrator");
        ((Vibrator) systemService2).cancel();
        Object systemService3 = nVar.f26955a.getSystemService("notification");
        gm.l.d(systemService3, "null cannot be cast to non-null type android.app.NotificationManager");
        ((NotificationManager) systemService3).cancel(10001);
        c1 d10 = nVar.f26957c.d();
        a0.j(d10.f23242b, new b1(d10, null));
        bVar.t("FindPhone");
        bVar.h("find phone finished", new Object[0]);
        return tl.l.f28297a;
    }
}
