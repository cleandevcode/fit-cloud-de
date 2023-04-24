package com.mob.tools.gui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ImageView;
import com.mob.tools.MobLog;
import com.mob.tools.utils.BitmapHelper;

/* loaded from: classes.dex */
public class ScaledImageView extends ImageView implements View.OnTouchListener {
    private static final int DRAG_1 = 1;
    private static final int DRAG_2 = 2;
    private static final int NONE = 0;
    private static final int ZOOM = 3;
    private Bitmap bitmap;
    private float distSquare;
    private float[] downPoint;
    private int dragScrollMinDistSquare;
    private OnMatrixChangedListener listener;
    private Matrix matrix;
    private int mode;
    private Matrix savedMatrix;

    /* loaded from: classes.dex */
    public interface OnMatrixChangedListener {
        void onMactrixChage(Matrix matrix);
    }

    public ScaledImageView(Context context) {
        super(context);
        init(context);
    }

    public ScaledImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context);
    }

    public ScaledImageView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        init(context);
    }

    private void init(Context context) {
        int scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        this.dragScrollMinDistSquare = scaledTouchSlop * scaledTouchSlop;
        setOnTouchListener(this);
    }

    public Bitmap getCropedBitmap(Rect rect) {
        try {
            Bitmap captureView = BitmapHelper.captureView(this, getWidth(), getHeight());
            if (captureView == null) {
                MobLog.getInstance().w("ivPhoto.getDrawingCache() returns null");
                return null;
            }
            Bitmap createBitmap = Bitmap.createBitmap(captureView, rect.left, rect.top, rect.width(), rect.height());
            captureView.recycle();
            return createBitmap;
        } catch (Throwable th2) {
            MobLog.getInstance().w(th2);
            return null;
        }
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        int action;
        Matrix matrix;
        float f10;
        float f11;
        float f12;
        try {
            action = motionEvent.getAction();
        } catch (Throwable th2) {
            MobLog.getInstance().w(th2);
        }
        if (action != 0) {
            if (action == 1) {
                OnMatrixChangedListener onMatrixChangedListener = this.listener;
                if (onMatrixChangedListener != null) {
                    onMatrixChangedListener.onMactrixChage(this.matrix);
                }
                float x10 = motionEvent.getX(0) - this.downPoint[0];
                float y10 = motionEvent.getY(0) - this.downPoint[1];
                if (this.mode == 1 && (y10 * y10) + (x10 * x10) <= this.dragScrollMinDistSquare) {
                    performClick();
                }
                this.mode = 0;
            } else if (action != 2) {
                if (action == 5) {
                    float[] fArr = {motionEvent.getX(0), motionEvent.getY(0)};
                    float y11 = motionEvent.getY(1);
                    float f13 = fArr[0] - new float[]{motionEvent.getX(1), y11}[0];
                    float f14 = fArr[1] - y11;
                    this.distSquare = (f14 * f14) + (f13 * f13);
                } else if (action == 6) {
                    this.downPoint = new float[]{motionEvent.getX(1), motionEvent.getY(1)};
                    this.savedMatrix.set(this.matrix);
                    this.mode = 2;
                } else if (action == 261) {
                    float[] fArr2 = {motionEvent.getX(0), motionEvent.getY(0)};
                    float y12 = motionEvent.getY(1);
                    float f15 = fArr2[0] - new float[]{motionEvent.getX(1), y12}[0];
                    float f16 = fArr2[1] - y12;
                    this.distSquare = (f16 * f16) + (f15 * f15);
                } else if (action != 262) {
                    return false;
                } else {
                    this.downPoint = new float[]{motionEvent.getX(0), motionEvent.getY(0)};
                    this.savedMatrix.set(this.matrix);
                }
                this.mode = 3;
            } else {
                int i10 = this.mode;
                if (i10 == 1) {
                    float[] fArr3 = {motionEvent.getX(0), motionEvent.getY(0)};
                    this.matrix.set(this.savedMatrix);
                    matrix = this.matrix;
                    float f17 = fArr3[0];
                    float[] fArr4 = this.downPoint;
                    f10 = f17 - fArr4[0];
                    f11 = fArr3[1];
                    f12 = fArr4[1];
                } else if (i10 == 2) {
                    float[] fArr5 = {motionEvent.getX(1), motionEvent.getY(1)};
                    this.matrix.set(this.savedMatrix);
                    matrix = this.matrix;
                    float f18 = fArr5[0];
                    float[] fArr6 = this.downPoint;
                    f10 = f18 - fArr6[0];
                    f11 = fArr5[1];
                    f12 = fArr6[1];
                } else if (i10 == 3) {
                    float[] fArr7 = {motionEvent.getX(0), motionEvent.getY(0)};
                    float y13 = motionEvent.getY(1);
                    float[] fArr8 = {motionEvent.getX(1), y13};
                    float f19 = fArr7[0] - fArr8[0];
                    float f20 = fArr7[1] - y13;
                    this.matrix.set(this.savedMatrix);
                    float sqrt = (float) Math.sqrt(((f20 * f20) + (f19 * f19)) / this.distSquare);
                    this.matrix.postScale(sqrt, sqrt, (fArr7[0] + fArr8[0]) / 2.0f, (fArr7[1] + fArr8[1]) / 2.0f);
                }
                matrix.postTranslate(f10, f11 - f12);
            }
            setImageMatrix(this.matrix);
            return true;
        }
        Matrix matrix2 = new Matrix();
        this.matrix = matrix2;
        matrix2.set(getImageMatrix());
        Matrix matrix3 = new Matrix();
        this.savedMatrix = matrix3;
        matrix3.set(this.matrix);
        this.downPoint = new float[]{motionEvent.getX(0), motionEvent.getY(0)};
        this.mode = 1;
        setImageMatrix(this.matrix);
        return true;
    }

    public void rotateLeft() {
        try {
            Matrix matrix = new Matrix();
            this.matrix = matrix;
            float[] fArr = {0.0f, 1.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
            matrix.setValues(fArr);
            Bitmap bitmap = this.bitmap;
            Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), this.bitmap.getHeight(), this.matrix, true);
            if (createBitmap != null && !createBitmap.isRecycled()) {
                this.bitmap.recycle();
                this.bitmap = createBitmap;
            }
            setImageBitmap(this.bitmap);
            Matrix matrix2 = new Matrix();
            this.matrix = matrix2;
            matrix2.set(getImageMatrix());
            this.matrix.getValues(fArr);
            int[] iArr = {getWidth(), getHeight()};
            float height = fArr[4] * this.bitmap.getHeight();
            fArr[2] = (iArr[0] - new float[]{fArr[0] * this.bitmap.getWidth(), height}[0]) / 2.0f;
            fArr[5] = (iArr[1] - height) / 2.0f;
            this.matrix.setValues(fArr);
            OnMatrixChangedListener onMatrixChangedListener = this.listener;
            if (onMatrixChangedListener != null) {
                onMatrixChangedListener.onMactrixChage(this.matrix);
            }
            setImageMatrix(this.matrix);
        } catch (Throwable th2) {
            MobLog.getInstance().w(th2);
        }
    }

    public void rotateRight() {
        try {
            Matrix matrix = new Matrix();
            this.matrix = matrix;
            float[] fArr = {0.0f, -1.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
            matrix.setValues(fArr);
            Bitmap bitmap = this.bitmap;
            Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), this.bitmap.getHeight(), this.matrix, true);
            if (createBitmap != null && !createBitmap.isRecycled()) {
                this.bitmap.recycle();
                this.bitmap = createBitmap;
            }
            setImageBitmap(this.bitmap);
            Matrix matrix2 = new Matrix();
            this.matrix = matrix2;
            matrix2.set(getImageMatrix());
            this.matrix.getValues(fArr);
            int[] iArr = {getWidth(), getHeight()};
            float height = fArr[4] * this.bitmap.getHeight();
            fArr[2] = (iArr[0] - new float[]{fArr[0] * this.bitmap.getWidth(), height}[0]) / 2.0f;
            fArr[5] = (iArr[1] - height) / 2.0f;
            this.matrix.setValues(fArr);
            OnMatrixChangedListener onMatrixChangedListener = this.listener;
            if (onMatrixChangedListener != null) {
                onMatrixChangedListener.onMactrixChage(this.matrix);
            }
            setImageMatrix(this.matrix);
        } catch (Throwable th2) {
            MobLog.getInstance().w(th2);
        }
    }

    public void setBitmap(Bitmap bitmap) {
        this.bitmap = bitmap;
        setImageBitmap(bitmap);
        int[] iArr = {getWidth(), getHeight()};
        int[] iArr2 = {this.bitmap.getWidth(), this.bitmap.getHeight()};
        int[] fixRect = BitmapHelper.fixRect(iArr2, iArr);
        int[] iArr3 = {(iArr[0] - fixRect[0]) / 2, (iArr[1] - fixRect[1]) / 2};
        float[] fArr = {fixRect[0] / iArr2[0], fixRect[1] / iArr2[1]};
        Matrix matrix = new Matrix();
        this.matrix = matrix;
        matrix.set(getImageMatrix());
        this.matrix.postScale(fArr[0], fArr[1]);
        this.matrix.postTranslate(iArr3[0], iArr3[1]);
        OnMatrixChangedListener onMatrixChangedListener = this.listener;
        if (onMatrixChangedListener != null) {
            onMatrixChangedListener.onMactrixChage(this.matrix);
        }
        setImageMatrix(this.matrix);
    }

    public void setOnMatrixChangedListener(OnMatrixChangedListener onMatrixChangedListener) {
        this.listener = onMatrixChangedListener;
        Matrix matrix = this.matrix;
        if (matrix != null) {
            if (onMatrixChangedListener != null) {
                onMatrixChangedListener.onMactrixChage(matrix);
            }
            setImageMatrix(this.matrix);
        }
    }

    public void zoomIn() {
        Matrix matrix = new Matrix();
        this.matrix = matrix;
        matrix.set(getImageMatrix());
        this.matrix.postScale(1.072f, 1.072f);
        OnMatrixChangedListener onMatrixChangedListener = this.listener;
        if (onMatrixChangedListener != null) {
            onMatrixChangedListener.onMactrixChage(this.matrix);
        }
        setImageMatrix(this.matrix);
    }

    public void zoomOut() {
        Matrix matrix = new Matrix();
        this.matrix = matrix;
        matrix.set(getImageMatrix());
        this.matrix.postScale(0.933f, 0.933f);
        OnMatrixChangedListener onMatrixChangedListener = this.listener;
        if (onMatrixChangedListener != null) {
            onMatrixChangedListener.onMactrixChage(this.matrix);
        }
        setImageMatrix(this.matrix);
    }
}
