package androidx.appcompat.widget;

import android.app.Activity;
import android.content.ClipData;
import android.os.Build;
import android.text.Selection;
import android.text.Spannable;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;
import k1.c;

/* loaded from: classes.dex */
public final class o0 {
    public static boolean a(DragEvent dragEvent, TextView textView, Activity activity) {
        c.b c0314c;
        activity.requestDragAndDropPermissions(dragEvent);
        int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
        textView.beginBatchEdit();
        try {
            Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
            ClipData clipData = dragEvent.getClipData();
            if (Build.VERSION.SDK_INT >= 31) {
                c0314c = new c.a(clipData, 3);
            } else {
                c0314c = new c.C0314c(clipData, 3);
            }
            k1.o0.l(textView, c0314c.build());
            textView.endBatchEdit();
            return true;
        } catch (Throwable th2) {
            textView.endBatchEdit();
            throw th2;
        }
    }

    public static boolean b(DragEvent dragEvent, View view, Activity activity) {
        c.b c0314c;
        activity.requestDragAndDropPermissions(dragEvent);
        ClipData clipData = dragEvent.getClipData();
        if (Build.VERSION.SDK_INT >= 31) {
            c0314c = new c.a(clipData, 3);
        } else {
            c0314c = new c.C0314c(clipData, 3);
        }
        k1.o0.l(view, c0314c.build());
        return true;
    }
}
