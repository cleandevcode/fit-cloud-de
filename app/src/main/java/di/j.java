package di;

import android.content.res.ColorStateList;
import android.view.LayoutInflater;
import androidx.recyclerview.widget.RecyclerView;
import com.topstep.fitcloud.pro.databinding.ItemSportUiCategoryBinding;

/* loaded from: classes2.dex */
public final class j extends RecyclerView.e<a> {

    /* renamed from: d */
    public final l f13071d;

    /* renamed from: e */
    public final int[] f13072e = {0, 1, 2, 3, 4, 5, 6, 7, 8};

    /* renamed from: f */
    public b f13073f;

    /* renamed from: g */
    public int f13074g;

    /* renamed from: h */
    public Integer f13075h;

    /* renamed from: i */
    public ColorStateList f13076i;

    /* loaded from: classes2.dex */
    public static final class a extends RecyclerView.b0 {

        /* renamed from: u */
        public final ItemSportUiCategoryBinding f13077u;

        public a(ItemSportUiCategoryBinding itemSportUiCategoryBinding) {
            super(itemSportUiCategoryBinding.getRoot());
            this.f13077u = itemSportUiCategoryBinding;
        }
    }

    /* loaded from: classes2.dex */
    public interface b {
        void a(int i10);
    }

    public j(l lVar) {
        this.f13071d = lVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int e() {
        return this.f13072e.length;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x006c  */
    @Override // androidx.recyclerview.widget.RecyclerView.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void n(di.j.a r7, int r8) {
        /*
            r6 = this;
            di.j$a r7 = (di.j.a) r7
            android.view.View r0 = r7.f2927a
            android.content.Context r0 = r0.getContext()
            com.topstep.fitcloud.pro.databinding.ItemSportUiCategoryBinding r1 = r7.f13077u
            android.widget.TextView r1 = r1.tvName
            java.lang.String r2 = "holder.viewBind.tvName"
            gm.l.e(r1, r2)
            di.l r2 = r6.f13071d
            java.lang.String r3 = "context"
            gm.l.e(r0, r3)
            int[] r3 = r6.f13072e
            r3 = r3[r8]
            r2.getClass()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "sport_ui_category_00"
            r2.append(r4)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            android.content.res.Resources r3 = r0.getResources()
            java.lang.String r4 = "string"
            java.lang.String r5 = "com.topstep.fitcloudpro"
            int r2 = r3.getIdentifier(r2, r4, r5)     // Catch: java.lang.Exception -> L43
            if (r2 == 0) goto L49
            java.lang.String r2 = r3.getString(r2)     // Catch: java.lang.Exception -> L43
            goto L4a
        L43:
            r2 = move-exception
            do.a$b r3 = p000do.a.f13275a
            r3.q(r2)
        L49:
            r2 = 0
        L4a:
            r1.setText(r2)
            int r2 = r6.f13074g
            r3 = 0
            if (r2 != r8) goto L6c
            java.lang.Integer r8 = r6.f13075h
            if (r8 == 0) goto L5b
            int r8 = r8.intValue()
            goto L68
        L5b:
            r8 = 2130968843(0x7f04010b, float:1.7546351E38)
            int r8 = u9.a.a(r0, r8, r3)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            r6.f13075h = r0
        L68:
            r1.setTextColor(r8)
            goto La0
        L6c:
            android.content.res.ColorStateList r8 = r6.f13076i
            if (r8 != 0) goto L9d
            r8 = 16842806(0x1010036, float:2.369371E-38)
            android.content.res.Resources$Theme r0 = r0.getTheme()
            r2 = 1
            int[] r2 = new int[r2]
            r2[r3] = r8
            android.content.res.TypedArray r8 = r0.obtainStyledAttributes(r2)
            java.lang.String r0 = "context.theme.obtainStyl…ributes(intArrayOf(attr))"
            gm.l.e(r8, r0)
            android.content.res.ColorStateList r0 = r8.getColorStateList(r3)
            r8.recycle()
            if (r0 != 0) goto L9a
            r8 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            android.content.res.ColorStateList r8 = android.content.res.ColorStateList.valueOf(r8)
            java.lang.String r0 = "valueOf(Color.BLACK)"
            gm.l.e(r8, r0)
            goto L9b
        L9a:
            r8 = r0
        L9b:
            r6.f13076i = r8
        L9d:
            r1.setTextColor(r8)
        La0:
            di.k r8 = new di.k
            r8.<init>(r7, r6)
            p.b.g(r1, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: di.j.n(androidx.recyclerview.widget.RecyclerView$b0, int):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final RecyclerView.b0 o(RecyclerView recyclerView, int i10) {
        gm.l.f(recyclerView, "parent");
        ItemSportUiCategoryBinding inflate = ItemSportUiCategoryBinding.inflate(LayoutInflater.from(recyclerView.getContext()), recyclerView, false);
        gm.l.e(inflate, "inflate(\n               …rent, false\n            )");
        return new a(inflate);
    }
}
