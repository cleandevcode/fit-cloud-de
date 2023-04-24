package ba;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.MenuItem;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.m;
import androidx.transition.k;
import j9.b;
import z9.i;

/* loaded from: classes.dex */
public final class e implements j {

    /* renamed from: a */
    public d f4113a;

    /* renamed from: b */
    public boolean f4114b = false;

    /* renamed from: c */
    public int f4115c;

    /* loaded from: classes.dex */
    public static class a implements Parcelable {
        public static final Parcelable.Creator<a> CREATOR = new C0056a();

        /* renamed from: a */
        public int f4116a;

        /* renamed from: b */
        public i f4117b;

        /* renamed from: ba.e$a$a */
        /* loaded from: classes.dex */
        public class C0056a implements Parcelable.Creator<a> {
            @Override // android.os.Parcelable.Creator
            public final a createFromParcel(Parcel parcel) {
                return new a(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final a[] newArray(int i10) {
                return new a[i10];
            }
        }

        public a() {
        }

        public a(Parcel parcel) {
            this.f4116a = parcel.readInt();
            this.f4117b = (i) parcel.readParcelable(a.class.getClassLoader());
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f4116a);
            parcel.writeParcelable(this.f4117b, 0);
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public final void c(androidx.appcompat.view.menu.f fVar, boolean z10) {
    }

    @Override // androidx.appcompat.view.menu.j
    public final void d(boolean z10) {
        boolean z11;
        x2.a aVar;
        if (this.f4114b) {
            return;
        }
        if (z10) {
            this.f4113a.a();
            return;
        }
        d dVar = this.f4113a;
        androidx.appcompat.view.menu.f fVar = dVar.B;
        if (fVar != null && dVar.f4091f != null) {
            int size = fVar.size();
            if (size != dVar.f4091f.length) {
                dVar.a();
                return;
            }
            int i10 = dVar.f4092g;
            for (int i11 = 0; i11 < size; i11++) {
                MenuItem item = dVar.B.getItem(i11);
                if (item.isChecked()) {
                    dVar.f4092g = item.getItemId();
                    dVar.f4093h = i11;
                }
            }
            if (i10 != dVar.f4092g && (aVar = dVar.f4086a) != null) {
                k.a(dVar, aVar);
            }
            int i12 = dVar.f4090e;
            int size2 = dVar.B.l().size();
            if (i12 != -1 ? i12 == 0 : size2 > 3) {
                z11 = true;
            } else {
                z11 = false;
            }
            for (int i13 = 0; i13 < size; i13++) {
                dVar.A.f4114b = true;
                dVar.f4091f[i13].setLabelVisibilityMode(dVar.f4090e);
                dVar.f4091f[i13].setShifting(z11);
                dVar.f4091f[i13].d((h) dVar.B.getItem(i13));
                dVar.A.f4114b = false;
            }
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public final boolean e() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public final boolean g(h hVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public final int getId() {
        return this.f4115c;
    }

    @Override // androidx.appcompat.view.menu.j
    public final void h(Context context, androidx.appcompat.view.menu.f fVar) {
        this.f4113a.B = fVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.appcompat.view.menu.j
    public final void i(Parcelable parcelable) {
        if (parcelable instanceof a) {
            d dVar = this.f4113a;
            a aVar = (a) parcelable;
            int i10 = aVar.f4116a;
            int size = dVar.B.size();
            int i11 = 0;
            while (true) {
                if (i11 >= size) {
                    break;
                }
                MenuItem item = dVar.B.getItem(i11);
                if (i10 == item.getItemId()) {
                    dVar.f4092g = i10;
                    dVar.f4093h = i11;
                    item.setChecked(true);
                    break;
                }
                i11++;
            }
            Context context = this.f4113a.getContext();
            i iVar = aVar.f4117b;
            SparseArray sparseArray = new SparseArray(iVar.size());
            for (int i12 = 0; i12 < iVar.size(); i12++) {
                int keyAt = iVar.keyAt(i12);
                b.a aVar2 = (b.a) iVar.valueAt(i12);
                if (aVar2 != null) {
                    sparseArray.put(keyAt, new j9.a(context, aVar2));
                } else {
                    throw new IllegalArgumentException("BadgeDrawable's savedState cannot be null");
                }
            }
            d dVar2 = this.f4113a;
            dVar2.getClass();
            for (int i13 = 0; i13 < sparseArray.size(); i13++) {
                int keyAt2 = sparseArray.keyAt(i13);
                if (dVar2.f4102q.indexOfKey(keyAt2) < 0) {
                    dVar2.f4102q.append(keyAt2, sparseArray.get(keyAt2));
                }
            }
            ba.a[] aVarArr = dVar2.f4091f;
            if (aVarArr != null) {
                for (ba.a aVar3 : aVarArr) {
                    aVar3.setBadge(dVar2.f4102q.get(aVar3.getId()));
                }
            }
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public final boolean k(m mVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public final Parcelable l() {
        a aVar = new a();
        aVar.f4116a = this.f4113a.getSelectedItemId();
        SparseArray<j9.a> badgeDrawables = this.f4113a.getBadgeDrawables();
        i iVar = new i();
        for (int i10 = 0; i10 < badgeDrawables.size(); i10++) {
            int keyAt = badgeDrawables.keyAt(i10);
            j9.a valueAt = badgeDrawables.valueAt(i10);
            if (valueAt != null) {
                iVar.put(keyAt, valueAt.f17528e.f17537a);
            } else {
                throw new IllegalArgumentException("badgeDrawable cannot be null");
            }
        }
        aVar.f4117b = iVar;
        return aVar;
    }

    @Override // androidx.appcompat.view.menu.j
    public final boolean m(h hVar) {
        return false;
    }
}
