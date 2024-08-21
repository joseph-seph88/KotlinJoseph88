package ko.joseph88.captaingame

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import ko.joseph88.captaingame.ui.theme.CaptainGameTheme
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment
import kotlin.random.Random

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CaptainGameTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    CaptainGame()
                }
            }
        }
    }

    @Composable
    fun CaptainGame() {
        var treasureFound by remember { mutableStateOf(0) }
        var direction by remember { mutableStateOf("North") }
        var StateCurrent by remember { mutableStateOf("") }
        var CrewState by remember { mutableStateOf(100) }

        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        )
        {
            Text(text = "Treasure Found Value >> ${treasureFound}")
            Text(text = "Direction Is >> ${direction}")
            Text(text = "${StateCurrent}")
            Spacer(modifier = Modifier.height(16.dp))

            Box(
                modifier = Modifier
                    .width((CrewState * 2).dp) // CrewState 값에 따라 박스 크기 조절
                    .height(20.dp)
                    .background(Color.Green),
                contentAlignment = Alignment.Center
            ) {
                Text(text = "HP: ${CrewState}", color = Color.White)
            }
            Spacer(modifier = Modifier.height(16.dp))



            Button(onClick = {
                direction = "East"
                CrewState -= 1
                if (Random.nextBoolean()) {
                    treasureFound += 1
                    CrewState += 2
                    StateCurrent = "Found Treasure!"
                } else {
                    StateCurrent = "Coming Storm!"
                }
            }) {
                Text(text = "Sail East")

            }
            Spacer(modifier = Modifier.height(16.dp))

            Button(onClick = {
                direction = "West"
                CrewState -= 1

                if (Random.nextBoolean()) {
                    treasureFound += 1
                    CrewState += 2

                    StateCurrent = "Found Treasure!"

                } else {
                    StateCurrent = "Coming Storm!"
                }
            }) {
                Text(text = "Sail West")
            }
            Spacer(modifier = Modifier.height(16.dp))

            Button(onClick = {
                direction = "South"
                CrewState -= 1

                if (Random.nextBoolean()) {
                    treasureFound += 1
                    CrewState += 2

                    StateCurrent = "Found Treasure!"

                } else {
                    StateCurrent = "Coming Storm!"

                }
            }) {
                Text(text = "Sail South")
            }
            Spacer(modifier = Modifier.height(16.dp))

            Button(onClick = {
                direction = "North"
                CrewState -= 1

                if (Random.nextBoolean()) {
                    treasureFound += 1
                    CrewState += 2

                    StateCurrent = "Found Treasure!"

                } else {
                    StateCurrent = "Coming Storm!"

                }
            }) {
                Text(text = "Sail North")
            }
        }
    }
}

