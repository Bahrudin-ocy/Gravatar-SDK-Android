package com.gravatar.quickeditor.ui.components

import androidx.compose.material3.AlertDialog
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import com.gravatar.quickeditor.R

@Composable
internal fun AvatarDeletionConfirmationDialog(onConfirm: () -> Unit, onDismiss: () -> Unit) {
    AlertDialog(
        onDismissRequest = onDismiss,
        title = {
            Text(text = stringResource(R.string.gravatar_qe_avatar_delete_confirmation_title))
        },
        text = {
            Text(text = stringResource(R.string.gravatar_qe_avatar_delete_confirmation_message))
        },
        confirmButton = {
            TextButton(onClick = onConfirm) {
                Text(
                    text = stringResource(R.string.gravatar_qe_avatar_delete_confirmation_confirm),
                    color = MaterialTheme.colorScheme.error,
                )
            }
        },
        dismissButton = {
            TextButton(onClick = onDismiss) {
                Text(text = stringResource(R.string.gravatar_qe_avatar_delete_confirmation_cancel))
            }
        },
    )
}
