package x0;

import android.app.Notification;
import android.app.RemoteInput;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import cn.sharesdk.framework.InnerShareParams;
import java.util.ArrayList;
import java.util.Iterator;
import x0.f0;

/* loaded from: classes.dex */
public final class z {

    /* renamed from: a */
    public final Notification.Builder f30161a;

    /* renamed from: b */
    public final s f30162b;

    /* renamed from: c */
    public final Bundle f30163c;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v31 */
    /* JADX WARN: Type inference failed for: r2v32, types: [java.lang.CharSequence, long[], android.net.Uri, java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v35 */
    public z(s sVar) {
        Notification.Builder builder;
        boolean z10;
        boolean z11;
        boolean z12;
        ArrayList<String> arrayList;
        ?? r22;
        int i10;
        Bundle bundle;
        int i11;
        int i12;
        Notification.Action.Builder builder2;
        Bundle bundle2;
        Icon icon;
        int i13;
        new ArrayList();
        this.f30163c = new Bundle();
        this.f30162b = sVar;
        Context context = sVar.f30139a;
        if (Build.VERSION.SDK_INT >= 26) {
            builder = new Notification.Builder(sVar.f30139a, sVar.f30156r);
        } else {
            builder = new Notification.Builder(sVar.f30139a);
        }
        this.f30161a = builder;
        Notification notification = sVar.f30158t;
        Bundle[] bundleArr = null;
        Notification.Builder lights = builder.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS);
        if ((notification.flags & 2) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        Notification.Builder ongoing = lights.setOngoing(z10);
        if ((notification.flags & 8) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        Notification.Builder onlyAlertOnce = ongoing.setOnlyAlertOnce(z11);
        if ((notification.flags & 16) != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        onlyAlertOnce.setAutoCancel(z12).setDefaults(notification.defaults).setContentTitle(sVar.f30143e).setContentText(sVar.f30144f).setContentInfo(null).setContentIntent(sVar.f30145g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(sVar.f30146h, (notification.flags & 128) != 0).setLargeIcon((Bitmap) null).setNumber(0).setProgress(sVar.f30150l, sVar.f30151m, sVar.f30152n);
        builder.setSubText(null).setUsesChronometer(false).setPriority(sVar.f30147i);
        Iterator<q> it = sVar.f30140b.iterator();
        while (it.hasNext()) {
            q next = it.next();
            int i14 = Build.VERSION.SDK_INT;
            if (next.f30128b == null && (i13 = next.f30134h) != 0) {
                next.f30128b = IconCompat.b("", i13);
            }
            IconCompat iconCompat = next.f30128b;
            if (i14 >= 23) {
                if (iconCompat != null) {
                    if (i14 >= 23) {
                        icon = IconCompat.a.f(iconCompat, null);
                    } else {
                        throw new UnsupportedOperationException("This method is only supported on API level 23+");
                    }
                } else {
                    icon = null;
                }
                builder2 = new Notification.Action.Builder(icon, next.f30135i, next.f30136j);
            } else {
                if (iconCompat != null) {
                    i12 = iconCompat.c();
                } else {
                    i12 = 0;
                }
                builder2 = new Notification.Action.Builder(i12, next.f30135i, next.f30136j);
            }
            h0[] h0VarArr = next.f30129c;
            if (h0VarArr != null) {
                int length = h0VarArr.length;
                RemoteInput[] remoteInputArr = new RemoteInput[length];
                if (h0VarArr.length <= 0) {
                    for (int i15 = 0; i15 < length; i15++) {
                        builder2.addRemoteInput(remoteInputArr[i15]);
                    }
                } else {
                    h0 h0Var = h0VarArr[0];
                    throw null;
                }
            }
            if (next.f30127a != null) {
                bundle2 = new Bundle(next.f30127a);
            } else {
                bundle2 = new Bundle();
            }
            bundle2.putBoolean("android.support.allowGeneratedReplies", next.f30130d);
            int i16 = Build.VERSION.SDK_INT;
            if (i16 >= 24) {
                builder2.setAllowGeneratedReplies(next.f30130d);
            }
            bundle2.putInt("android.support.action.semanticAction", next.f30132f);
            if (i16 >= 28) {
                builder2.setSemanticAction(next.f30132f);
            }
            if (i16 >= 29) {
                builder2.setContextual(next.f30133g);
            }
            if (i16 >= 31) {
                builder2.setAuthenticationRequired(next.f30137k);
            }
            bundle2.putBoolean("android.support.action.showsUserInterface", next.f30131e);
            builder2.addExtras(bundle2);
            this.f30161a.addAction(builder2.build());
        }
        Bundle bundle3 = sVar.f30154p;
        if (bundle3 != null) {
            this.f30163c.putAll(bundle3);
        }
        int i17 = Build.VERSION.SDK_INT;
        this.f30161a.setShowWhen(sVar.f30148j);
        this.f30161a.setLocalOnly(sVar.f30153o).setGroup(null).setGroupSummary(false).setSortKey(null);
        this.f30161a.setCategory(null).setColor(sVar.f30155q).setVisibility(0).setPublicVersion(null).setSound(notification.sound, notification.audioAttributes);
        if (i17 < 28) {
            ArrayList<f0> arrayList2 = sVar.f30141c;
            if (arrayList2 == null) {
                arrayList = null;
            } else {
                arrayList = new ArrayList<>(arrayList2.size());
                Iterator<f0> it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    f0 next2 = it2.next();
                    String str = next2.f30097c;
                    if (str == null) {
                        if (next2.f30095a == null) {
                            str = "";
                        } else {
                            StringBuilder a10 = android.support.v4.media.d.a("name:");
                            a10.append((Object) next2.f30095a);
                            str = a10.toString();
                        }
                    }
                    arrayList.add(str);
                }
            }
            ArrayList<String> arrayList3 = sVar.f30159u;
            if (arrayList == null) {
                arrayList = arrayList3;
            } else if (arrayList3 != null) {
                o0.d dVar = new o0.d(arrayList3.size() + arrayList.size());
                dVar.addAll(arrayList);
                dVar.addAll(arrayList3);
                arrayList = new ArrayList<>(dVar);
            }
        } else {
            arrayList = sVar.f30159u;
        }
        if (arrayList != null && !arrayList.isEmpty()) {
            for (String str2 : arrayList) {
                this.f30161a.addPerson(str2);
            }
        }
        if (sVar.f30142d.size() > 0) {
            if (sVar.f30154p == null) {
                sVar.f30154p = new Bundle();
            }
            Bundle bundle4 = sVar.f30154p.getBundle("android.car.EXTENSIONS");
            bundle4 = bundle4 == null ? new Bundle() : bundle4;
            Bundle bundle5 = new Bundle(bundle4);
            Bundle bundle6 = new Bundle();
            int i18 = 0;
            while (i18 < sVar.f30142d.size()) {
                String num = Integer.toString(i18);
                q qVar = sVar.f30142d.get(i18);
                Object obj = a0.f30087a;
                Bundle bundle7 = new Bundle();
                if (qVar.f30128b == null && (i11 = qVar.f30134h) != 0) {
                    qVar.f30128b = IconCompat.b("", i11);
                }
                IconCompat iconCompat2 = qVar.f30128b;
                if (iconCompat2 != null) {
                    i10 = iconCompat2.c();
                } else {
                    i10 = 0;
                }
                bundle7.putInt("icon", i10);
                bundle7.putCharSequence(InnerShareParams.TITLE, qVar.f30135i);
                bundle7.putParcelable("actionIntent", qVar.f30136j);
                if (qVar.f30127a != null) {
                    bundle = new Bundle(qVar.f30127a);
                } else {
                    bundle = new Bundle();
                }
                bundle.putBoolean("android.support.allowGeneratedReplies", qVar.f30130d);
                bundle7.putBundle("extras", bundle);
                h0[] h0VarArr2 = qVar.f30129c;
                if (h0VarArr2 != null) {
                    bundleArr = new Bundle[h0VarArr2.length];
                    if (h0VarArr2.length > 0) {
                        h0 h0Var2 = h0VarArr2[0];
                        new Bundle();
                        throw null;
                    }
                }
                bundle7.putParcelableArray("remoteInputs", bundleArr);
                bundle7.putBoolean("showsUserInterface", qVar.f30131e);
                bundle7.putInt("semanticAction", qVar.f30132f);
                bundle6.putBundle(num, bundle7);
                i18++;
                bundleArr = null;
            }
            bundle4.putBundle("invisible_actions", bundle6);
            bundle5.putBundle("invisible_actions", bundle6);
            if (sVar.f30154p == null) {
                sVar.f30154p = new Bundle();
            }
            sVar.f30154p.putBundle("android.car.EXTENSIONS", bundle4);
            this.f30163c.putBundle("android.car.EXTENSIONS", bundle5);
        }
        int i19 = Build.VERSION.SDK_INT;
        if (i19 >= 24) {
            r22 = 0;
            this.f30161a.setExtras(sVar.f30154p).setRemoteInputHistory(null);
        } else {
            r22 = 0;
        }
        if (i19 >= 26) {
            this.f30161a.setBadgeIconType(0).setSettingsText(r22).setShortcutId(r22).setTimeoutAfter(0L).setGroupAlertBehavior(0);
            if (!TextUtils.isEmpty(sVar.f30156r)) {
                this.f30161a.setSound(r22).setDefaults(0).setLights(0, 0, 0).setVibrate(r22);
            }
        }
        if (i19 >= 28) {
            Iterator<f0> it3 = sVar.f30141c.iterator();
            while (it3.hasNext()) {
                f0 next3 = it3.next();
                Notification.Builder builder3 = this.f30161a;
                next3.getClass();
                builder3.addPerson(f0.a.b(next3));
            }
        }
        if (Build.VERSION.SDK_INT >= 29) {
            this.f30161a.setAllowSystemGeneratedContextualActions(sVar.f30157s);
            this.f30161a.setBubbleMetadata(null);
        }
    }
}
