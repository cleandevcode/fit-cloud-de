package com.topstep.fitcloud.pro.shared.data.entity.data;

import android.support.v4.media.d;
import com.topstep.fitcloud.pro.model.data.SportGoal;
import d4.b;
import gm.l;
import java.util.List;
import kotlin.Metadata;
import mf.u;

@Metadata
@u(generateAdapter = true)
/* loaded from: classes2.dex */
public final class SportGoalCache {

    /* renamed from: a */
    public final List<SportGoal> f10072a;

    /* renamed from: b */
    public final int f10073b;

    /* renamed from: c */
    public final long f10074c;

    public SportGoalCache(int i10, long j10, List list) {
        this.f10072a = list;
        this.f10073b = i10;
        this.f10074c = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SportGoalCache) {
            SportGoalCache sportGoalCache = (SportGoalCache) obj;
            return l.a(this.f10072a, sportGoalCache.f10072a) && this.f10073b == sportGoalCache.f10073b && this.f10074c == sportGoalCache.f10074c;
        }
        return false;
    }

    public final int hashCode() {
        List<SportGoal> list = this.f10072a;
        int hashCode = list == null ? 0 : list.hashCode();
        long j10 = this.f10074c;
        return (((hashCode * 31) + this.f10073b) * 31) + ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        StringBuilder a10 = d.a("SportGoalCache(goals=");
        a10.append(this.f10072a);
        a10.append(", dirty=");
        a10.append(this.f10073b);
        a10.append(", syncSuccessTime=");
        return b.a(a10, this.f10074c, ')');
    }
}
