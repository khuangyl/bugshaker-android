/**
 * Copyright 2016 Stuart Kent
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License.
 *
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */
package com.github.stkent.bugshaker.flow.email.screenshot;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.support.annotation.NonNull;

import com.github.stkent.bugshaker.utilities.Logger;

import rx.Observable;

public final class BasicScreenShotProvider extends BaseScreenshotProvider {

    public BasicScreenShotProvider(
            @NonNull final Context applicationContext,
            @NonNull final Logger logger) {

        super(applicationContext, logger);
    }

    @NonNull
    @Override
    public Observable<Bitmap> getScreenshotBitmap(@NonNull final Activity activity) {
        return getNonMapViewsBitmap(activity);
    }

}
