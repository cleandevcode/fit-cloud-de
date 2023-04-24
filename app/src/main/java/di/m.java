package di;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.github.kilnn.tool.widget.SquareImageView;
import com.topstep.fitcloud.pro.databinding.ItemSportUiItemBinding;
import com.topstep.fitcloud.pro.model.sport.push.SportPacket;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class m extends RecyclerView.e<a> {

    /* renamed from: d */
    public final l f13080d;

    /* renamed from: e */
    public b f13081e;

    /* renamed from: f */
    public List<SportPacket> f13082f;

    /* renamed from: g */
    public ArrayList f13083g;

    /* renamed from: h */
    public int f13084h = 0;

    /* loaded from: classes2.dex */
    public static final class a extends RecyclerView.b0 {

        /* renamed from: u */
        public final ItemSportUiItemBinding f13085u;

        public a(ItemSportUiItemBinding itemSportUiItemBinding) {
            super(itemSportUiItemBinding.getRoot());
            this.f13085u = itemSportUiItemBinding;
        }
    }

    /* loaded from: classes2.dex */
    public interface b {
        void a(SportPacket sportPacket);
    }

    public m(l lVar) {
        this.f13080d = lVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int e() {
        int i10 = this.f13084h;
        this.f13080d.getClass();
        if (i10 == 0) {
            List<SportPacket> list = this.f13082f;
            if (list != null) {
                return list.size();
            }
        } else {
            ArrayList arrayList = this.f13083g;
            if (arrayList != null) {
                return arrayList.size();
            }
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void n(a aVar, int i10) {
        List list;
        a aVar2 = aVar;
        Context context = aVar2.f2927a.getContext();
        int i11 = this.f13084h;
        this.f13080d.getClass();
        if (i11 == 0) {
            list = this.f13082f;
        } else {
            list = this.f13083g;
        }
        if (list != null) {
            SportPacket sportPacket = (SportPacket) list.get(i10);
            SquareImageView squareImageView = aVar2.f13085u.img;
            gm.l.e(squareImageView, "holder.viewBind.img");
            a.f.g(squareImageView, sportPacket.getIconUrl(), 12);
            TextView textView = aVar2.f13085u.tvName;
            l lVar = this.f13080d;
            gm.l.e(context, "context");
            lVar.getClass();
            textView.setText(l.a(context, sportPacket));
            p.b.g(aVar2.f2927a, new n(aVar2, this, list));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final RecyclerView.b0 o(RecyclerView recyclerView, int i10) {
        gm.l.f(recyclerView, "parent");
        ItemSportUiItemBinding inflate = ItemSportUiItemBinding.inflate(LayoutInflater.from(recyclerView.getContext()), recyclerView, false);
        gm.l.e(inflate, "inflate(\n               …rent, false\n            )");
        return new a(inflate);
    }

    public final void y(int i10) {
        List<SportPacket> list;
        int[] iArr;
        this.f13084h = i10;
        this.f13083g = null;
        this.f13080d.getClass();
        if (i10 != 0 && (list = this.f13082f) != null) {
            l lVar = this.f13080d;
            int i11 = this.f13084h;
            lVar.getClass();
            if (i11 == 1) {
                iArr = new int[]{0, 1, 2, 3, 4, 23, 33, 67, 79, 24, 12};
            } else if (i11 == 2) {
                iArr = new int[]{26, 48, 49, 51, 63, 64, 81, 112};
            } else if (i11 == 3) {
                iArr = new int[]{50, 65, 66, 71, 72, 73, 78, 80, 83, 97};
            } else if (i11 == 4) {
                iArr = new int[]{9, 13, 40, 57, 58, 87, 88, 90, 91, 106, 110, 113, 114, 102};
            } else if (i11 == 5) {
                iArr = new int[]{5, 7, 8, 11, 17, 18, 19, 20, 31, 34, 37, 52, 53, 54, 55, 68, 70, 75, 86, 93, 94, 28};
            } else if (i11 == 6) {
                iArr = new int[]{6, 35, 39, 56, 59, 61, 89, 99, 100, 101, 103, 104, 105};
            } else if (i11 == 7) {
                iArr = new int[]{22, 29, 30, 36, 45, 46, 47, 60, 82, 95, 107, 108, 109};
            } else if (i11 == 8) {
                iArr = new int[]{10, 16, 27, 32, 38, 41, 42, 43, 44, 62, 69, 74, 76, 77, 84, 85, 92, 96, 98, 111, 115};
            } else {
                throw new IllegalArgumentException();
            }
            ArrayList arrayList = new ArrayList();
            for (SportPacket sportPacket : list) {
                int i12 = 0;
                int length = iArr.length;
                while (true) {
                    if (i12 < length) {
                        if (sportPacket.getSportUiType() == iArr[i12]) {
                            arrayList.add(sportPacket);
                            break;
                        }
                        i12++;
                    }
                }
            }
            this.f13083g = arrayList;
        }
    }
}
