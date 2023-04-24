package z9;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.chip.ChipGroup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import z9.h;

/* loaded from: classes.dex */
public final class b<T extends h<T>> {

    /* renamed from: a */
    public final HashMap f32069a = new HashMap();

    /* renamed from: b */
    public final HashSet f32070b = new HashSet();

    /* renamed from: c */
    public a f32071c;

    /* renamed from: d */
    public boolean f32072d;

    /* renamed from: e */
    public boolean f32073e;

    /* loaded from: classes.dex */
    public interface a {
    }

    public final boolean a(h<T> hVar) {
        int id2 = hVar.getId();
        if (this.f32070b.contains(Integer.valueOf(id2))) {
            return false;
        }
        h<T> hVar2 = (h) this.f32069a.get(Integer.valueOf(c()));
        if (hVar2 != null) {
            e(hVar2, false);
        }
        boolean add = this.f32070b.add(Integer.valueOf(id2));
        if (!hVar.isChecked()) {
            hVar.setChecked(true);
        }
        return add;
    }

    public final ArrayList b(ViewGroup viewGroup) {
        HashSet hashSet = new HashSet(this.f32070b);
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if ((childAt instanceof h) && hashSet.contains(Integer.valueOf(childAt.getId()))) {
                arrayList.add(Integer.valueOf(childAt.getId()));
            }
        }
        return arrayList;
    }

    public final int c() {
        if (!this.f32072d || this.f32070b.isEmpty()) {
            return -1;
        }
        return ((Integer) this.f32070b.iterator().next()).intValue();
    }

    public final void d() {
        a aVar = this.f32071c;
        if (aVar != null) {
            new HashSet(this.f32070b);
            ChipGroup chipGroup = ((com.google.android.material.chip.b) aVar).f6420a;
            ChipGroup.d dVar = chipGroup.f6388g;
            if (dVar != null) {
                chipGroup.f6389h.b(chipGroup);
                ChipGroup.a aVar2 = (ChipGroup.a) dVar;
                ChipGroup chipGroup2 = ChipGroup.this;
                if (chipGroup2.f6389h.f32072d) {
                    aVar2.getClass();
                    chipGroup2.getCheckedChipId();
                    throw null;
                }
            }
        }
    }

    public final boolean e(h<T> hVar, boolean z10) {
        int id2 = hVar.getId();
        if (this.f32070b.contains(Integer.valueOf(id2))) {
            if (z10 && this.f32070b.size() == 1 && this.f32070b.contains(Integer.valueOf(id2))) {
                hVar.setChecked(true);
                return false;
            }
            boolean remove = this.f32070b.remove(Integer.valueOf(id2));
            if (hVar.isChecked()) {
                hVar.setChecked(false);
            }
            return remove;
        }
        return false;
    }
}
