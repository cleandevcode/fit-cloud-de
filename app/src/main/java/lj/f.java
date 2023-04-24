package lj;

import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaControllerCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import p000do.a;

/* loaded from: classes2.dex */
public final class f extends MediaControllerCompat.a {

    /* renamed from: d */
    public final /* synthetic */ e f20062d;

    public f(e eVar) {
        this.f20062d = eVar;
    }

    @Override // android.support.v4.media.session.MediaControllerCompat.a
    public final void a(MediaMetadataCompat mediaMetadataCompat) {
        a.b bVar = p000do.a.f13275a;
        bVar.t("Fc#Music");
        bVar.h("onMetadataChanged:" + mediaMetadataCompat, new Object[0]);
        this.f20062d.b(mediaMetadataCompat, true);
    }

    @Override // android.support.v4.media.session.MediaControllerCompat.a
    public final void b(PlaybackStateCompat playbackStateCompat) {
        a.b bVar = p000do.a.f13275a;
        bVar.t("Fc#Music");
        bVar.h("onPlaybackStateChanged:" + playbackStateCompat, new Object[0]);
        this.f20062d.c(playbackStateCompat);
    }
}
