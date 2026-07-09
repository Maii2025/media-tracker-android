package edu.metrostate.ics342.mediatracker.ui.components

//This file is for extra credit
//6 — Status Badges
//The Want To / In Progress / Finished badges are custom Composables.
// Each must use its correct container color as background and its on-container color for text.
// See the color table above.

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import edu.metrostate.ics342.mediatracker.theme.WantTo
import androidx.compose.ui.unit.dp
import edu.metrostate.ics342.mediatracker.theme.InProgressContainer
import edu.metrostate.ics342.mediatracker.theme.InProgress
import edu.metrostate.ics342.mediatracker.theme.Finished
import edu.metrostate.ics342.mediatracker.theme.FinishedContainer
import edu.metrostate.ics342.mediatracker.R
import edu.metrostate.ics342.mediatracker.theme.WantToContainer
import androidx.compose.ui.res.stringResource
import androidx.compose.material3.Text

@Composable
fun WantToBadge(){
    Text(
        text= stringResource(R.string.status_want_to),
        color= WantTo,
        modifier= Modifier
            .background(WantToContainer, RoundedCornerShape(8.dp))
            .padding(horizontal = 8.dp, vertical= 4.dp),
        style= MaterialTheme.typography.labelSmall
    )
}
@Composable
fun InProgressBadge(){
    Text(
        text= stringResource(R.string.status_in_progress),
        color= InProgress,
        modifier= Modifier
            .background(InProgressContainer, RoundedCornerShape(8.dp))
            .padding(horizontal = 8.dp, vertical= 4.dp),
        style= MaterialTheme.typography.labelSmall
    )
}

@Composable
fun FinishedBadge(){
    Text(
        text= stringResource(R.string.status_finished),
        color= Finished,
        modifier= Modifier
            .background(FinishedContainer, RoundedCornerShape(8.dp))
            .padding(horizontal = 8.dp, vertical= 4.dp),
        style= MaterialTheme.typography.labelSmall
    )
}
