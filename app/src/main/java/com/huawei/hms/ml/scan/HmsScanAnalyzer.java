package com.huawei.hms.ml.scan;

import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import com.huawei.hms.hmsscankit.ScanUtil;
import com.huawei.hms.ml.scan.HmsScanAnalyzerOptions;
import com.huawei.hms.mlsdk.common.MLAnalyzer;
import com.huawei.hms.mlsdk.common.MLFrame;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ThreadPoolExecutor;
import lb.a;
import mb.b;
import mb.c;
import x2.i;

/* loaded from: classes.dex */
public class HmsScanAnalyzer extends MLAnalyzer<HmsScan> {
    private static final String TAG = "HmsScanAnalyzer";
    private Context mContext;
    private HmsScanAnalyzerOptions mlVisionScanDetectorOptions;

    /* loaded from: classes.dex */
    public static class Creator {
        private Context mContext;
        private HmsScanAnalyzerOptions mOptions;

        public Creator() {
            this.mContext = a.f19423b.f19424a;
        }

        public Creator(Context context) {
            this.mContext = context;
        }

        public HmsScanAnalyzer create() {
            Context context = this.mContext;
            HmsScanAnalyzerOptions hmsScanAnalyzerOptions = this.mOptions;
            if (hmsScanAnalyzerOptions == null) {
                hmsScanAnalyzerOptions = new HmsScanAnalyzerOptions.Creator().setHmsScanTypes(0, new int[0]).create();
            }
            return new HmsScanAnalyzer(context, hmsScanAnalyzerOptions);
        }

        public Creator setHmsScanTypes(int i10, int... iArr) {
            this.mOptions = new HmsScanAnalyzerOptions.Creator().setHmsScanTypes(i10, iArr).create();
            return this;
        }

        public Creator setHmsScanTypes(HmsScanAnalyzerOptions hmsScanAnalyzerOptions) {
            if (hmsScanAnalyzerOptions == null) {
                hmsScanAnalyzerOptions = new HmsScanAnalyzerOptions.Creator().setHmsScanTypes(0, new int[0]).create();
            }
            this.mOptions = hmsScanAnalyzerOptions;
            return this;
        }
    }

    public HmsScanAnalyzer() {
        a aVar = a.f19423b;
        if (aVar != null) {
            this.mContext = aVar.f19424a;
        } else {
            com.huawei.hms.scankit.util.a.d(TAG, "AGConnectInstanceImpl contect is null");
        }
    }

    private HmsScanAnalyzer(Context context, HmsScanAnalyzerOptions hmsScanAnalyzerOptions) {
        this.mContext = context;
        this.mlVisionScanDetectorOptions = hmsScanAnalyzerOptions;
    }

    @Override // com.huawei.hms.mlsdk.common.MLAnalyzer
    public SparseArray<HmsScan> analyseFrame(MLFrame mLFrame) {
        if (mLFrame == null) {
            return new SparseArray<>();
        }
        HmsScan[] detectForHmsDector = ScanUtil.detectForHmsDector(this.mContext, mLFrame, this.mlVisionScanDetectorOptions);
        SparseArray<HmsScan> sparseArray = new SparseArray<>();
        for (HmsScan hmsScan : detectForHmsDector) {
            if (hmsScan != null && !TextUtils.isEmpty(hmsScan.originalValue)) {
                sparseArray.append(hmsScan.originalValue.hashCode(), hmsScan);
            }
        }
        return sparseArray;
    }

    public b<List<HmsScan>> analyzInAsyn(final MLFrame mLFrame) {
        Callable<List<HmsScan>> callable = new Callable<List<HmsScan>>() { // from class: com.huawei.hms.ml.scan.HmsScanAnalyzer.1
            @Override // java.util.concurrent.Callable
            public List<HmsScan> call() {
                if (mLFrame == null) {
                    return null;
                }
                HmsScan[] detectForHmsDector = ScanUtil.detectForHmsDector(HmsScanAnalyzer.this.mContext, mLFrame, HmsScanAnalyzer.this.mlVisionScanDetectorOptions);
                ArrayList arrayList = new ArrayList();
                for (HmsScan hmsScan : detectForHmsDector) {
                    if (hmsScan != null && !TextUtils.isEmpty(hmsScan.originalValue)) {
                        arrayList.add(hmsScan);
                    }
                }
                return arrayList;
            }
        };
        ThreadPoolExecutor threadPoolExecutor = c.f20419b.f20420a;
        i iVar = new i(6, 0);
        try {
            threadPoolExecutor.execute(new nb.c(iVar, callable));
        } catch (Exception unused) {
            iVar.g();
        }
        return (nb.b) iVar.f30183b;
    }

    public void destory() {
        super.destroy();
    }

    @Override // com.huawei.hms.mlsdk.common.MLAnalyzer
    public boolean isAvailable() {
        return ScanUtil.isScanAvailable(this.mContext);
    }

    public HmsScanAnalyzer(HmsScanAnalyzerOptions hmsScanAnalyzerOptions) {
        this.mContext = a.f19423b.f19424a;
        this.mlVisionScanDetectorOptions = hmsScanAnalyzerOptions;
    }
}
