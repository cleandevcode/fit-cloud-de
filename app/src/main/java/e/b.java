package e;

import android.content.Intent;
import androidx.activity.ComponentActivity;
import e.a;
import gm.l;
import ih.v;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import tl.f;
import ul.i;
import ul.t;
import ul.z;

/* loaded from: classes.dex */
public final class b extends a<String[], Map<String, Boolean>> {
    @Override // e.a
    public final Intent a(ComponentActivity componentActivity, Object obj) {
        String[] strArr = (String[]) obj;
        l.f(componentActivity, "context");
        l.f(strArr, "input");
        Intent putExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr);
        l.e(putExtra, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
        return putExtra;
    }

    @Override // e.a
    public final a.C0233a b(ComponentActivity componentActivity, Object obj) {
        String[] strArr = (String[]) obj;
        l.f(componentActivity, "context");
        l.f(strArr, "input");
        boolean z10 = true;
        if (strArr.length == 0) {
            return new a.C0233a(t.f28880a);
        }
        int length = strArr.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                break;
            }
            if (!(y0.a.a(componentActivity, strArr[i10]) == 0)) {
                z10 = false;
                break;
            }
            i10++;
        }
        if (z10) {
            int j10 = v.j(strArr.length);
            if (j10 < 16) {
                j10 = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(j10);
            for (String str : strArr) {
                linkedHashMap.put(str, Boolean.TRUE);
            }
            return new a.C0233a(linkedHashMap);
        }
        return null;
    }

    @Override // e.a
    public final Object c(Intent intent, int i10) {
        boolean z10;
        if (i10 == -1 && intent != null) {
            String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
            if (intArrayExtra != null && stringArrayExtra != null) {
                ArrayList arrayList = new ArrayList(intArrayExtra.length);
                for (int i11 : intArrayExtra) {
                    if (i11 == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    arrayList.add(Boolean.valueOf(z10));
                }
                ArrayList A = i.A(stringArrayExtra);
                Iterator it = A.iterator();
                Iterator it2 = arrayList.iterator();
                ArrayList arrayList2 = new ArrayList(Math.min(ul.l.B(A, 10), ul.l.B(arrayList, 10)));
                while (it.hasNext() && it2.hasNext()) {
                    arrayList2.add(new f(it.next(), it2.next()));
                }
                return z.F(arrayList2);
            }
        }
        return t.f28880a;
    }
}
