/*
 * File: 		Priorizer.java
 * Date: 		Sep 20, 2015
 *
 * Copyright 2015 Constantin Lazari. All rights reserved.
 *
 * Unless required by applicable law or agreed to in writing, this software
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.
 */
package ch.lazari.decider.priorize.api;

import java.util.List;
import java.util.Set;

/**
 * Functionality Definition for any priorizer
 */
public interface Priorizer {

	List<Titled> priorize(Set<Titled> list);
	
	List<Titled> priorize(List<Titled> list);
}
