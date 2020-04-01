/*! ******************************************************************************
 *
 * Pentaho Data Integration
 *
 * Copyright (C) 2002-2017 by Hitachi Vantara : http://www.pentaho.com
 *
 *******************************************************************************
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 ******************************************************************************/

package org.apache.hop.pipeline.steps.normaliser;

import org.apache.hop.core.row.RowMetaInterface;
import org.apache.hop.pipeline.step.BaseStepData;
import org.apache.hop.pipeline.step.StepDataInterface;

import java.util.List;
import java.util.Map;

/**
 * @author Matt
 * @since 24-jan-2005
 */
public class NormaliserData extends BaseStepData implements StepDataInterface {
  public List<String> type_occ;
  public int maxlen;
  public List<Integer> copy_fieldnrs;
  Map<String, List<Integer>> typeToFieldIndex;

  public RowMetaInterface inputRowMeta;
  public RowMetaInterface outputRowMeta;

  public NormaliserData() {
    super();

    type_occ = null;
  }

}