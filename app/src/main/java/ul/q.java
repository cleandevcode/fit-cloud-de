package ul;

import bi.z0;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;

/* loaded from: classes2.dex */
public class q extends o {
    public static final boolean F(Collection collection, Object obj) {
        gm.l.f(collection, "<this>");
        return collection.contains(obj);
    }

    public static final ArrayList G(Iterable iterable) {
        gm.l.f(iterable, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final <T> T H(List<? extends T> list) {
        gm.l.f(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(0);
    }

    public static final <T> T I(List<? extends T> list) {
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static final Object J(int i10, List list) {
        gm.l.f(list, "<this>");
        if (i10 < 0 || i10 > h7.a.k(list)) {
            return null;
        }
        return list.get(i10);
    }

    public static final void K(Iterable iterable, StringBuilder sb2, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, fm.l lVar) {
        gm.l.f(iterable, "<this>");
        gm.l.f(charSequence, "separator");
        gm.l.f(charSequence2, "prefix");
        gm.l.f(charSequence3, "postfix");
        gm.l.f(charSequence4, "truncated");
        sb2.append(charSequence2);
        int i11 = 0;
        for (Object obj : iterable) {
            i11++;
            if (i11 > 1) {
                sb2.append(charSequence);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            }
            bi.r.e(sb2, obj, lVar);
        }
        if (i10 >= 0 && i11 > i10) {
            sb2.append(charSequence4);
        }
        sb2.append(charSequence3);
    }

    public static String M(Iterable iterable, String str, String str2, String str3, fm.l lVar, int i10) {
        if ((i10 & 1) != 0) {
            str = ", ";
        }
        String str4 = str;
        String str5 = (i10 & 2) != 0 ? "" : str2;
        String str6 = (i10 & 4) != 0 ? "" : str3;
        int i11 = (i10 & 8) != 0 ? -1 : 0;
        String str7 = (i10 & 16) != 0 ? "..." : null;
        fm.l lVar2 = (i10 & 32) != 0 ? null : lVar;
        gm.l.f(iterable, "<this>");
        gm.l.f(str4, "separator");
        gm.l.f(str5, "prefix");
        gm.l.f(str6, "postfix");
        gm.l.f(str7, "truncated");
        StringBuilder sb2 = new StringBuilder();
        K(iterable, sb2, str4, str5, str6, i11, str7, lVar2);
        String sb3 = sb2.toString();
        gm.l.e(sb3, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb3;
    }

    public static final <T> T N(List<? extends T> list) {
        gm.l.f(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(h7.a.k(list));
    }

    public static final <T> T O(List<? extends T> list) {
        gm.l.f(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    public static final Comparable P(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            Comparable comparable = (Comparable) it.next();
            while (it.hasNext()) {
                Comparable comparable2 = (Comparable) it.next();
                if (comparable.compareTo(comparable2) < 0) {
                    comparable = comparable2;
                }
            }
            return comparable;
        }
        return null;
    }

    public static final ArrayList Q(Iterable iterable, Collection collection) {
        gm.l.f(collection, "<this>");
        if (!(iterable instanceof Collection)) {
            ArrayList arrayList = new ArrayList(collection);
            n.D(iterable, arrayList);
            return arrayList;
        }
        Collection collection2 = (Collection) iterable;
        ArrayList arrayList2 = new ArrayList(collection2.size() + collection.size());
        arrayList2.addAll(collection);
        arrayList2.addAll(collection2);
        return arrayList2;
    }

    public static final ArrayList R(Collection collection, Object obj) {
        gm.l.f(collection, "<this>");
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(obj);
        return arrayList;
    }

    public static final <T> List<T> S(Iterable<? extends T> iterable) {
        gm.l.f(iterable, "<this>");
        if (!(iterable instanceof Collection) || ((Collection) iterable).size() > 1) {
            List<T> a02 = a0(iterable);
            Collections.reverse(a02);
            return a02;
        }
        return Y(iterable);
    }

    public static final List T(List list) {
        if (list.size() <= 1) {
            return Y(list);
        }
        Object[] array = list.toArray(new Comparable[0]);
        gm.l.d(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        Comparable[] comparableArr = (Comparable[]) array;
        if (comparableArr.length > 1) {
            Arrays.sort(comparableArr);
        }
        return i.t(comparableArr);
    }

    public static final List U(List list, Comparator comparator) {
        if (list.size() <= 1) {
            return Y(list);
        }
        Object[] array = list.toArray(new Object[0]);
        gm.l.d(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        if (array.length > 1) {
            Arrays.sort(array, comparator);
        }
        return i.t(array);
    }

    public static final List V(List list, int i10) {
        boolean z10;
        int i11 = 0;
        if (i10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (i10 == 0) {
                return s.f28879a;
            }
            if (i10 >= list.size()) {
                return Y(list);
            }
            if (i10 == 1) {
                return h7.a.p(H(list));
            }
            ArrayList arrayList = new ArrayList(i10);
            for (Object obj : list) {
                arrayList.add(obj);
                i11++;
                if (i11 == i10) {
                    break;
                }
            }
            return h7.a.u(arrayList);
        }
        throw new IllegalArgumentException(androidx.activity.i.a("Requested element count ", i10, " is less than zero.").toString());
    }

    public static final void W(Iterable iterable, AbstractCollection abstractCollection) {
        gm.l.f(iterable, "<this>");
        for (Object obj : iterable) {
            abstractCollection.add(obj);
        }
    }

    public static final int[] X(Collection<Integer> collection) {
        gm.l.f(collection, "<this>");
        int[] iArr = new int[collection.size()];
        int i10 = 0;
        for (Integer num : collection) {
            iArr[i10] = num.intValue();
            i10++;
        }
        return iArr;
    }

    public static final <T> List<T> Y(Iterable<? extends T> iterable) {
        gm.l.f(iterable, "<this>");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size != 1) {
                    return Z(collection);
                }
                return h7.a.p(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
            }
            return s.f28879a;
        }
        return h7.a.u(a0(iterable));
    }

    public static final ArrayList Z(Collection collection) {
        gm.l.f(collection, "<this>");
        return new ArrayList(collection);
    }

    public static final <T> List<T> a0(Iterable<? extends T> iterable) {
        gm.l.f(iterable, "<this>");
        if (iterable instanceof Collection) {
            return Z((Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        W(iterable, arrayList);
        return arrayList;
    }

    public static final <T> Set<T> b0(Iterable<? extends T> iterable) {
        gm.l.f(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            W(iterable, linkedHashSet);
            int size = linkedHashSet.size();
            return size != 0 ? size != 1 ? linkedHashSet : z0.o(linkedHashSet.iterator().next()) : u.f28881a;
        }
        Collection collection = (Collection) iterable;
        int size2 = collection.size();
        if (size2 != 0) {
            if (size2 == 1) {
                return z0.o(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
            }
            LinkedHashSet linkedHashSet2 = new LinkedHashSet(ih.v.j(collection.size()));
            W(iterable, linkedHashSet2);
            return linkedHashSet2;
        }
        return u.f28881a;
    }

    public static final ArrayList c0(List list) {
        Iterator it;
        int i10;
        boolean z10;
        gm.l.f(list, "<this>");
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i11 = size / 5;
            if (size % 5 == 0) {
                i10 = 0;
            } else {
                i10 = 1;
            }
            ArrayList arrayList = new ArrayList(i11 + i10);
            int i12 = 0;
            while (true) {
                if (i12 >= 0 && i12 < size) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    int i13 = size - i12;
                    if (5 <= i13) {
                        i13 = 5;
                    }
                    ArrayList arrayList2 = new ArrayList(i13);
                    for (int i14 = 0; i14 < i13; i14++) {
                        arrayList2.add(list.get(i14 + i12));
                    }
                    arrayList.add(arrayList2);
                    i12 += 5;
                } else {
                    return arrayList;
                }
            }
        } else {
            ArrayList arrayList3 = new ArrayList();
            Iterator it2 = list.iterator();
            gm.l.f(it2, "iterator");
            if (!it2.hasNext()) {
                it = r.f28878a;
            } else {
                b0 b0Var = new b0(5, 5, it2, false, true, null);
                nm.h hVar = new nm.h();
                hVar.f22490c = mf.a0.e(hVar, hVar, b0Var);
                it = hVar;
            }
            while (it.hasNext()) {
                arrayList3.add((List) it.next());
            }
            return arrayList3;
        }
    }
}
