package no.nordicsemi.android.kotlin.ble.client.details

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Bluetooth
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import no.nordicsemi.android.common.theme.view.SectionTitle
import no.nordicsemi.android.kotlin.ble.app.client.R

@Composable
fun CharacteristicView(state: BlinkyState, onButtonClick: () -> Unit) {
    OutlinedCard(modifier = Modifier.padding(horizontal = 16.dp)) {
        Column(modifier = Modifier.padding(16.dp)) {
            SectionTitle(
                icon = Icons.Default.Bluetooth,
                title = stringResource(id = R.string.device)
            )

            Spacer(modifier = Modifier.size(8.dp))

            Text(text = stringResource(id = R.string.led, state.isLedOn))
            Text(text = stringResource(id = R.string.button, state.isButtonPressed))

            Button(onClick = { onButtonClick() }) {
                Text(text = stringResource(id = R.string.turn_led))
            }
        }
    }
}
