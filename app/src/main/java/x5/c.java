package x5;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import no.nordicsemi.android.dfu.internal.scanner.BootloaderScannerJB;
import o5.v;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f30282a = 0;

    /* renamed from: b */
    public final /* synthetic */ long f30283b;

    /* renamed from: c */
    public final /* synthetic */ Object f30284c;

    public /* synthetic */ c(long j10, String str) {
        this.f30283b = j10;
        this.f30284c = str;
    }

    public /* synthetic */ c(BootloaderScannerJB bootloaderScannerJB, long j10) {
        this.f30284c = bootloaderScannerJB;
        this.f30283b = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f30282a) {
            case 0:
                long j10 = this.f30283b;
                String str = (String) this.f30284c;
                gm.l.f(str, "$activityName");
                if (d.f30291g == null) {
                    d.f30291g = new k(Long.valueOf(j10), null);
                }
                if (d.f30290f.get() <= 0) {
                    l lVar = l.f30324a;
                    l.c(str, d.f30291g, d.f30293i);
                    SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(v.a()).edit();
                    edit.remove("com.facebook.appevents.SessionInfo.sessionStartTime");
                    edit.remove("com.facebook.appevents.SessionInfo.sessionEndTime");
                    edit.remove("com.facebook.appevents.SessionInfo.interruptionCount");
                    edit.remove("com.facebook.appevents.SessionInfo.sessionId");
                    edit.apply();
                    SharedPreferences.Editor edit2 = PreferenceManager.getDefaultSharedPreferences(v.a()).edit();
                    edit2.remove("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage");
                    edit2.remove("com.facebook.appevents.SourceApplicationInfo.openedByApplink");
                    edit2.apply();
                    d.f30291g = null;
                }
                synchronized (d.f30289e) {
                    d.f30288d = null;
                    tl.l lVar2 = tl.l.f28297a;
                }
                return;
            default:
                ((BootloaderScannerJB) this.f30284c).lambda$searchUsing$0(this.f30283b);
                return;
        }
    }
}
