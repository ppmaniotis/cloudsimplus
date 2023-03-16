/*
 * CloudSim Plus: A modern, highly-extensible and easier-to-use Framework for
 * Modeling and Simulation of Cloud Computing Infrastructures and Services.
 * http://cloudsimplus.org
 *
 *     Copyright (C) 2023 IBM Research.
 *     Author: Pavlos Maniotis
 *
 *     This file is part of CloudSim Plus.
 *
 *     CloudSim Plus is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     CloudSim Plus is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License
 *     along with CloudSim Plus. If not, see <http://www.gnu.org/licenses/>.
 */
package org.cloudsimplus.vmplacementgroup;

import org.cloudsimplus.vmplacementgroups.VmAllocationPolicyBestFitWithPlacementGroups_LRRL;
import org.cloudsimplus.vmplacementgroups.VmAllocationPolicyChicSchedAllPack;

/**
 * An enumerator for the scope of a {@link VmPlacementGroup}.
 *
 * @see VmPlacementGroupAffinityType
 * @see VmPlacementGroupEnforcement
 * @see VmAllocationPolicyBestFitWithPlacementGroups_LRRL
 * @see VmAllocationPolicyChicSchedAllPack
 *
 * @since CloudSim Plus 7.3.2
 *
 * @author Pavlos Maniotis
 */
public enum VmPlacementGroupScope {

	/**
	 * Denotes that the scope of the group is the Top-of-Rack switch
	 */
	SWITCH,

	/**
	 * Denotes that the scope of the group is the host
	 */
	HOST
}