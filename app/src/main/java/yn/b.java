package yn;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;

/* loaded from: classes2.dex */
public enum b {
    /* JADX INFO: Fake field, exist only in values array */
    EF0("NO_ERROR", "No error"),
    f31815c("OPEN_FAILED", "Failed to open given input"),
    /* JADX INFO: Fake field, exist only in values array */
    EF4("READ_FAILED", "Failed to read from given input"),
    /* JADX INFO: Fake field, exist only in values array */
    EF6("NOT_GIF_FILE", "Data is not in GIF format"),
    /* JADX INFO: Fake field, exist only in values array */
    EF8("NO_SCRN_DSCR", "No screen descriptor detected"),
    /* JADX INFO: Fake field, exist only in values array */
    EF10("NO_IMAG_DSCR", "No image descriptor detected"),
    /* JADX INFO: Fake field, exist only in values array */
    EF12("NO_COLOR_MAP", "Neither global nor local color map found"),
    /* JADX INFO: Fake field, exist only in values array */
    EF11("WRONG_RECORD", "Wrong record type detected"),
    /* JADX INFO: Fake field, exist only in values array */
    EF9("DATA_TOO_BIG", "Number of pixels bigger than width * height"),
    /* JADX INFO: Fake field, exist only in values array */
    EF7("NOT_ENOUGH_MEM", "Failed to allocate required memory"),
    /* JADX INFO: Fake field, exist only in values array */
    EF5("CLOSE_FAILED", "Failed to close given input"),
    /* JADX INFO: Fake field, exist only in values array */
    EF3("NOT_READABLE", "Given file was not opened for read"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1("IMAGE_DEFECT", "Image is defective, decoding aborted"),
    /* JADX INFO: Fake field, exist only in values array */
    EF3("EOF_TOO_SOON", "Image EOF detected before image complete"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1("NO_FRAMES", "No frames found, at least one frame required"),
    /* JADX INFO: Fake field, exist only in values array */
    EF3("INVALID_SCR_DIMS", "Invalid screen size, dimensions must be positive"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1("INVALID_IMG_DIMS", "Invalid image size, dimensions must be positive"),
    /* JADX INFO: Fake field, exist only in values array */
    EF3("IMG_NOT_CONFINED", "Image size exceeds screen size"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1("REWIND_FAILED", "Input source rewind failed, animation stopped"),
    /* JADX INFO: Fake field, exist only in values array */
    EF3("INVALID_BYTE_BUFFER", "Invalid and/or indirect byte buffer specified"),
    f31816d(GrsBaseInfo.CountryCodeSource.UNKNOWN, "Unknown error");
    

    /* renamed from: a */
    public final String f31818a;

    /* renamed from: b */
    public int f31819b;

    b(String str, String str2) {
        this.f31819b = r2;
        this.f31818a = str2;
    }
}
