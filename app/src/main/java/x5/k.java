package x5;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.util.UUID;
import o5.v;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a */
    public final Long f30318a;

    /* renamed from: b */
    public Long f30319b;

    /* renamed from: c */
    public UUID f30320c;

    /* renamed from: d */
    public int f30321d;

    /* renamed from: e */
    public Long f30322e;

    /* renamed from: f */
    public m f30323f;

    public k(Long l10, Long l11) {
        UUID randomUUID = UUID.randomUUID();
        gm.l.e(randomUUID, "randomUUID()");
        this.f30318a = l10;
        this.f30319b = l11;
        this.f30320c = randomUUID;
    }

    public final void a() {
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(v.a()).edit();
        Long l10 = this.f30318a;
        edit.putLong("com.facebook.appevents.SessionInfo.sessionStartTime", l10 == null ? 0L : l10.longValue());
        Long l11 = this.f30319b;
        edit.putLong("com.facebook.appevents.SessionInfo.sessionEndTime", l11 != null ? l11.longValue() : 0L);
        edit.putInt("com.facebook.appevents.SessionInfo.interruptionCount", this.f30321d);
        edit.putString("com.facebook.appevents.SessionInfo.sessionId", this.f30320c.toString());
        edit.apply();
        m mVar = this.f30323f;
        if (mVar == null || mVar == null) {
            return;
        }
        SharedPreferences.Editor edit2 = PreferenceManager.getDefaultSharedPreferences(v.a()).edit();
        edit2.putString("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage", mVar.f30327a);
        edit2.putBoolean("com.facebook.appevents.SourceApplicationInfo.openedByApplink", mVar.f30328b);
        edit2.apply();
    }
}
