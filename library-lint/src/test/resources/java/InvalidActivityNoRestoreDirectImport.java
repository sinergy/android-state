/* *****************************************************************************
 * Copyright (c) 2017 Evernote Corporation.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Ralf Wondratschek - initial version
 *******************************************************************************/
package com.evernote.android.state.lint;

import android.app.Activity;
import android.os.Bundle;

import com.evernote.android.state.StateSaver.saveInstanceState;

/**
 * @author rwondratschek
 */
public class InvalidActivityNoRestoreDirectImport extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        saveInstanceState(this, outState);
    }
}
