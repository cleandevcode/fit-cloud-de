package com.topstep.fitcloud.pro.ui.friend;

import androidx.lifecycle.l0;
import kg.k;
import kotlin.Metadata;
import tl.l;

@Metadata
/* loaded from: classes2.dex */
public final class FriendAddViewModel extends v6.b<ei.a<l>> {

    /* renamed from: j */
    public final tg.c f11479j;

    /* renamed from: k */
    public final k f11480k;

    /* renamed from: l */
    public final long f11481l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FriendAddViewModel(l0 l0Var, tg.c cVar, k kVar, long j10) {
        super(new ei.a(null, 1, null), l0Var);
        gm.l.f(l0Var, "savedStateHandle");
        gm.l.f(cVar, "friendRepository");
        gm.l.f(kVar, "userInfoRepository");
        this.f11479j = cVar;
        this.f11480k = kVar;
        this.f11481l = j10;
    }
}
