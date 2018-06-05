--
-- Base de données :  `lorann`
--

DELIMITER $$
--
-- Procédures
--
DROP PROCEDURE IF EXISTS `get_elements_by_level`$$
CREATE DEFINER=`root`@`localhost` PROCEDURE `get_elements_by_level` (IN `lvlID` INT)  BEGIN
SELECT element.id , element.type , element.x , element.y , element.direction , element.lvl_number FROM element WHERE element.lvl_number = lvlID;
END$$

DROP PROCEDURE IF EXISTS `get_levels`$$
CREATE DEFINER=`root`@`localhost` PROCEDURE `get_levels` ()  BEGIN
SELECT *
FROM lvl
ORDER BY lvl.number;
END$$

DROP PROCEDURE IF EXISTS `get_level_by_id`$$
CREATE DEFINER=`root`@`localhost` PROCEDURE `get_level_by_id` (IN `id` INT)  BEGIN
SELECT * FROM lvl WHERE lvl.id = id LIMIT 1;
END$$

DELIMITER ;

