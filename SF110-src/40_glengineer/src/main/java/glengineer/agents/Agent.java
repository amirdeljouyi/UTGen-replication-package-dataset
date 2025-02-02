package glengineer.agents;

import glengineer.agents.settings.Settings;

import javax.swing.GroupLayout.Group;


/**
 * It is known that the {@code GroupLayout} class
 * forces the user to specify all desirable settings of elements and groups
 * exactly at the moment of their addition to the parent groups.
 * The {@code GroupLayoutEngineer} offers a special tool
 * of defining the elements' layout hierarchy, the scheme.
 * However, schemes do not support any means
 * of specifying additional settings of the elements,
 * so, the settings are specified separately
 * by additional methods of the engineer.
 * <p>
 * Since the moment of translating the scheme
 * into the hierarchy of its elements
 * is not precisely the moment of applying the user settings to that elements,
 * the {@code GroupLayoutEngineer} translates the scheme
 * into its own hierarchy of elements,
 * then applies the additional settings,
 * and then, finally, converts the hierarchy
 * to the required hierarchy in the resulting {@code GroupLayout}.
 * <p>
 * Each element of the hierarchy created by the {@code GroupLayoutEngineer}
 * represents the corresponding element (component, group, or gap)
 * in the resulting {@code GroupLayout} hierarchy.
 * The elements of the hierarchy created by the {@code GroupLayoutEngineer}
 * are called <b>agents</b> of the corresponding components, groups or gaps.
 * The agents remember the settings of the corresponding elements,
 * their names (for components), and the agents
 * of children elements (for groups).
 * <p>
 * This class, {@code Agent}, is the base class for the hierarchy.
 * 
 * @see	ComponentAgent
 * @see	GroupAgent
 * @see	ParallelGroupAgent
 * @see	SequentialGroupAgent
 * @see	TopSequentialGroupAgent
 * @see	GapAgent
 * @see	PreferredGapAgent
 * @see	ContainerGapAgent
 * @see	TemporaryGapAgent
 */
public abstract class Agent
{
	/**
	 * ��������� ��������������� ��������.
	 */
	protected Settings settings;
	
	/**
	 * ���������� �������� ������� ���������� (�� ����������)
	 * � �������������� ����������, ���� ��� ����� ������,
	 * ��� �������� ����������, ���� �������������� ���������.
	 */
	public abstract String getFirstName();
	
	/**
	 * ���������� �������� ���������� ���������� (�� ����������)
	 * � �������������� ����������, ���� ��� ����� ������,
	 * ��� �������� ����������, ���� �������������� ���������.
	 */
	public abstract String getLastName();
	
	/**
	 * ���������, �������� �� ������ ����� ������� ����������
	 * � ��������� ���������.
	 * 
	 * @param componentName	�������� ����������
	 * @return				{@code true}, ���� �����
	 * 						������������ ���� ���������
	 */
	public abstract boolean isComponent(String componentName);
	
	/**
	 * ���������, ������������ �� ������ ����� ������, ����������������
	 * ���������� ���������� � ���������� � ��������� �����������.
	 * 
	 * @param firstName	�������� ���������� ���������� ������
	 * @param lastName	�������� ��������� ���������� ������
	 * @return			{@code true}, ���� ������������
	 */
	public abstract boolean isGroup(String firstName, String lastName);
	
	/**
	 * Verifies whether this agent represents a gap of some type.
	 */
	public abstract boolean isGap();
	
	/**
	 * ����� ��������� ������� ����������� � ����� �� ������� ����������
	 * �� ���. ��� ������� ����������� ����� ���������� {@code false},
	 * �.�. ������� ��� �� ��������.
	 * 
	 * @param agent	�����, ������������ � ������
	 * @return		{@code true}, ���� ����� ����� �� �� ��� (�����),
	 * 				��� � ������ �����.
	 */
	public abstract boolean equals(Agent agent);
	
	/**
	 * Searches for the component agent with the specified name
	 * among this agent and all agents of lower level (if this is a group).
	 * 
	 * @return	the agent found or null if not found.
	 */
	public abstract ComponentAgent findDependingComponentByName(
			String componentName);

	/**
	 * Searches for the group agent with the specified first and last names
	 * among this agent and all agents of lower level (if this is a group).
	 * 
	 * @return	the agent found or null if not found.
	 */
	public abstract GroupAgent findDependingGroupByNames(
			String firstName, String lastName);
	public abstract ParallelGroupAgent findDependingParallelGroupByNames(
			String firstName, String lastName);
	public abstract SequentialGroupAgent findDependingSequentialGroupByNames(
			String firstName, String lastName);

	/**
	 * Adds the 
	 * 
	 * ��������� �� �������������� ���������� � ������,
	 * ��������� ��� ��������� ����������� �� �� ��������� ���������
	 * ����� ���������� {@code ComponentAdder}, � ��� ��������
	 * ����� �������� - ������ ���������� {@code GroupCreator}.
	 * <p>
	 * ���������� �������-���������.
	 * 
	 * @param parentGroup	������, ���� ����������� �������������� ����������.
	 * @param adder			��������� ��� ��������� ����������� �� ���������.
	 * @param creator		��������� ��� �������� ����� ��������.
	 */
	public abstract void addContentToGroup(
			Group parentGroup, GroupCreatorAndElementAdder creatorAndAdder );
	
	/**
	 * ����� �������� ������.
	 * <p>
	 * ��� ���������� ��� ������ ����, ����������, ��� ��������,
	 * ��� ������ - �������� � ���������� � ��������� �����������,
	 * � ��� ����������� - �� ���������.
	 */
	public abstract String toString();
	
}
