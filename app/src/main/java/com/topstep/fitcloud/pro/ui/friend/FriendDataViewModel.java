package com.topstep.fitcloud.pro.ui.friend;

import android.os.Parcelable;
import androidx.fragment.app.h1;
import androidx.lifecycle.l0;
import com.topstep.fitcloud.pro.model.friend.Friend;
import ei.n;
import ei.o;
import ei.p;
import gm.l;
import java.io.Serializable;
import kotlin.Metadata;

@Metadata
/* loaded from: classes2.dex */
public final class FriendDataViewModel extends v6.b<p> {

    /* renamed from: j */
    public final tg.c f11510j;

    /* renamed from: k */
    public final tg.a f11511k;

    /* renamed from: l */
    public final kg.g f11512l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FriendDataViewModel(l0 l0Var, tg.c cVar, tg.a aVar, kg.g gVar) {
        super(new p(null, null, 3, null), l0Var);
        l.f(l0Var, "savedStateHandle");
        l.f(cVar, "friendRepository");
        l.f(aVar, "friendDataRepository");
        l.f(gVar, "unitConfigRepository");
        this.f11510j = cVar;
        this.f11511k = aVar;
        this.f11512l = gVar;
        if (l0Var.f2739a.containsKey("friend")) {
            if (!Parcelable.class.isAssignableFrom(Friend.class) && !Serializable.class.isAssignableFrom(Friend.class)) {
                throw new UnsupportedOperationException(h1.a(Friend.class, new StringBuilder(), " must implement Parcelable or Serializable or must be an Enum."));
            }
            Friend friend = (Friend) l0Var.f2739a.get("friend");
            if (friend != null) {
                v6.b.f(this, new n(this, friend.getUserId(), null), null, o.f13773b, 3);
                return;
            }
            throw new IllegalArgumentException("Argument \"friend\" is marked as non-null but was passed a null value");
        }
        throw new IllegalArgumentException("Required argument \"friend\" is missing and does not have an android:defaultValue");
    }
}
