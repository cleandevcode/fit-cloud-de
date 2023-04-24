package kj;

import android.media.MediaMetadata;
import android.os.Build;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaControllerCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import fm.l;
import gm.m;
import p000do.a;

/* loaded from: classes2.dex */
public final class d extends m implements l<pj.a, tl.l> {

    /* renamed from: b */
    public final /* synthetic */ e f18612b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar) {
        super(1);
        this.f18612b = eVar;
    }

    @Override // fm.l
    public final tl.l k(pj.a aVar) {
        boolean z10;
        MediaControllerCompat mediaControllerCompat;
        MediaControllerCompat mediaControllerCompat2;
        int i10;
        boolean isStreamMute;
        boolean isStreamMute2;
        int i11 = aVar.f24277a;
        boolean z11 = true;
        if (31 <= i11 && i11 < 37) {
            z10 = true;
        } else {
            z10 = false;
        }
        PlaybackStateCompat playbackStateCompat = null;
        Integer num = null;
        MediaMetadataCompat mediaMetadataCompat = null;
        if (z10) {
            if (this.f18612b.f18613a != null) {
                switch (i11) {
                    case 31:
                        a.b bVar = p000do.a.f13275a;
                        bVar.t("Fc#MediaMusic");
                        bVar.h("play_pause", new Object[0]);
                        e eVar = this.f18612b;
                        lj.e eVar2 = eVar.f18614b;
                        if (eVar2 != null) {
                            mediaControllerCompat2 = eVar2.f20049e;
                        } else {
                            mediaControllerCompat2 = null;
                        }
                        lj.c cVar = eVar.f18613a;
                        cVar.getClass();
                        if (mediaControllerCompat2 == null) {
                            bVar.t("Fc#Media");
                            bVar.h("controller is null", new Object[0]);
                        } else {
                            PlaybackStateCompat a10 = mediaControllerCompat2.a();
                            if (a10 != null) {
                                num = Integer.valueOf(a10.f682a);
                            }
                            bVar.t("Fc#Media");
                            bVar.h("state is " + num, new Object[0]);
                            if ((num == null || num.intValue() != 3) && (num == null || num.intValue() != 6)) {
                                z11 = false;
                            }
                            if (z11) {
                                i10 = 127;
                            } else {
                                i10 = (num != null && num.intValue() == 2) ? 126 : 126;
                            }
                            cVar.a(i10);
                            break;
                        }
                        cVar.a(85);
                        break;
                    case 32:
                        a.b bVar2 = p000do.a.f13275a;
                        bVar2.t("Fc#MediaMusic");
                        bVar2.h("next", new Object[0]);
                        this.f18612b.f18613a.a(87);
                        break;
                    case 33:
                        a.b bVar3 = p000do.a.f13275a;
                        bVar3.t("Fc#MediaMusic");
                        bVar3.h("previous", new Object[0]);
                        this.f18612b.f18613a.a(88);
                        break;
                    case 34:
                        a.b bVar4 = p000do.a.f13275a;
                        bVar4.t("Fc#MediaMusic");
                        bVar4.h("volume_up", new Object[0]);
                        this.f18612b.f18613a.f20040a.adjustStreamVolume(3, 1, 1);
                        break;
                    case 35:
                        a.b bVar5 = p000do.a.f13275a;
                        bVar5.t("Fc#MediaMusic");
                        bVar5.h("volume_down", new Object[0]);
                        this.f18612b.f18613a.f20040a.adjustStreamVolume(3, -1, 1);
                        break;
                    case 36:
                        a.b bVar6 = p000do.a.f13275a;
                        bVar6.t("Fc#MediaMusic");
                        bVar6.h("enter silent_mode", new Object[0]);
                        lj.c cVar2 = this.f18612b.f18613a;
                        int ringerMode = cVar2.f20040a.getRingerMode();
                        if (ringerMode != 0) {
                            if (Build.VERSION.SDK_INT >= 24) {
                                isStreamMute = cVar2.f20040a.isStreamMute(2);
                                cVar2.f20042c = isStreamMute;
                                isStreamMute2 = cVar2.f20040a.isStreamMute(3);
                                cVar2.f20043d = isStreamMute2;
                                if (!cVar2.f20042c || !isStreamMute2 || ringerMode != 1) {
                                    cVar2.f20041b = Integer.valueOf(ringerMode);
                                    cVar2.f20040a.adjustStreamVolume(2, -100, 0);
                                    cVar2.f20040a.adjustStreamVolume(3, -100, 0);
                                    cVar2.f20040a.setRingerMode(1);
                                    break;
                                }
                            } else {
                                cVar2.f20041b = Integer.valueOf(ringerMode);
                                cVar2.f20040a.setRingerMode(0);
                                break;
                            }
                        }
                        break;
                }
            }
        } else if (i11 == 52) {
            a.b bVar7 = p000do.a.f13275a;
            bVar7.t("Fc#MediaMusic");
            bVar7.h("music_info", new Object[0]);
            lj.e eVar3 = this.f18612b.f18614b;
            if (eVar3 != null && (mediaControllerCompat = eVar3.f20049e) != null) {
                MediaMetadata metadata = mediaControllerCompat.f655a.f657a.getMetadata();
                if (metadata != null) {
                    mediaMetadataCompat = MediaMetadataCompat.a(metadata);
                }
                eVar3.b(mediaMetadataCompat, false);
            }
        } else if (i11 == 51) {
            a.b bVar8 = p000do.a.f13275a;
            bVar8.t("Fc#MediaMusic");
            bVar8.h("music_state", new Object[0]);
            lj.e eVar4 = this.f18612b.f18614b;
            if (eVar4 != null) {
                MediaControllerCompat mediaControllerCompat3 = eVar4.f20049e;
                if (mediaControllerCompat3 != null) {
                    playbackStateCompat = mediaControllerCompat3.a();
                }
                eVar4.c(playbackStateCompat);
            }
        }
        return tl.l.f28297a;
    }
}
