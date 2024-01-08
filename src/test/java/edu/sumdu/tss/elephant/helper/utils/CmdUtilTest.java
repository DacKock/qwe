package edu.sumdu.tss.elephant.helper.utils;

import edu.sumdu.tss.elephant.helper.exception.BackupException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CmdUtilTest {

    @Test
    public void execSuccessfulCommandNoException() {
        String command = "echo Hello, World!";

        assertDoesNotThrow(() -> CmdUtil.exec(command));
    }

    @Test
    public void execFailedCommandBackupExceptionThrown() {
        String command = "invalid-command";

        BackupException exception = assertThrows(BackupException.class, () -> CmdUtil.exec(command));
        assertTrue(exception.getMessage().contains("invalid-command"));
    }

    @Test
    public void execCommandWithIOExceptionBackupExceptionThrown() {
        String command = "simulate-io-exception";

        BackupException exception = assertThrows(BackupException.class, () -> CmdUtil.exec(command));
        assertTrue(exception.getMessage().contains("simulate-io-exception"));
    }
}