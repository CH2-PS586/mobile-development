package com.dicoding.jetreward.ui.screen.welcome

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.dicoding.jetreward.R

@Composable
fun WelcomeScreen(
    modifier: Modifier = Modifier,
    navigateToLogin: (Int) -> Unit,
    navigateToRegister: (Int) -> Unit
){
    WelcomeContent(navigateToLogin = navigateToLogin, navigateToRegister = navigateToRegister)
}

@Composable
fun WelcomeContent(
    modifier: Modifier = Modifier,
    navigateToLogin: (Int) -> Unit,
    navigateToRegister: (Int) -> Unit
) {
    Column(
        modifier = modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.drawable.welcome_screen),
            contentDescription = "Welcome Screen",
            modifier = Modifier
                .padding(top = 48.dp, bottom = 16.dp)
                .clip(CircleShape)
        )
        Text(
            text = stringResource(R.string.welcome_text),
            style = MaterialTheme.typography.titleLarge,
            modifier = Modifier
                .padding(bottom = 8.dp)
                .testTag("username")
        )

    }

}
