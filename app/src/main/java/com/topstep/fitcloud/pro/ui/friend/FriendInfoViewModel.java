package com.topstep.fitcloud.pro.ui.friend;

import androidx.lifecycle.l0;
import ei.a0;
import gm.l;
import kotlin.Metadata;

@Metadata
/* loaded from: classes2.dex */
public final class FriendInfoViewModel extends v6.b<a0> {

    /* renamed from: j */
    public final tg.c f11573j;

    /* renamed from: k */
    public final kg.g f11574k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FriendInfoViewModel(l0 l0Var, tg.c cVar, kg.g gVar) {
        super(new a0(null, 1, null), l0Var);
        l.f(l0Var, "savedStateHandle");
        l.f(cVar, "friendRepository");
        l.f(gVar, "unitConfigRepository");
        this.f11573j = cVar;
        this.f11574k = gVar;
    }
}
