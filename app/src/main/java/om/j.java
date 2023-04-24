package om;

import fm.p;
import gm.m;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class j extends m implements p<CharSequence, Integer, tl.f<? extends Integer, ? extends Integer>> {

    /* renamed from: b */
    public final /* synthetic */ List<String> f23640b;

    /* renamed from: c */
    public final /* synthetic */ boolean f23641c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(List<String> list, boolean z10) {
        super(2);
        this.f23640b = list;
        this.f23641c = z10;
    }

    @Override // fm.p
    public final tl.f<? extends Integer, ? extends Integer> A(CharSequence charSequence, Integer num) {
        Object obj;
        tl.f fVar;
        Object obj2;
        CharSequence charSequence2 = charSequence;
        int intValue = num.intValue();
        gm.l.f(charSequence2, "$this$$receiver");
        List<String> list = this.f23640b;
        boolean z10 = this.f23641c;
        if (!z10 && list.size() == 1) {
            int size = list.size();
            if (size != 0) {
                if (size == 1) {
                    String str = list.get(0);
                    int h02 = l.h0(charSequence2, str, intValue, false, 4);
                    if (h02 >= 0) {
                        fVar = new tl.f(Integer.valueOf(h02), str);
                    }
                    fVar = null;
                } else {
                    throw new IllegalArgumentException("List has more than one element.");
                }
            } else {
                throw new NoSuchElementException("List is empty.");
            }
        } else {
            if (intValue < 0) {
                intValue = 0;
            }
            lm.j jVar = new lm.j(intValue, charSequence2.length());
            if (charSequence2 instanceof String) {
                int i10 = jVar.f20072b;
                int i11 = jVar.f20073c;
                if ((i11 > 0 && intValue <= i10) || (i11 < 0 && i10 <= intValue)) {
                    while (true) {
                        Iterator<T> it = list.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                obj2 = it.next();
                                String str2 = (String) obj2;
                                if (h.X(0, str2, (String) charSequence2, intValue, str2.length(), z10)) {
                                    break;
                                }
                            } else {
                                obj2 = null;
                                break;
                            }
                        }
                        String str3 = (String) obj2;
                        if (str3 != null) {
                            fVar = new tl.f(Integer.valueOf(intValue), str3);
                            break;
                        } else if (intValue == i10) {
                            break;
                        } else {
                            intValue += i11;
                        }
                    }
                }
                fVar = null;
            } else {
                int i12 = jVar.f20072b;
                int i13 = jVar.f20073c;
                if ((i13 > 0 && intValue <= i12) || (i13 < 0 && i12 <= intValue)) {
                    while (true) {
                        Iterator<T> it2 = list.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                obj = it2.next();
                                String str4 = (String) obj;
                                if (l.n0(str4, 0, charSequence2, intValue, str4.length(), z10)) {
                                    break;
                                }
                            } else {
                                obj = null;
                                break;
                            }
                        }
                        String str5 = (String) obj;
                        if (str5 != null) {
                            fVar = new tl.f(Integer.valueOf(intValue), str5);
                            break;
                        } else if (intValue == i12) {
                            break;
                        } else {
                            intValue += i13;
                        }
                    }
                }
                fVar = null;
            }
        }
        if (fVar == null) {
            return null;
        }
        return new tl.f<>(fVar.f28286a, Integer.valueOf(((String) fVar.f28287b).length()));
    }
}
