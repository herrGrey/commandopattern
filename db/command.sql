-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Erstellungszeit: 05. Nov 2018 um 10:51
-- Server-Version: 10.1.35-MariaDB
-- PHP-Version: 7.2.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Datenbank: `command`
--

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `tbl_gericht`
--

CREATE TABLE `tbl_gericht` (
  `g_id` int(11) NOT NULL,
  `g_name` varchar(255) NOT NULL,
  `g_preis` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Daten für Tabelle `tbl_gericht`
--

INSERT INTO `tbl_gericht` (`g_id`, `g_name`, `g_preis`) VALUES
(1, 'Pizza', '5'),
(2, 'Döner', '4'),
(3, 'Burger', '4');

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `tbl_rechnung`
--

CREATE TABLE `tbl_rechnung` (
  `rechnung_id` int(11) NOT NULL,
  `tbl_gericht_g_id` int(11) NOT NULL,
  `tbl_tisch_tisch_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Daten für Tabelle `tbl_rechnung`
--

INSERT INTO `tbl_rechnung` (`rechnung_id`, `tbl_gericht_g_id`, `tbl_tisch_tisch_id`) VALUES
(3, 1, 3),
(4, 2, 3),
(5, 1, 3),
(6, 3, 3),
(7, 1, 2),
(8, 2, 2),
(9, 1, 2),
(10, 2, 2),
(12, 1, 1),
(15, 3, 1),
(17, 1, 1);

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `tbl_tisch`
--

CREATE TABLE `tbl_tisch` (
  `tisch_id` int(11) NOT NULL,
  `tisch_name` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Daten für Tabelle `tbl_tisch`
--

INSERT INTO `tbl_tisch` (`tisch_id`, `tisch_name`) VALUES
(1, '21'),
(2, '22'),
(3, '23');

--
-- Indizes der exportierten Tabellen
--

--
-- Indizes für die Tabelle `tbl_gericht`
--
ALTER TABLE `tbl_gericht`
  ADD PRIMARY KEY (`g_id`);

--
-- Indizes für die Tabelle `tbl_rechnung`
--
ALTER TABLE `tbl_rechnung`
  ADD PRIMARY KEY (`rechnung_id`),
  ADD KEY `fk_tbl_gericht_has_tbl_tisch_tbl_gericht` (`tbl_gericht_g_id`),
  ADD KEY `fk_tbl_gericht_has_tbl_tisch_tbl_tisch1` (`tbl_tisch_tisch_id`);

--
-- Indizes für die Tabelle `tbl_tisch`
--
ALTER TABLE `tbl_tisch`
  ADD PRIMARY KEY (`tisch_id`);

--
-- AUTO_INCREMENT für exportierte Tabellen
--

--
-- AUTO_INCREMENT für Tabelle `tbl_gericht`
--
ALTER TABLE `tbl_gericht`
  MODIFY `g_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT für Tabelle `tbl_rechnung`
--
ALTER TABLE `tbl_rechnung`
  MODIFY `rechnung_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=18;

--
-- AUTO_INCREMENT für Tabelle `tbl_tisch`
--
ALTER TABLE `tbl_tisch`
  MODIFY `tisch_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- Constraints der exportierten Tabellen
--

--
-- Constraints der Tabelle `tbl_rechnung`
--
ALTER TABLE `tbl_rechnung`
  ADD CONSTRAINT `fk_tbl_gericht_has_tbl_tisch_tbl_gericht` FOREIGN KEY (`tbl_gericht_g_id`) REFERENCES `tbl_gericht` (`g_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_tbl_gericht_has_tbl_tisch_tbl_tisch1` FOREIGN KEY (`tbl_tisch_tisch_id`) REFERENCES `tbl_tisch` (`tisch_id`) ON DELETE NO ACTION ON UPDATE NO ACTION;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
